## service provider interface example

---

```
service-provider-interface-module
├── README.md
└── src
    ├── main
    │   ├── ApplicationMain.java
    │   └── module-info.java
    └── service
        ├── WishService.java
        ├── WishServiceImpl.java
        └── module-info.java

* WishService.java
package com.espark.adarsh.service;
public interface WishService {
    public abstract String wish(String name);
}

* WishServiceImpl.java
package com.espark.adarsh.service;
import java.time.LocalDateTime;
public class WishServiceImpl implements WishService {
    public String wish(String name) {
        int hour = LocalDateTime.now().getHour();
        if (hour > 5 && hour < 12) {
            return name + " Good Morning ";
        } else if (hour > 12 && hour < 16) {
            return name + " Good Afternoon ";
        } else {
            return name + " Good Evening ";
        }
    }
}
* module-info.java
module service {
    exports com.espark.adarsh.service;
    provides com.espark.adarsh.service.WishService with com.espark.adarsh.service.WishServiceImpl;
}

* ApplicationMain.java
package com.espark.adarsh;
import java.util.ServiceLoader;
import com.espark.adarsh.service.WishService;
public class ApplicationMain {
    public static void main(String[] args) {
        Iterable<WishService> services = ServiceLoader.load(WishService.class);
        WishService service = services.iterator().next();
        System.out.println(service.wish(System.getProperty("user.name")));
    }
}

* module-info.java
module main {
     requires service;
     uses com.espark.adarsh.service.WishService;
}
```

### To compile

- javac --module-source-path src -d out -m service,main

```
├── README.md
├── out
│   ├── main
│   │   ├── com
│   │   │   └── espark
│   │   │       └── adarsh
│   │   │           └── ApplicationMain.class
│   │   └── module-info.class
│   └── service
│       ├── com
│       │   └── espark
│       │       └── adarsh
│       │           └── service
│       │               ├── WishService.class
│       │               └── WishServiceImpl.class
│       └── module-info.class
└── src
    ├── main
    │   ├── ApplicationMain.java
    │   └── module-info.java
    └── service
        ├── WishService.java
        ├── WishServiceImpl.java
        └── module-info.java
```

### To execute

- java --module-path out -m main/com.espark.adarsh.ApplicationMain

```
adarsh Good Afternoon
```
