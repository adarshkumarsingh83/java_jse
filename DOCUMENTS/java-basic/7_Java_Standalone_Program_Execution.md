# Java Standalone Program Execution 
---

## Java File is created & the public java class with main method is saved into the class.
```
 c:\>edit MyClass.java <-|
 write the java code and save the file 
 
package com.adarsh.myclass;

public class MyClass{

    public static void main(String[] args){
	   System.out.println("Welcome to Java");
	}    	
}
```

## java File is complied with java compiler 
```
 C:\>javac -d . *.java MyClass.java <-|
    
	when we invoke the java compiler with above command following operation is performed by compiler 
   0.compiler search for the mentioned .java file in the mentioned path if not found prompt error. 	
   1.compiler checks for the syntax & symmetric of the java file.(check for the java key words)
   2.checks for the java File name & public class name inside the java file must have same name and only one public class 
     can reside the java file other can be non public in same java file.
   3.checks for the syntax & symmetric and rules  of package,class,interface,enums,if,switch,for,while,dowhile,try catch finlly
      method signature,static blocks,instance blocks,trinary operator and other operator are proper or not.
   4.check for constructor if the constructor is not available in java class it will create default constructor in java class.
   5.checks for the declaration of the variable with the data type is done proper or not
   6.checks for max allowed value for the data type   
   7.check for the assignments it means all the assignment to the variable for literals 
     and for reference variable is done properly or not
   8.checks for the checked exceptions are handled properly or not.
   9.checks for the braces for method ,conditions ,loops ,blocks ,switch are proper and closed or not.
   10.checks for the Generic types for class, methods ,variable declaration.
   11.checks for the method invocation is proper or not like static method with class name or instance method with object 
     or private methods outside from the class not allowed.
   12.checks for the method overloading resolution for the reference variable is correct or not.
   13.checks for overloading signature is proper or not like checked exception can be narrow down 
      return type can be covariant and access specifier can be broad down like default to protected or public .
   14.checks for the return statements which may leads to unreachable code.
   15.check for the return type of the method is same as mentioned in signature or if its missed then prompt an error.   
   16.checks for the up-casting & down-casting is done properly or not.
   17.checks for the boxing & unboxing is done properly or not.
   18.checks for the local variable initialization before use 
   19.it will never checks for main method in the java class.
   20.when all the above mentioned are correct then it will generate the .class file 
      having same name of the classes inside the java file into the specified location.
```    
## java class execution.
```
  c:\>java -cp . com.adarsh.myclass.MyClass <-|
 
   when we invoke the java run time using above command then following operation is performed by JVM
  0.search for the .class file in the mentioned path if not found prompt error. 
  1.class loader load the .class file into the class area inside the jvm
  2.byte code verifier verifies the .class file 
  3.linker will link the byte code with the execution engine.
  4.Just in time compiler will take piece by piece and convert the byte code into the machine dependent code for execution.
  3.A non demon thread is created with the name of main which will be in thread pool and start the execution of the code.
  4.static control flow will execute 
  5.then main method is execute inside the class if main method is not found it will throw error.
    Error: Main method not found in class
  6.main method is pushed into method stack and code inside the main method is started.
  7.any object creation will execute the instance control flow 
  8.any object creation is done in heap young generation part
  9.any constant pool is created in heap in permanent generation part 
  10.any local variable is created in stack 
  11.other method call are also pushed into stack.
  12.method code is coped to method area for execution.
  13.any exception handling is handled by default handler if no exception handling is done in code.
  14.A demon thread is created which will run in back ground for garbage collection is done by GC on mark & sweep based algo 
  15.if any volatile and other variable are declared then those are created in register of the jvm
  16.if any native method is used in the execution then native method stack is used for pushing method call 
  17.native method interface is used for the connecting to the native code.
  18.all the java default library are loaded while execution of the class.
```