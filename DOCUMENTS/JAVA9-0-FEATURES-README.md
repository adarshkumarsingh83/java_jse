## JAVA9 NEW FEATURES (21 sept 2017 )

---

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

### [JSHELL HELP](./JAVA9-1-JSHELL-README.md)

---

## jpms(java plateform module system)
* JEP for modular programming development started in 2005  
* into in jdk 1.9 in 2017 
* jigsaw project is based for jpms 


![JPMS HELP](./JAVA9-2-JPMS-README.md)

---

## jlink 
### ![jlink doc](./JAVA9-3-JLINK-README.md)

---

## http2 client 
### [HTTP2CLIENT DOC](./JAVA9-4-HTTP2CLIENT-README.md)

---

### process api update JEP 102 
* into in jdk 
* create new process 
* get details of process parent & child process 
* destry the process 
* java.lang.Process class 
* java.lang.ProcessBuilder class 
* java.lang.ProcessHandle interface new in jdk1.9
  * java.lang.ProcessHandle.Info inner interface new in jdk1.9


### how to get the proceshandle instace 
* ProcecessHandle handle = ProcessHandle.curent();
* ProcessHandle handle = process.toHandle();
* Optional<ProcessHandle> handleOptional = ProcessHandle.of(processId);
* ProcessHandle.Info info = handle.info();
  * Optional<String> user = info.user();  // which user has started this process 
  * Optional<String> cmd = info.command(); //which cmd has started this process 
  * Optiona<Insant> optio = info.startInstant(); // when  this process is started 
  * Optional<Duration> opt = info.totalCpuDuration(); // cpu duration for this process
* Stream<ProcessHandle> stream = ProcessHandle.allProcess(); // to get all the running procewss  
* Stream<ProcessHandle> chld = processHandle.children(); // to get all the child process 
* to do action on exiting of the process 
```
ProcessBuild pb = new ProcessBuild(xxx,xx);
Process p = pb.start();
CompletableFuture<Process> feature = p.onEdit();
sout(feature.get());
```


* To start Nodepad 
```
ProcessBuilder pb = new ProcessBuild("notepad","filename.txt");
pb.start();
```

* To compile java code
```
ProcessBuilder pb = new ProcessBuild("javac","XXX.java");
pb.st
```


* To execute java code
```
ProcessBuilder pb = new ProcessBuild("java","XXXFileName");
pb.st
```


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


