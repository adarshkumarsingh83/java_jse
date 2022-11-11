## JAVA9 NEW FEATURES (21 sept 2017 )

---

## jpms(java plateform module system)
* JEP for modular programming development started in 2005  
* into in jdk 1.9 in 2017 
* jigsaw project is based for jpms 
* java-home/jre/lib/rt.jar was their untill jdk 1.8 
* java_home/jmods is the moudles for the jdk1.9 onwards 
```
java.base.jmod
java.compiler.jmod
java.datatransfer.jmod
java.desktop.jmod
java.instrument.jmod
java.logging.jmod
java.management.jmod
java.management.rmi.jmod
java.naming.jmod
java.net.http.jmod
java.prefs.jmod
java.rmi.jmod
java.scripting.jmod
java.se.jmod
java.security.jgss.jmod
java.security.sasl.jmod
java.smartcardio.jmod
java.sql.jmod
java.sql.rowset.jmod
java.transaction.xa.jmod
java.xml.crypto.jmod
java.xml.jmod
jdk.accessibility.jmod
jdk.attach.jmod
jdk.charsets.jmod
jdk.compiler.jmod
jdk.crypto.cryptoki.jmod
jdk.crypto.ec.jmod
jdk.dynalink.jmod
jdk.editpad.jmod
jdk.hotspot.agent.jmod
jdk.httpserver.jmod
jdk.incubator.foreign.jmod
jdk.incubator.vector.jmod
jdk.internal.ed.jmod
jdk.internal.jvmstat.jmod
jdk.internal.le.jmod
jdk.internal.opt.jmod
jdk.internal.vm.ci.jmod
jdk.internal.vm.compiler.jmod
jdk.internal.vm.compiler.management.jmod
jdk.jartool.jmod
jdk.javadoc.jmod
jdk.jcmd.jmod
jdk.jconsole.jmod
jdk.jdeps.jmod
jdk.jdi.jmod
jdk.jdwp.agent.jmod
jdk.jfr.jmod
jdk.jlink.jmod
jdk.jpackage.jmod
jdk.jshell.jmod
jdk.jsobject.jmod
jdk.jstatd.jmod
jdk.localedata.jmod
jdk.management.agent.jmod
jdk.management.jfr.jmod
jdk.management.jmod
jdk.naming.dns.jmod
jdk.naming.rmi.jmod
jdk.net.jmod
jdk.nio.mapmode.jmod
jdk.random.jmod
jdk.sctp.jmod
jdk.security.auth.jmod
jdk.security.jgss.jmod
jdk.unsupported.desktop.jmod
jdk.unsupported.jmod
jdk.xml.dom.jmod
```
* java.base.jmod 
  * java.lang
  * java.util
  * java.io 

* to know the module of any class 
```
jshell> System.out.println(String.class.getModule());
module java.base

jshell> System.out.println(java.sql.Connection.class.getModule());
module java.sql
```

### issues wth traditional apprach of java 
* NoClassDefFoundError at the runtime 
  * jvm don't check the .class file before program start 
  * if .class file for the Servic is missing it will execute till FreeService/PaidService then NoClassDefError will occured 
  * but in jdk1.9 module-info.java containes speific rquested statment due to which it will check the avalibity of .class file before execution 
```
├── FreeService.java
├── PaidService.java
├── Service.java
├── ServiceDriver.java
└── com
    └── adarsh
        ├── ServiceDriver.class
        ├── free
        │   └── FreeService.class
        ├── paid
        │   └── PaidService.class
        └── service
            └── Service.class

package com.adarsh.service;
public interface Service {
     default void doService(){
        System.out.println("Service performed");
    }
}
$ javas -d . Service.java 

package com.adarsh.free;
import com.adarsh.service.Service;
public class FreeService implements Service {
    public void freeService(){
        System.out.println("Free Service Performed");
        doService();
    }
}
$ javac -d . FreeService.java 

package com.adarsh.paid;
import com.adarsh.service.Service;
public class PaidService implements Service {
    public void paidService(){
        System.out.println("Paid Service Performed");
        doService();
    }
}
$ javac -d . PaidService.java


package com.adarsh;
import com.adarsh.free.FreeService;
import com.adarsh.paid.PaidService;
public class ServiceDriver {
    public static void main(String[] args) throws Exception{
        System.out.println("execution started ");
        Thread.currentThread().sleep(1000);
        System.out.println("execution half completed");
        FreeService freeService = new FreeService();
        freeService.freeService();
        PaidService paidService = new PaidService();
        paidService.paidService();
        System.out.println("execution completed");
    }
}

$ javac -d . *.java 
```
* normal execution 
```
$ java com/adarsh/ServiceDriver
execution started 
execution half completed
Free Service Performed
Service performed
Paid Service Performed
Service performed
execution completed
```
* delete the Service.class file 
```
$ java com/adarsh/ServiceDriver
execution started 
execution half completed
Exception in thread "main" java.lang.NoClassDefFoundError: com/adarsh/service/Service
```

