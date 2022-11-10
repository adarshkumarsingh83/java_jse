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
  * 



### Module based developmet 
* till jdk 1.8 programming style 
  * packages contains classes interface & enums 
  * jar file contains packages 
  * interface class enum -> pakcage -> jar file -> classpath -> run the application 
* from jdk 1.9 onwards programing style 
  * module is group of packages 
  * module contains configuration informaiton in form of module-info.java 
  * if module-info.java is not avaliabe in module then jvm will not consider that moudle as module 

