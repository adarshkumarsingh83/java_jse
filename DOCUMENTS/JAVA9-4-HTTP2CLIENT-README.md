## JAVA9 NEW FEATURES (21 sept 2017 )

---


## http2 client 
* into in jdk 1.9 
* part of inqubator module jdk.incubator.httpcilent in package jdk.incubator.http 
* after standardization module is changed to java.net.http and package is changed to java.net.http 
* supports http 1 and http2 
* support text and binary daa 
* mulitple request 
* synchronus and asycnchronous 
* java.net.http.HttpClient 
* java.net.http.HttpRequest 
* java.net.http.HttpResponse 
  * statusCode();
  * body();
  * headers();
* not part of jdk we have include this module expliclity 
```
module XXXX{
  requires java.net.http;
}
```

* sample code 
```
// httpcient creation 
HttpClient client = HttpClient.newHttpClient();
// httprequest creation 
HttpRequest req = HttpRequest.newbuilder(new URI("http://hotst/URL")).GET().build();

//send sysnchrounus reqeust to server 
HttpResponse res= client.send(req,HttpResonse.BodyHandler.asString());
//write to file 
client.send(req,HttpResonse.BodyHandler.asFile(Path.get(destinationfile.txt));
or 
//send asysnchrounus reqeust to server 
HttpResponse res= client.sendAsynch(req,HttpResonse.BodyHandler.asString());
//write to file  
client.sendAsynch(req,HttpResonse.BodyHandler.asFile(Path.get(destinationfile.txt));

HttpHeaders heads = resp.headers();
Map<String,List<String>> map = headers.map();
map.forEach((K,V) -> System.out.println(K+" "+V))
h

```

* sample example 
```
.
├── README.md
├── out
└── src
    └── httpclientservice
        ├── HttpClientAsynchronous.java
        ├── HttpClientConcurrentExecutor.java
        ├── HttpClientService.java
        └── module-info.java

* HttpClientService.java
package com.espark.adarsh;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpHeaders;
import java.net.URI;
import java.util.*;
import java.time.Duration;
import java.io.IOException;
public class HttpClientService {
    private static final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_1_1)
            .connectTimeout(Duration.ofSeconds(10))
            .build();
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://google.com"))
                .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        // print response headers
        HttpHeaders headers = response.headers();
        headers.map().forEach((k, v) -> System.out.println(k + ":" + v));
        // print status code
        System.out.println(response.statusCode());
        // print response body
        System.out.println(response.body());
    }
}

* HttpClientAsynchronous
package com.espark.adarsh;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.time.Duration;
public class HttpClientAsynchronous {
    private static final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .connectTimeout(Duration.ofSeconds(10))
            .build();
    public static void main(String[] args) throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://google.com"))
                .setHeader("User-Agent", "Java 11 HttpClient Bot")
                .build();
        CompletableFuture<HttpResponse<String>> response = httpClient.sendAsync(request,
                HttpResponse.BodyHandlers.ofString());
        String result = response.thenApply(HttpResponse::body).get(5, TimeUnit.SECONDS);
        System.out.println(result);
    }
}


* HttpClientConcurrentExecutor.java 
package com.espark.adarsh;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.time.Duration;
public class HttpClientConcurrentExecutor {
    private static final ExecutorService executorService = Executors.newFixedThreadPool(5);
    private static final HttpClient httpClient = HttpClient.newBuilder()
            .executor(executorService)
            .version(HttpClient.Version.HTTP_2)
            .connectTimeout(Duration.ofSeconds(10))
            .build();
    public static void main(String[] args) throws Exception {
        List<URI> targets = Arrays.asList(
                new URI("https://google.com"),
                new URI("https://google.com"),
                new URI("https://google.com"));
        List<CompletableFuture<String>> result = targets.stream()
                .map(url -> httpClient.sendAsync(
                        HttpRequest.newBuilder(url)
                                .GET()
                                .setHeader("User-Agent", "espark-client")
                                .build(),
                        HttpResponse.BodyHandlers.ofString())
                        .thenApply(response -> response.body()))
                .collect(Collectors.toList());
        for (CompletableFuture<String> future : result) {
            System.out.println(future.get());
        }
    }
}



* module-info.java 
module httpclientservice {
    requires java.net.http;
}
```
* To Compile
  *  $ javac --module-source-path src -d out -m httpclientservice
```
├── README.md
├── out
│   └── httpclientservice
│       ├── com
│       │   └── espark
│       │       └── adarsh
│       │           ├── HttpClientAsynchronous.class
│       │           ├── HttpClientConcurrentExecutor.class
│       │           └── HttpClientService.class
│       └── module-info.class
└── src
    └── httpclientservice
        ├── HttpClientAsynchronous.java
        ├── HttpClientConcurrentExecutor.java
        ├── HttpClientService.java
        └── module-info.java
```
* To Run
  * $ java --module-path out -m httpclientservice/com.espark.adarsh.HttpClientService
```
cache-control:[public, max-age=2592000]
content-length:[219]
content-type:[text/html; charset=UTF-8]
date:[Sun, 13 Nov 2022 05:04:01 GMT]
expires:[Tue, 13 Dec 2022 05:04:01 GMT]
location:[http://www.google.com/]
server:[gws]
x-frame-options:[SAMEORIGIN]
x-xss-protection:[0]
301
<HTML><HEAD><meta http-equiv="content-type" content="text/html;charset=utf-8">
<TITLE>301 Moved</TITLE></HEAD><BODY>
<H1>301 Moved</H1>
The document has moved
<A HREF="http://www.google.com/">here</A>.
</BODY></HTML>
```

  * $ java --module-path out -m httpclientservice/com.espark.adarsh.HttpClientAsynchronous

```
<HTML><HEAD><meta http-equiv="content-type" content="text/html;charset=utf-8">
<TITLE>301 Moved</TITLE></HEAD><BODY>
<H1>301 Moved</H1>
The document has moved
<A HREF="https://www.google.com/">here</A>.
</BODY></HTML>
```