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

## @Safewareargs 
* static method
* final method 
* constructors 
* private method 

---

## G1Gc 
* Serial 
* Peraller 
* Concurrent mark ans swep 
* g1gc 
* To find the current GC running 
	* java -XX:+PrintCommandLineFlags -version
---

