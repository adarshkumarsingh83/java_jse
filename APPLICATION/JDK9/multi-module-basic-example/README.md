## multi-module example

---

```
└── src
    ├── free_service
    │   ├── com
    │   │   └── adarsh
    │   │       └── free
    │   │           └── FreeService.java
    │   └── module-info.java
    ├── main
    │   ├── com
    │   │   └── adarsh
    │   │       └── ServiceDriver.java
    │   └── module-info.java
    ├── paid_service
    │   ├── com
    │   │   └── adarsh
    │   │       └── paid
    │   │           └── PaidService.java
    │   └── module-info.java
    └── service
        ├── com
        │   └── adarsh
        │       └── service
        │           └── Service.java
        └── module-info.java
```

- To Compile multiple module
  - javac --module-source-path /module-source-directory -d /destination-dir-location-for-generated-classes -m module1, moduel2 ... moduleN
  - javac --module-source-path src -d out -m free_service,free_service,service,main

```
mutli-module-basic-example
├── out
│   ├── free_service
│   │   ├── com
│   │   │   └── adarsh
│   │   │       └── free
│   │   │           └── FreeService.class
│   │   └── module-info.class
│   ├── main
│   │   ├── com
│   │   │   └── adarsh
│   │   │       └── ServiceDriver.class
│   │   └── module-info.class
│   ├── paid_service
│   │   ├── com
│   │   │   └── adarsh
│   │   │       └── paid
│   │   │           └── PaidService.class
│   │   └── module-info.class
│   └── service
│       ├── com
│       │   └── adarsh
│       │       └── service
│       │           └── Service.class
│       └── module-info.class
└── src
    ├── free_service
    │   ├── com
    │   │   └── adarsh
    │   │       └── free
    │   │           └── FreeService.java
    │   └── module-info.java
    ├── main
    │   ├── README.md
    │   ├── com
    │   │   └── adarsh
    │   │       └── ServiceDriver.java
    │   └── module-info.java
    ├── paid_service
    │   ├── com
    │   │   └── adarsh
    │   │       └── paid
    │   │           └── PaidService.java
    │   └── module-info.java
    └── service
        ├── com
        │   └── adarsh
        │       └── service
        │           └── Service.java
        └── module-info.java
```

- To Execute multiple module app
  - java --module-path /destination-dir-location-for-generated-classes -m module-with-main-class/com.xxx.MainClass
  - java --module-path out -m main/com.adarsh.ServiceDriver
  ###

```
execution started
execution half completed
Free Service Performed
Service performed
Paid Service Performed
Service performed
execution half completed
```
