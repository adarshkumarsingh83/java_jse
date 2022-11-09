## JAVA9 NEW FEATURES (21 sept 2017 )

---

## jshell 

### TO Get jshll help 
```
jshell> /help
```

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
```

### To list active snippet 
* package statement is not allowed other then all java valid statement is allowed 
* /list 
* it will list all the type variable import class interface and mehods method call 

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
 jshell> /methods -all
|    void method()
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
jshell> public enum Days{
   ...>     SUNDAY,
   ...>     MONDAY,
   ...>     TUESEDAY,
   ...> }
|  created enum 

jshell> Days.SUNDAY
$23 ==> SUNDAY
```


### Variable in Jshell 
* explict & implicit variable 
* variable overriding in jshell is exisits 
* any java valid java variable creation statement is allowed 
```
jshell> List<String> list = List.of("adarsh","radha");
list ==> [adarsh, radha]

jshell> list.stream().forEach(System.out::println);
adarsh
radha
```
* To view the active variable 
  * /vars --all
```
jshell> /vars -all 
|    List<String> list = (not-active)
|    List<String> list = [adarsh, radha]
```
* dropping variabe in jshell 
  * /drop variable-name 
```
jshell> /drop list 
|  dropped variable list
```


### To Open java code from java file 
* create a file .jsh extention 
* go to the location where file is stored 
* /open file.jsh
* /list 

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

---

## jpms(java platefomr modeul system)


---

## jlink 
* to create custom jre 

---

## http2 client 

---

## process api 

---

## private method in interface 
* all varable is public static final until 1.7 
* all method is public abstract until 1.7
* default method from 1.8 
* static method from 1.8 
* private method from 1.9 
> private instace & static method is helper method for the default/static method inside interfacce and its not visible to the \
> implementing class so by adding it don't impace implemting class \
> objective is for code reusablity without effecting implemting classes in the interface 
```
Problem 
interface Service {

    default/static void doService1(){
    	 //do xxx operation 
    	// perform service 
    	// do yyy operation
    }

     default/static void doService2(){
    	 //do xxx operation 
    	// perform service 
    	// do yyy operation
    }

     ......

     default/static void doServiceN(){
    	 //do xxx operation 
    	// perform service 
    	// do yyy operation
    }

}

Solution 

interface Service {

    default/static void doService1(){
    	xxxOperation()
    	// perform service 
    	yyyOperation()
    }

     default/static void doService2(){
    	xxxOperation()
    	// perform service 
    	yyyOperation()
    }

     ......

     default/static void doServiceN(){
    	 xxxOperation()
    	// perform service 
    	yyyOperation()
    }

    private void xxxOperation(){
    	 //do xxx operation 
    }

    private void yyyOperation(){
    	 //do yyy operation 
    }
    or 
    private static void  xxxOperation(){
    	 //do xxx operation 
    }

    private static void yyyOperation(){
    	 //do yyy operation 
    }

}

```


---
## try with resouce enhancement 
* into in 1.7 
* resource will be closed at the end of try block automatically 
* multiple resources can be open in try seprated by semicolon but all resources must be autoclosable 
* resources reference variable is final and can't be reassignement to resouerce reference variable 
* resource reference variable must be local to try block 
```
public class Resource implements AutoCloseable{

   public void operation(){
   	sout("operation");
   }

	public void close(){
		sout("clean up ");
	}
}


    try(Resouxe r = new Resouse("resource-name")){

       	......
  	}catch(Exception e){
  		......
  	}

  	or 

  	Resouxe r = new Resouse("resource-name")
  	 try(Resouxe r1 = r){

       	......
  	}catch(Exception e){
  		......
  	}

```
* enhancement 1.9
* resource created outside of try can be used direclty 
```

public class Resource implements AutoCloseable{

   public void operation(){
   	sout("operation");
   }

	public void close(){
		sout("clean up ");
	}
}


  	Resouxe r = new Resouse("resource-name")
  	 try(r){

       	......
  	}catch(Exception e){
  		......
  	}
```


