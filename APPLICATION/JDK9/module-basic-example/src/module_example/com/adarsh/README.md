### module-basic-example

- to Compile module applictaoin
  - javac --module-source-path /module-source-directory -d /destination-dir-location-for-generated-classes -m module_name
  - $ javac --module-source-path src -d out -m module_example
  - or
  - $ javac --module-source-path src -d out --module module_example
  - or
  - javac --module-source-path out src/module_example/module-info.java src/module_example/com/adarsh/service/Service.java src/module_example/com/adarsh/free/FreeService.java src/module_example/com/adarsh/paid/PaidService.java src/module_example/com/adarsh/ServiceDriver.java
    - relative path with path starts with src directory
  - or
- javac --module-source-path out src/module_example/module-info.java /desktop/module-basic-example/src/module_example/com/adarsh/service/Service.java /desktop/module-basic-examplesrc/module_example/com/adarsh/free/FreeService.java /desktop/module-basic-examplesrc/module_example/com/adarsh/paid/PaidService.java /desktop/module-basic-examplesrc/module_example/com/adarsh/ServiceDriver.java
- absulate path of the files

```
module-basic-example
├── out
│   └── module_example
│       ├── com
│       │   └── adarsh
│       │       ├── ServiceDriver.class
│       │       ├── free
│       │       │   └── FreeService.class
│       │       ├── paid
│       │       │   └── PaidService.class
│       │       └── service
│       │           └── Service.class
│       └── module-info.class
└── src
    └── module_example
        ├── com
        │   └── adarsh
        │       ├── ServiceDriver.java
        │       ├── free
        │       │   └── FreeService.java
        │       ├── paid
        │       │   └── PaidService.java
        │       └── service
        │           └── Service.java
        └── module-info.java
```

- to execute the application
  - java --module-path /destination-dir-location-for-generated-classes -m module_name/package/ClassName.class
  - java --module-path out/ -m module_example/com.adarsh.ServiceDriver
  - or
  - java --module-path out/ --module module_example/com.adarsh.ServiceDriver
  - or
  - java --module-path out/ --add-modules module_example com.adarsh.ServiceDriver

```
execution started
execution half completed
Free Service Performed
Service performed
Paid Service Performed
Service performed
execution half completed
```
