

## jshell 
* java REPL = read,evaluate,print,loop 
* any line start with pipe sysmbl its extra info from jshell 
* jshell can exeucte any java valid statement other then package 
* Most of the package is already imported in the jsell 
* jshell internal compiler will check the syntax 
* checked exception is ignored in jshell 


### help in jshell 
* list of option avaliable with jjshell 
  * akumar $ jshell --help  

* jshell infor 
  * jshell> /help intro 

* jshell command list 
  * jshell> /help

* info about any specific cmd 
  * jshell> /help command 

* to know list of cmd without discrption 
  * jshell> press tab 

* to know the cmd option in jshell 
  * jshell> cmd [press the tab]

### to start 
```
$ jshell 
|  Welcome to JShell -- Version 17.0.2
|  For an introduction type: /help intro
jshell>
```

### to use 
```
jshell> System.out.println("welcome to espark");
welcome to espark
```

### To exit 
```
jshell> /exit
|  Goodbye

or 

jshell> /ex 
|  Goodbye
```

### To list active snippet 
* package statement is not allowed other then all java valid statement is allowed 
* /list 
  * it will list all the type variable import class interface and mehods method call 
* /list 1snippitId,  2snippitId, ... NsnippitId
  * To list the snippet id 
* /list 1snippitName,  2snippitName, ... NsnippitName
  * To list the snippet name 

### setting up the custom editor with jshell 
* /set editor "path of the editor" // for only session 
* /set editor --retain "path of the editor" // for permanent 
* /set editor --default // default jshell editor to set for session use -retain for make it permanent 
* /set editor "c://programs/nodepad.exe"


### editing code snippet in editor 
* /edit 
* it will open the active code snippet in the editor and we can edit the code click on accept and exit 
* edited code will be avalibe in the jshell 

### instance method in jshell 
```
jshell> public void method(){
   ...>     System.out.println("welcome to espark");
   ...> }
|  created method method()

jshell> method()
welcome to espark
```
* method overloading 
```
jshell> public void method(String ...args){
   ...>      Arrays.asList(args).stream().forEach(System.out::println);
   ...> }
|  created method method(String ...)

jshell> public void method(int ...args){
   ...>      Arrays.asList(args).stream().forEach(System.out::println);
   ...> }
|  created method method(int ...)

jshell> method("adarsh");
adarsh

jshell> method(10,20);
[I@4edde6e5
```

* method overriding 
```
jshell> public void main(String ...args){
   ...>     System.out.println("welcom");
   ...> }
|  created method main(String ...)

jshell> main("adarsh");
welcom

jshell> public void main(String ...args){
   ...>     Arrays.asList(args).stream().forEach(System.out::println);
   ...> }
|  modified method main(String ...)
|    update overwrote method main(String ...)

jshell> main("adarsh");
adarsh
```

* we can diclared method with undiclared variable but can't use any  method untill its variable is diclared 
```
jshell> public void operaton(){
   ...>     System.out.println(var);
   ...> }
|  created method operaton(), however, it cannot be invoked until variable var is declared

jshell> operaton();
|  attempted to call method operaton() which cannot be invoked until variable var is declared

jshell> int var = 100
var ==> 100
|  created variable var : int
|    update modified method operaton()

jshell> operaton();
100
```

* we can diclared method with undiclared method but can't use any undiclared method untill its diclared 
```
jshell> public void operationTop(){
   ...>     operationBotton();
   ...> }
|  created method operationTop(), however, it cannot be invoked until method operationBotton() is declared


jshell> operationTop()
|  attempted to call method operationTop() which cannot be invoked until method operationBotton() is declared

jshell> public void operationBotton(){
   ...>     System.out.println("welcome to the espark");
   ...> }
|  created method operationBotton()
|    update modified method operationTop()

jshell> operationTop()
welcome to the espark
```

### static method in jshell 
```
jshell> public static void method(){
   ...>     System.out.println("welcome to espark");
   ...> }
|  modified method method()

jshell> method();
welcome to espark
```

### to list the active method sinippt 
```
jshell> /methods --all
|    void main(String ...)
|    void main(String ...)
|    void method(String ...)
|    void method(int ...)
|    void operaton()
|    void operationTop()
|    void operationbotton()
|    void operationBotton()
```

### To drop the method 
* /drop methodName, methodName,... NmethodName
```
jshell> /methods --all
|    void operationbotton()

jshell> /drop operationbotton
|  dropped method operationbotton()
```
* if multiple methods exists with same name all will be deleted 
```
jshell> /methods --all
|    void m()
|    void m(int)
|    void m(String)

jshell> /drop m
|  dropped method m()
|  dropped method m(int)
|  dropped method m(String)
```