---
## factory method for unmodificable collection 
### List 
* List.of(x,x,...N)
```
  public static <E> java.util.List<E> of();
  public static <E> java.util.List<E> of(E);
  public static <E> java.util.List<E> of(E, E);
  public static <E> java.util.List<E> of(E, E, E);
  public static <E> java.util.List<E> of(E, E, E, E);
  public static <E> java.util.List<E> of(E, E, E, E, E);
  public static <E> java.util.List<E> of(E, E, E, E, E, E);
  public static <E> java.util.List<E> of(E, E, E, E, E, E, E);
  public static <E> java.util.List<E> of(E, E, E, E, E, E, E, E);
  public static <E> java.util.List<E> of(E, E, E, E, E, E, E, E, E);
  public static <E> java.util.List<E> of(E, E, E, E, E, E, E, E, E, E);
  public static <E> java.util.List<E> of(E...);
```
* for empty list no args of() has to be used 
* none of the element shoudln't be null otherwase NPE 
* Duplicate element are allowed otherwise IllegalArugment Excpetion 
* of() are with 10 element and one witth var args for more then 10 element 
* UnsupportedOperationException if tried to modified add/remove/update the unmodifiable connection 

### Set 
* Set.of(x,x,....N)
```
  public static <E> java.util.Set<E> of();
  public static <E> java.util.Set<E> of(E);
  public static <E> java.util.Set<E> of(E, E);
  public static <E> java.util.Set<E> of(E, E, E);
  public static <E> java.util.Set<E> of(E, E, E, E);
  public static <E> java.util.Set<E> of(E, E, E, E, E);
  public static <E> java.util.Set<E> of(E, E, E, E, E, E);
  public static <E> java.util.Set<E> of(E, E, E, E, E, E, E);
  public static <E> java.util.Set<E> of(E, E, E, E, E, E, E, E);
  public static <E> java.util.Set<E> of(E, E, E, E, E, E, E, E, E);
  public static <E> java.util.Set<E> of(E, E, E, E, E, E, E, E, E, E);
  public static <E> java.util.Set<E> of(E...);
```
* for empty set no args of() has to be used 
* none of the element shoudln't be null otherwase NPE 
* all element must be unique otherwiase IllegalArgumentExcpetion 
* of() are with 10 element and one witth var args for more then 10 element 
* UnsupportedOperationException if tried to modified add/remove/update  the unmodifiable connection 


### Map 
* Map.of(K,V....N)
```
  public static <K, V> java.util.Map<K, V> of();
  public static <K, V> java.util.Map<K, V> of(K, V);
  public static <K, V> java.util.Map<K, V> of(K, V, K, V);
  public static <K, V> java.util.Map<K, V> of(K, V, K, V, K, V);
  public static <K, V> java.util.Map<K, V> of(K, V, K, V, K, V, K, V);
  public static <K, V> java.util.Map<K, V> of(K, V, K, V, K, V, K, V, K, V);
  public static <K, V> java.util.Map<K, V> of(K, V, K, V, K, V, K, V, K, V, K, V);
  public static <K, V> java.util.Map<K, V> of(K, V, K, V, K, V, K, V, K, V, K, V, K, V);
  public static <K, V> java.util.Map<K, V> of(K, V, K, V, K, V, K, V, K, V, K, V, K, V, K, V);
  public static <K, V> java.util.Map<K, V> of(K, V, K, V, K, V, K, V, K, V, K, V, K, V, K, V, K, V);
  public static <K, V> java.util.Map<K, V> of(K, V, K, V, K, V, K, V, K, V, K, V, K, V, K, V, K, V, K, V);
  public static <K, V> java.util.Map<K, V> ofEntries(java.util.Map$Entry<? extends K, ? extends V>...);
```
* for empty map no args of() has to be used 
* none of the  key or value shoudln't be null otherwase NPE 
* duplicate key is not allowed otherwise IllegalArugment Excpetion value can be duplicate 
* of() are with 10 element and for more then 10 element then ofEntries() has to be used 
* UnsupportedOperationException if tried to modified add/remove/update the unmodifiable connection 
```
Map.Entiry<KType,VType> entry1 = Map.entry(key,value);
Map.Entiry<KType,VType> entry2 = Map.entry(key,value);

Map.Entiry<KType,VType> entryN = Map.entry(key,value);

Map<KType,VType> map = Map<KType,VType>.ofEntires(entry1,entry2,...entryN);

```
---

