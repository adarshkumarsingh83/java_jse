# Java 9 Modularity

----

> A Module is a group of closely related packages and resources along with a new module descriptor file


* package => abstraction that allows us to make our code even more reusable.
> When we create a module, we organize the code internally in packages just like we previously did with any other project.
> Aside from organizing our code, packages are used to determine what code is publicly accessible outside of the module. 


### Module Descriptor
* Name – the name of our module
* Dependencies – a list of other modules that this module depends on
* Public Packages – a list of all packages we want accessible from outside the module
* Services Offered – we can provide service implementations that can be consumed by other modules
* Services Consumed – allows the current module to be a consumer of a service
* Reflection Permissions – explicitly allows other classes to use reflection to access the private members of a package


### Module Types
* System Modules – These are the modules listed when we run the list-modules command above. They include the Java SE and JDK modules.
* Application Modules – These modules are what we usually want to build when we decide to use Modules. They are named and defined in the compiled module-info.class file included in the assembled JAR.
* Automatic Modules – We can include unofficial modules by adding existing JAR files to the module path. The name of the module will be derived from the name of the JAR. Automatic modules will have full read access to every other module loaded by the path.
* Unnamed Module – When a class or JAR is loaded onto the classpath, but not the module path, it's automatically added to the unnamed module. It's a catch-all module to maintain backward compatibility with previously-written Java code.


### Module Declarations
* To set up a module, we need to put a special file at the root of our packages named module-info.java.
```
module myModuleName {
    // all directives are optional
}   
```

* module directive allows us to declare module dependencies:

* Requires
	* my.module has both a runtime and a compile-time dependency on module.name
``` 
module my.module {
    requires module.name;
}
```


* Requires Static
	* using the requires static directive, we create a compile-time-only dependency:

```
module my.module {
    requires static module.name;
}
```

* Requires Transitive
	* we need to make sure that any module that brings in our code will also bring in these extra ‘transitive' dependencies or they won't work.
```
module my.module {
    requires transitive module.name;
}
```

* Exports
	* By default, a module doesn't expose any of its API to other modules
	* the exports directive to expose all public members of the named package:
```
module my.module {
    exports com.my.package.name;
}
```

* Exports … To
	* exports…to to open up our public classes to the world.
	* restrict which modules have access to our APIs using the exports…to directive.
```
module my.module {
    export com.my.package.name to com.specific.package;
}
```

* Uses
	* service is an implementation of a specific interface or abstract class that can be consumed by other classes.
	* designate the services our module consumes with the uses directive
	* the class name we use is either the interface or abstract class of the service, not the implementation class:
```
module my.module {
    uses class.name;
}
```

* Provides … With
	* module can also be a service provider that other modules can consume.
	* provides keyword. is where we put the interface or abstract class name	
	* with directive we provide the implementation class name that either implements the interface or extends the abstract class.
```
module my.module {
    provides MyInterface with MyInterfaceImpl;
}
```

* Open
	* encapsulation was a driving motivator for the design of this module system.
	* Now we have to explicitly grant permission for other modules to reflect on our classes. using reflections 
```
open module my.module {

}
```

* Opens
	* If we need to allow reflection of private types, but we don't want all of our code exposed, we can use the opens directive to expose specific packages
```
module my.module {
  opens com.my.package;
}
```

* Opens … To
	* reflection is great sometimes, but we still want as much security as we can get from encapsulation.
	* We can selectively open our packages to a pre-approved list of modules, in this case, using the opens…to directive
```
module my.module {
    opens com.my.package to moduleOne, moduleTwo, etc.;
}
```	