### import statement in jshell 
```
jshell> import java.util.stream.Stream;

jshell> /imports -all 
|    import java.io.*
|    import java.math.*
|    import java.net.*
|    import java.nio.file.*
|    import java.util.*
|    import java.util.concurrent.*
|    import java.util.function.*
|    import java.util.prefs.*
|    import java.util.regex.*
|    import java.util.stream.*
|    import java.util.stream.Stream
```

### class in jshell 
```
jshell> public class Service{
   ...>     public static void main(String ...args){
   ...>         System.out.println("welcome to espark "+Arrays.asList(args));
   ...>     }
   ...> }
|  created class Service

jshell> Service.main("adarsh","radha");
welcome to espark [adarsh, radha]
```

### inteface in jshell 
```
jshell> public interface Service{
   ...>     public static void main(String ...args){
   ...>         System.out.println("welcome to espark"+Arrays.asList(args));
   ...>     }
   ...> }
|  replaced interface Service

jshell> Service.main("adarsh","radha");
welcome to espark[adarsh, radha]
```

### to list inteface in shell 
```
jshell> /types
|    interface Service
```


### enum in jshell 
```
jshell> enum Days{
   ...>     SUNDAY("FUNDAY"),MONDAY("WORKDAY"),TUSEDAY("TIRED");
   ...>     String desc;
   ...>     Days(String desc){
   ...>         this.desc = desc;
   ...>     }
   ...>     public String getDesc(){
   ...>         return this.desc;
   ...>     }
   ...> }
|  replaced enum Days
|    update overwrote enum Days

jshell> Days.SUNDAY.getDesc()
$6 ==> "FUNDAY"
|  created scratch variable $6 : String
```

### classes interface enum in jsheel 
```
jshell> interface Service{}
|  created interface Service

jshell> class PaidService implements Service{}
|  created class PaidService

jshell> enum Days{}
|  created enum Days

jshell> /types 
|    interface Service
|    class PaidService
|    enum Days
```

### Variable in Jshell 
* explict & implicit variable 
  * when variable is the result of any opration and its created automatically its implicit and its also know as strach variable to hold the operation result 
```
jshell> 10+20
$3 ==> 30
|  created scratch variable $3 : int

jshell> System.out.println($3);
30
```
  * when variable is created by programmer explicitly its explic variable 
```
jshell> int x = 20+30;
x ==> 50
|  modified variable x : int
|    update overwrote variable x : int

jshell> System.out.println(x);
50
```
* variable overriding in jshell is exisits 
  * when diclared a same variable with same name old copy will be replace with new copy and type 
```
jshell> int x = 10;
x ==> 10
|  created variable x : int

jshell> String x = "adarsh"
x ==> "adarsh"
|  replaced variable x : String
|    update overwrote variable x : int
```
* any java valid java variable creation statement is allowed 
```
jshell> List<String> list = List.of("adarsh","radha");
list ==> [adarsh, radha]

jshell> list.stream().forEach(System.out::println);
adarsh
radha
```
* To view the active variable 
  * /vars --all [name] [id]
  * /vars --all [name] [id]
  * /var --all [name] [id]
  * /v  --all [name] [id]

```
jshell> /vars -all 
|    List<String> list = (not-active)
|    List<String> list = [adarsh, radha]
```
* dropping variabe in jshell 
  * /drop variable-name 
  * /drop variable-id
```
jshell> /drop list 
|  dropped variable list

or 

jshell> 10+20
$3 ==> 30
|  created scratch variable $3 : int

jshell> /drop $3
|  dropped variable $3
```

### To Open java code from java file 
* create a file .jsh extention 
* go to the location where file is stored 
* /open file.jsh
* /list 


### To save the code sinippet to the file 
* /save fileName.jsh 
  * save only active sinnpet to the file 
* /save -history fielName.jsh 
  * save the sequential history of all cmd to file 
* /save -start fileName.jsh 
  * to save startup sinnpet to the file 
* /help save // to see the option of save cmd 


### To open the code snippet from .jsh files 
```

$ cat > sample.jsh
class Sample{
    public void operation(){
     System.out.println("welcome to espark");
   }
}
^C

* go to the location where sample.jsh file is created 
* $ jshell -v 
jshell> /open sample.jsh

jshell> /list

   1 : class Sample{
       public void operation(){
       System.out.println("welcome to espark");
       }
       }


jshell> new Sample().operation();
welcome to espark
```

### To set the jar files in the jshell 
* new jshell session 
  * jshell -v --class-path location-of-jarfile1.jar;location-of-jarfile2.jar;location-of-jarfileN.jar;
* existing jshell session 
  * jshell> /env --class-path location-of-jarfile1.jar;location-of-jarfile2.jar;location-of-jarfileN.jar;
* add the jar file in the classpath variable in system env variable 


### jshell startup snippet 
* at the time of jshell start some default jshell startup snippet will be executed 
* to list the startup snippt of the jshell 
  * /list -start     