* Version Conflect/Shadowing 
  * classpth where .jar file or .class file informtion is provided to execute the progjram 
  * class path will be evaluted left to right in the class path 
    * classpath=jar1;jar2....jarN
    * if .class file is avalable in jar1 then rest of the jar will be ignored 
    * if .class file is not found then it will say NoClassDefFound 
    * if multiple jar file contains same .class file with different version of same .class file then what ever is found first will be loaded rest of the jar ignored 
    * due to this .jar file version conflict will result in showing problem also  
    * but due to "required module" statement in module-info.java it will alwasy pick .class file from specific module 

* Security
  * jar file contains multiple packages its pulbic to everyone their is lack of option to provide accessablity to the packges of the jar file until jdk1.8 
  * from jdk1.9 we have define the "export package" satement in module-info.java so that only requred package can be made visible to use 
  * even public class from any package if its not exported from module will not be visible to use outside 

* Jdk/jre monolithic structure with large size 
  * till jdk 1.8 JRE size is 201MB 
  * to run only one line code rt.jar file is requred in classpath which contains everythings 
  * we can use Jlink to create customized jre for iot with samll size 



### Module based developmet 
* till jdk 1.8 programming style 
  * packages contains classes interface & enums 
  * jar file contains packages 
  * interface class enum -> pakcage -> jar file -> classpath -> run the application 
* from jdk 1.9 onwards programing style 
  * module is group of packages 
  * module contains configuration informaiton in form of module-info.java 
  * if module-info.java is not avaliabe in module then jvm will not consider that moudle as module 

### jar file v/s module 
* jar file is group of packages 
  * packages contains interface classes and enum 
  * claspaht is used for the jar file and evaluted from left to right order 
* module is group of packages 
  * packages contains interface classes and enum 
  * package is mandaory for every class interfaceand enum if package statment is missing CTE 
  * module conatians module-info.java its mandatory otherwise jvm will not consider module 
  * module name ends with digit is not recommended compiler will warn for this 
    * this file contains configureation related to 
      * requried modules, classes 
      * export classes, packages 
      * trasitivity dependecy 
      * other configuration 
  * module path is used to keep modules for program exeuction 


### module-info.java structure 
```
   module module_name{
        
    
          // required directive is only for module 
          //dependency of other module to current module 
          // for every module requried directive must be repeated don't add * for multiple modules 
        requires xxxx_module;


          // dependecy requred by other module via current module 
        requires transitive  xxxx;
 
         // export directive to export package only not for module and classes 
         // for multiple packages export directly must be repeated don't add * for packages 
         // every packgae in module is by default private 
         // packages exported by current module to others module 
       export com.xx.xx;

      

   }
```

### basic module applicaton 
```
module-basic-example
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

package com.adarsh.free;
import com.adarsh.service.Service;
public class FreeService implements Service {
    public void freeService(){
        System.out.println("Free Service Performed");
        doService();
    }
}

package com.adarsh.paid;
import com.adarsh.service.Service;
public class PaidService implements Service {
    public void paidService(){
        System.out.println("Paid Service Performed");
        doService();
    }
}

package com.adarsh;
import com.adarsh.free.FreeService;
import com.adarsh.paid.PaidService;
public class ServiceDriver {
    public static void main(String[] args) throws Exception{
        System.out.println("execution started ");
        Thread.currentThread().sleep(1000);
        System.out.println("execution half completed");
        FreeService freeService = new FreeService();
        freeService.freeService();
        PaidService paidService = new PaidService();
        paidService.paidService();
        System.out.println("execution completed");
    }
}
```
* to Compile module applictaoin 
  * javac --module-source-path /module-source-directory -d /destination-dir-location-for-generated-classes -m module_name
  * $ javac --module-source-path src  -d out -m module_example
  * or 
   * $ javac --module-source-path src  -d out --module module_example
  * or 
  * javac --module-source-path out src/module_example/module-info.java src/module_example/com/adarsh/service/Service.java src/module_example/com/adarsh/free/FreeService.java src/module_example/com/adarsh/paid/PaidService.java src/module_example/com/adarsh/ServiceDriver.java
    * relative path with path starts with src directory 
  * or 
 * javac --module-source-path out src/module_example/module-info.java /desktop/module-basic-example/src/module_example/com/adarsh/service/Service.java /desktop/module-basic-examplesrc/module_example/com/adarsh/free/FreeService.java /desktop/module-basic-examplesrc/module_example/com/adarsh/paid/PaidService.java /desktop/module-basic-examplesrc/module_example/com/adarsh/ServiceDriver.java
  * absulate path of the files 
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
* to execute the application 
  * java --module-path /destination-dir-location-for-generated-classes  -m module_name/package/ClassName.class 
  * java --module-path out/ -m module_example/com.adarsh.ServiceDriver
  * or 
  * java --module-path out/ --module module_example/com.adarsh.ServiceDriver
  * or 
  * java --module-path out/ --add-modules module_example com.adarsh.ServiceDriver

