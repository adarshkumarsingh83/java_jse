## JAVA9 NEW FEATURES 21 sept 2017 
---

## jshell 
* to start 
```
$ jshell 
|  Welcome to JShell -- Version 17.0.2
|  For an introduction type: /help intro
jshell>
```
* to use 
```
jshell> System.out.println("welcome to espark");
welcome to espark
```
* To exit 
```
jshell> /exit
|  Goodbye
```

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
* none of the element shoudln't be null otherwase NPE 
* Duplicate element are allowed 
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
* none of the  key or value shoudln't be null otherwase NPE 
* of() are with 10 element and one witth var args for more then 10 element 
* UnsupportedOperationException if tried to modified add/remove/update the unmodifiable connection 
---
## stream api enhancement 

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