```
jshell> /list -start 

  s1 : import java.io.*;
  s2 : import java.math.*;
  s3 : import java.net.*;
  s4 : import java.nio.file.*;
  s5 : import java.util.*;
  s6 : import java.util.concurrent.*;
  s7 : import java.util.function.*;
  s8 : import java.util.prefs.*;
  s9 : import java.util.regex.*;
 s10 : import java.util.stream.*;
```

* jshell -v
* or 
* jshell -v --startup DEFAULT
  * this will import all the default snippet in jshell 


* Printing option in jshell with PRINTING snippe 
```
$ jshell -v --startup PRINTING
|  Welcome to JShell -- Version 17.0.2
|  For an introduction type: /help intro

jshell> /list -start 

  s1 : void print(boolean b) { System.out.print(b); }
  s2 : void print(char c) { System.out.print(c); }
  s3 : void print(int i) { System.out.print(i); }
  s4 : void print(long l) { System.out.print(l); }
  s5 : void print(float f) { System.out.print(f); }
  s6 : void print(double d) { System.out.print(d); }
  s7 : void print(char s[]) { System.out.print(s); }
  s8 : void print(String s) { System.out.print(s); }
  s9 : void print(Object obj) { System.out.print(obj); }
 s10 : void println() { System.out.println(); }
 s11 : void println(boolean b) { System.out.println(b); }
 s12 : void println(char c) { System.out.println(c); }
 s13 : void println(int i) { System.out.println(i); }
 s14 : void println(long l) { System.out.println(l); }
 s15 : void println(float f) { System.out.println(f); }
 s16 : void println(double d) { System.out.println(d); }
 s17 : void println(char s[]) { System.out.println(s); }
 s18 : void println(String s) { System.out.println(s); }
 s19 : void println(Object obj) { System.out.println(obj); }
 s20 : void printf(java.util.Locale l, String format, Object... args) { System.out.printf(l, format, args); }
 s21 : void printf(String format, Object... args) { System.out.printf(format, args); }

jshell> println("welcome to espark ")
welcome to espark 
```

* jshell -v --startup JAVASE 
  * this will import all the java se import all 173 package statement in jshell 

* define own snippet in the file and save it as .jsh file 
* jshell -v --startup DEFAULT startup-snippet.jsh 
* DEFAULT is to ensuring that default snippet is also working with custom snippet 
```
$ cat > startup-snippet.jsh 
String msg ="welcome to espark"
^C 

$ jshell -v --startup DEFAULT startup-snippet.jsh 
welcome to espark
|  Welcome to JShell -- Version 17.0.2
|  For an introduction type: /help intro


jshell> /list -start 

  s1 : String msg ="welcome to espark";

jshell> System.out.println(msg);
welcome to espark

```

### checked exception in jshell 
* jshell is lenient with checked excpertion  
* in below snippet checked exception of FileNotFoundException is ignored by jshell compiler 
```
jshell> PrintWriter pw = new PrintWriter("a.txt")
pw ==> java.io.PrintWriter@1d81eb93

jshell> pw.println("welcome to espark");
```

## dropping snippett 
* /drop snippetId 
* /drop snippetName 
  * drop the snippet based on the id or name
```
jshell> /list 

   1 : 10+20
   3 : 10+20
   4 : System.out.println($3);
   5 : int x = 20+30;
   6 : System.out.println(x);

jshell> /drop 3
|  dropped variable $

jshell> /drop x 
|  dropped variable x
```

## execute snippet based on id 
* /snippetId 
  * it will execute the snippet direclty 
```
jshell> /list 

   1 : 10+20
   3 : 10+20
   4 : System.out.println($3);
   5 : int x = 20+30;
   6 : System.out.println(x);

jshell> /6
System.out.println(x);
50
```


### edit the snippet 
* /edit 
```
jshell> /edit
..............................................................
public static void main(String ...args){
System.out.println("welcome to espark");
}
..............................................................
click Accept and then Exit 

|  created method main(String ...)


jshell> main("adarsh")
welcome to espark

```


### Resotre the previous session snippet into the current session 
* /reload --restore 
```
$ jshell --v 
|  Welcome to JShell -- Version 17.0.2
|  For an introduction type: /help intro

jshell> int x =10
x ==> 10
|  created variable x : int

jshell> int y = 20
y ==> 20
|  created variable y : int

jshell> /exit 
|  Goodbye
$ jshell --v 
|  Welcome to JShell -- Version 17.0.2
|  For an introduction type: /help intro

jshell> /list 

jshell> /reload -restore
|  Restarting and restoring from previous state.
-: int x =10;
-: int y = 20;

jshell> /list

   1 : int x =10;
   2 : int y = 20;
```

### To reset the jshell to default state 
* /rest 
  * reset to the default state 
```
jshell> /list

   1 : int x =10;
   2 : int y = 20;

jshell> /reset
|  Resetting state.

jshell> /list

```