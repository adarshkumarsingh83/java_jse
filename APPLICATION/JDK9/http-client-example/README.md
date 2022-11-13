# httpclient example

---

### To Compile

- $ javac --module-source-path src -d out -m httpclientservice

### To Run

- $ java --module-path out -m httpclientservice/com.espark.adarsh.HttpClientService

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

- $ java --module-path out -m httpclientservice/com.espark.adarsh.HttpClientAsynchronous

```
<HTML><HEAD><meta http-equiv="content-type" content="text/html;charset=utf-8">
<TITLE>301 Moved</TITLE></HEAD><BODY>
<H1>301 Moved</H1>
The document has moved
<A HREF="https://www.google.com/">here</A>.
</BODY></HTML>
```

- $ java --module-path out -m httpclientservice/com.espark.adarsh.HttpClientConcurrentExecutor

```
<HTML><HEAD><meta http-equiv="content-type" content="text/html;charset=utf-8">
<TITLE>301 Moved</TITLE></HEAD><BODY>
<H1>301 Moved</H1>
The document has moved
<A HREF="https://www.google.com/">here</A>.
</BODY></HTML>

<HTML><HEAD><meta http-equiv="content-type" content="text/html;charset=utf-8">
<TITLE>301 Moved</TITLE></HEAD><BODY>
<H1>301 Moved</H1>
The document has moved
<A HREF="https://www.google.com/">here</A>.
</BODY></HTML>

<HTML><HEAD><meta http-equiv="content-type" content="text/html;charset=utf-8">
<TITLE>301 Moved</TITLE></HEAD><BODY>
<H1>301 Moved</H1>
The document has moved
<A HREF="https://www.google.com/">here</A>.
</BODY></HTML>
```
