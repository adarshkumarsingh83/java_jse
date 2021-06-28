# Interface
---

1.Diclaration
2.Content
3.Overloading
4.Inhertance
5.Implementation
6.Overriding


## .Top Level Interface
---
```
 1.Java file name and the public interface inside the .java file both names must be same.
 2.one .java file can have multiple java interface no restriction on this but public interface and java file name must be same.
 3.key words for top level class.
    public,strictfp,abstract
 NOTE:we can't use final keyword for any type of interface.
 4.top level interface can extended multiple interface at the time 
 5.we can't have static block inside a interface.
 7.we can't have instance block inside a interface.
 8.we can't have constructor inside the interface.
 9.we can have static final variable inside interface
 10.any variable with out static final it convert internally into static final variable.
 11.variable initialization is must.
 12.we can have inner class inside the interface which is static final internally.
 13.we can have static final nested inner class inside the interface.
 14.we can have interface inside the top level class.
 15.we can have static interface inside the interface.
 16.we can't have instance variable.
 17.we can have overloaded method declaration in interface.
 18.we can override the abastract method in the child interface.
 19.we can have enum inside the interface.
 20.JDK8-> we can have static method in top level interface.
 21.JDK8-> we can have default method in top level interface.
 22.JDK8-> static method in interface can't be final.
 23.JDK8-> to access the static method InterfaceName.methodName();
 24.JDK8-> to access the default method InterfaceName.super.methodName();
 25.JDK8-> default methods are accesable only in implementing class but static is avalable in non implementing classes.
 26.JDK8-> we can overload the default method in side interface.
 27.JDK8-> we can overload the static method in side interface.
 28.JDK8-> we can override the default method for custom requirement.
 29.JDK8-> we can't override java.lang.Object methods as the default methods.
 30.JDK8-> we can override default method as normal method in the implementing class. 
 31.JDK8-> we can override static method as normal method in the implementing class. 
 32.JDK8-> we can override the abstract method of parent interface into child interface as defualt method.
 33.JDK8-> we can't override the abstract method of parent interface into child interface as static method.
 34.JDK8-> we can't override the default method of parent interface into child interface as static method.
 35.JDK8-> we can override the default method of parent interface into child interface as abstract method.
 36.JDK8-> we can override the static method of parent interface into child interface as abstract method.
 37.JDK8-> we can have more then one default methods in one interface but with differnt signature.
 38.JDK8-> we can have more then one static methods in one interface but with differnt signature.
 39.JDK8->Functional Interface interface which is having only one abstract method and optional default or static methods.
 40.JDK8-> java.lang.@FunctionalInterface annotation can be used to diclared own custom functional interface.
```

## .Inner Interface
---

```
 1.we can have interface inside the class , enum and interface
 2.key words for inner interface.
    public,private,protected,strictfp,static,abstract
 3.inner interface can extended multiple interface at the time 
 4.we can't have static block inside a inner interface.
 5.we can't have instance block inside a inner interface.
 6.we can't have constructor inside the inner interface.
 7.we can have static final variable inside inner interface
 8.any variable with out static final it convert internally into static final variable.
 9.variable initialization is must.
 10.we can have inner class inside the inner interface which is static final internally.
 11.we can have static final nested inner class inside the inner interface.
 12.we can have interface inside the inner interface
 13.we can have static interface inside the inner interface.
 14.we can't have instance variable.
 15.we can have overloaded method declaration in inner interface.
 16.we can have enum inside the inner interface.
 ```

### Method local Interface.
---
```
 in java we don't have method local interface.
 
 UserCase:
 1.When same abstract method with same signature is present in two interface which is implemented in the 
   common child class so only one method need to be implemented.
 2.When same static final variable is present in two interface which is implemented in the common clild 
  class so we can access both the variable by using InterfaceName.variableName;
 3.JDK8-> When one method with same signature is present in one interface as the default method and with the 
  same signaure that method is present in the another interface as the abstract method then implementing class
  need to override the abstract method otherwise CTE.
 4.JDK8-> When one method with same signaure is present in on interface as the default method and with the same 
  signatue that method is present in the another interface as the static method then implementing class need to  
  override the method and provide the implementation otherwise CTE.
 5.JDK8-> When we have different interface which consist of following   
         a. in one interface that is diclare as the default method 
		 b. in another interface that is diclare as the static method 
		 c. and in another interface that is dilcare as the abstract method 
   in all the above case signaure is same for method in that case also only one implementation is requried.  
```

* explantation for default method in the jdk8 interface.
---
```
if any inteface is already published and it has its implementing classed and we want't to add 
some additional functionality in exisisting interface which is already published then all the 
implementation need to be change they also need to implement the new functionality to overcome 
this problem default method concept is introduced in jdk8.
```

### use cases
```
1.two interface haveing same method signature need to be implemented in the on class then only one method need to be implemented.
ex 
interface MyService{                        
   public void wish(String name);      
}                                      

interface YourService{
  public void wish(String name);
}     

class WishService implements MyService,YourService{
   public void wish(String name){
       ----- code-----
	}
}
```


### two interface haveing same method signature but different return type need to be implemented in the class in this case we can't proceed 
only one interface need to be implemented. becoz if we implement any of the method then its complaint about the return type but if its 
reference type then we can use covarient return type also.but if its the primitve then we can't do any thing we have to implement only one 
at the time.

```
ex 
interface MyService{                        
   public int wish(String name);      
}                                      

interface YourService{
  public double wish(String name);
}     

not possible 
class WishService implements MyService,YourService{
   public void wish(String name){
       ----- code-----
	}
}
```


### .when two interface is having he same variable 
```
ex 
interface MyService{                        
   public int x=10;
}                                      

interface YourService{
   public int x=100;
}     

not possible 
class WishService implements MyService,YourService{
   public void method(){
       ----- code-----
	   MyService.x;
	   YourService.x;
	}
}
```