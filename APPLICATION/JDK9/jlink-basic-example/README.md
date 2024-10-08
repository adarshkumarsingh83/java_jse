## jlink-basic-example

--- 

```
jlink-basic-example
├── README.md
└── src
    └── main
        ├── ApplicationMain.java
        └── module-info.java

* ApplicationMain.java 
package com.espark.adarsh;
public class ApplicationMain {
    public static void main(String[] args) {
        System.out.println("welccome to jlink "+System.getProperty("user.name"));
    }
}

* module-info.java 
module main {
}
```

### To Compile 
* javac --module-source-path src -d out -m main 
```
jlink-basic-example
├── README.md
├── out
│   └── main
│       ├── com
│       │   └── espark
│       │       └── adarsh
│       │           └── ApplicationMain.class
│       └── module-info.class
└── src
    └── main
        ├── ApplicationMain.java
        └── module-info.java
```

### To Exeucte 
* java --module-path out -m main/com.espark.adarsh.ApplicationMain
```
welccome to jlink us-guest
```

### steps 
* in our program System,String & ApplicationMain class is used 
* System & String class is part of java.lang pakcage which is part of java.base module in jdk9 
* ApplicationMain is part of com.epsark.adarsh package which is part of main custom module 
* copy java.base module from jdk dir jmods "/Library/Java/JavaVirtualMachines/jdk-17.0.2.jdk/Contents/Home/jmods" inside out directory 
```
├── README.md
├── out
│   ├── java.base.jmod
│   └── main
│       ├── com
│       │   └── espark
│       │       └── adarsh
│       │           └── ApplicationMain.class
│       └── module-info.class
└── src
    └── main
        ├── ApplicationMain.java
        └── module-info.java
```
* execute the cmd to build custom jre 
    * $ jlink --module-path out --add-modules main,java.base --output esparkjre
```
esparkjre
├── bin
│   ├── java
│   └── keytool
├── conf
│   ├── net.properties
│   └── security
│       ├── java.policy
│       ├── java.security
│       └── policy
│           ├── README.txt
│           ├── limited
│           │   ├── default_US_export.policy
│           │   ├── default_local.policy
│           │   └── exempt_local.policy
│           └── unlimited
│               ├── default_US_export.policy
│               └── default_local.policy
├── include
│   ├── classfile_constants.h
│   ├── darwin
│   │   └── jni_md.h
│   ├── jni.h
│   ├── jvmti.h
│   └── jvmticmlr.h
├── legal
│   └── java.base
│       ├── COPYRIGHT
│       ├── LICENSE
│       ├── aes.md
│       ├── asm.md
│       ├── c-libutl.md
│       ├── cldr.md
│       ├── icu.md
│       ├── public_suffix.md
│       └── unicode.md
├── lib
│   ├── classlist
│   ├── jrt-fs.jar
│   ├── jspawnhelper
│   ├── jvm.cfg
│   ├── libjava.dylib
│   ├── libjimage.dylib
│   ├── libjli.dylib
│   ├── libjsig.dylib
│   ├── libnet.dylib
│   ├── libnio.dylib
│   ├── libosxsecurity.dylib
│   ├── libverify.dylib
│   ├── libzip.dylib
│   ├── modules
│   ├── security
│   │   ├── blocked.certs
│   │   ├── cacerts
│   │   ├── default.policy
│   │   └── public_suffix_list.dat
│   ├── server
│   │   ├── libjsig.dylib
│   │   └── libjvm.dylib
│   └── tzdb.dat
├── man
│   └── man1
│       ├── java.1
│       └── keytool.1
└── release

15 directories, 49 files
```
* to run applkciation 
	*  ./esparkjre/bin/java -m main/com.espark.adarsh.ApplicationMain
```	
welccome to jlink us-guest
```