```
execution started 
execution half completed
Free Service Performed
Service performed
Paid Service Performed
Service performed
execution half completed
```

### multi-module example 
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

* service module 
```
* Service.java 

package com.adarsh.service;
public interface Service {
     default void doService(){
        System.out.println("Service performed");
    }
}

* module-info.java

module service {
    exports com.adarsh.service;
}
```
* free_service
```
* FreeService.java

package com.adarsh.free;
import com.adarsh.service.*;
public class FreeService implements Service {
    public void freeService() {
        System.out.println("Free Service Performed");
        doService();
    }
}

* module-info.java

module free_service {
    requires service;
    exports com.adarsh.free;
}
```

* paid_service
```
* PaidService.java

package com.adarsh.paid;
import com.adarsh.service.*;
public class PaidService implements Service {
    public void paidService(){
        System.out.println("Paid Service Performed");
        doService();
    }
}

* module-info.java

module paid_service {
    requires service;
    exports com.adarsh.paid;
}
```

* main 
```
* ServiceDriver.java

package com.adarsh;
import com.adarsh.free.FreeService;
import com.adarsh.paid.PaidService;
public class ServiceDriver {
    public static void main(String[] args) throws Exception{
        System.out.println("execution started ");
        Thread.currentThread().sleep(10000);
        System.out.println("execution half completed");
        FreeService freeService = new FreeService();
        freeService.freeService();
        PaidService paidService = new PaidService();
        paidService.paidService();
        System.out.println("execution half completed");
    }
}

* module-info.java

module main {
    requires free_service;
    requires paid_service;
    exports com.adarsh;
}
```

* To Compile multiple module 
  * javac --module-source-path /module-source-directory -d /destination-dir-location-for-generated-classes -m module1, moduel2 ... moduleN 
  * javac --module-source-path src -d out -m free_service,paid_service,service,main
    * note : in -m option no space betwen multiple module names otherwise it will not compile 

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
* To Execute multiple module app 
  * java --module-path /destination-dir-location-for-generated-classes -m module-with-main-class/com.xxx.MainClass 
  * java --module-path out -m main/com.adarsh.ServiceDriver
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

### when compiled files are in multiple directories 
* javac --module-source-path src -d out1 -m service
* javac --module-source-path src -d out2 -m free_service
* javac --module-source-path src -d out3 -m paid_service
* javac --module-source-path src -d out4 -m main
```
├── README.md
├── out1
│   └── service
│       ├── com
│       │   └── adarsh
│       │       └── service
│       │           └── Service.class
│       └── module-info.class
├── out2
│   ├── free_service
│   │   ├── com
│   │   │   └── adarsh
│   │   │       └── free
│   │   │           └── FreeService.class
│   │   └── module-info.class
│   └── service
│       ├── com
│       │   └── adarsh
│       │       └── service
│       │           └── Service.class
│       └── module-info.class
├── out3
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
├── out4
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
* To Execute Application Moduels with different directories 
  * java --upgrade-module-path out1;out2;out3;out4 -m main/com.adarsh.ServiceDriver

### when source file is in multiple locaction 
```
└── src1
    ├── free_service
       ├── com
       │   └── adarsh
       │       └── free
       │           └── FreeService.java
       └── module-info.java
└── src2
    ├── main
       ├── README.md
       ├── com
       │   └── adarsh
       │       └── ServiceDriver.java
       └── module-info.java
└── src3
    ├── paid_service
       ├── com
       │   └── adarsh
       │       └── paid
       │           └── PaidService.java
       └── module-info.java
└── src4
    └── service
        ├── com
        │   └── adarsh
        │       └── service
        │           └── Service.java
        └── module-info.java
```
* To compile sources from multiple directories 
  * java --module-source-path src1;src2;src3;src4 -d out service,free_service,paid_service,main
* To run application 
  * java --module-path out -m main/com.adarsh.ServiceDrier 