## stream api enhancement 
* Collection: group of object stored in speicifc type of structure as the single eneity 
* Stream: to process the group of object stored in the collections 
* java.util.stream.* is the base package for streams 
* filter(),map(),flatMap() 
* jdk 1.9 enhancement 
* streamObject.takeWhile(Predicate)
  * default methods 
  * predicate is the argument for this method 
  * consider the stream elements untill predicate is true, once predicate is false it will stream will be close for ever and rest of the element will be discarded 
* streamObject.dropWhile(Predicate)
  * default methods 
  * predicate is the argument for this method 
  * once predicate is true it will discard the stream element once its false it will open for ever and return all the element of the stream 
* Stream.iterate()
  * static methods 
  * iterate(2 args) intro in jdk 1.8
    * iteratre(T initValue, UnarayOpeator operator)
    * initvalue to iterate , operator for generate next value 
    * Stream.iterate(1,x->x+1).forEach(System.out::print)
  * iterate(3 args) intro in jdk 1.9
    * Stream.iterate(T initValue,Predicate p, UnarayOpeator operator)
    * initvalue to iterate ,predicate for iteratation, operator for generate next value 
    * Stream.iterate(1, x-> x<10 , x->x+1).forEach(System.out::print)
* Stream.ofNullable()
  * static methods 
  * to prevent NPE in the stream 
  * Stream.ofNullable(object)
  * if args is null then empty stream will be return if element is not null then stream of args object 
  * mnostly used with flatMap()
  * listObject.stream().flatMap(e -> Stream.ofNullable(x)).collect(Collectors.toList()); // null element will be skip in the stream 

---
## diomanod operator enhancment 
* into in jdk 1.7 
* generic into in 1.5 to resolve type casting and provide type safty 
* diamond operator is applicable for normal classes not for annonimus classes 
* diomand operator is for skipping type param while construcotr call which is type inference but at the time of diclaration its mandatory 
	* List<String> list = new ArrayList<>();
	* to provide the improved readablity of the code 
* enhancemnt in jdk 1.9 (java enchancement proposal 213)
* from jdk 1.9 its applicable for annonimus inner class also 
* class without name is annonins class 
```
interface Service<T>{
	void operation(T d);
}

psv main(String ...args){

	Service<String> s = new Service<>(){
   
       void operation(T d){
       	 ........
       }
	};
}
```

---

## @Safewareargs Enhancment 
* into in jdk 1.7 
* to suppress the compiler warnning for varargs method and heap polution problem 
* applicable for static method, final method & constructors 
* variable number of argument which is vargs in jdk 1.5 with eg returnType methodName(ArgsTpye... variableName)
* type of memoary 
	* heap memo
	* stack 
	* pc register 
	* method area 
	* native method stack 
* heap pollution problem 
 * when one type of variable is pointing to other type object at runtime which is not compatable it cause class cast exception and heap polution 
 ```
   psv main(String ...args){
   	display(Arrays.asList("a","b"),Arrays.asList("c","d"))
   }
   psv display(List<String> l){
   	 Ojbect[] a =l;
   	 a[0]=Arrays.asList(10,20);
   	 String name =(String)l[0].get(0);
   	 Sop(name);
   }
 ```
* when ever var-args is used with generic compiler will raise warnning even though reassigment is not their with generic to resolve this @Safevargs is used 
 ```
   psv main(String ...args){
   	display(Arrays.asList("a","b"),Arrays.asList("c","d"))
   }
   @SafeVargs
   psv display(List<String> l){
   	sout(l);
   }
 ```
* enhancment came in jdk 1.9 
*  from jdk 1.9 @safevargs can be used for private method 

---

## G1Gc 
* Serial 
* Peraller 
* Concurrent mark ans swep 
* g1gc 
* To find the current GC running 
	* java -XX:+PrintCommandLineFlags -version
---


