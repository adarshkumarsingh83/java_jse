

# JAVA 9 

---

### Modular programming 
> new optional phase, link time, which is in-between compile time and run time, during which a set of modules can be assembled and optimized into a custom runtime image

*  To list the java moduels 
  * $ java --list-modules 

* To veiw module jar contnet 
  * jar -f xyx.jar -d 

```
# Unammed Module 
- any jar runing in classpath without module descriptor is class an unamed module 
> therir are many module in project but only one unammed module in classpath i

# Automatic Module 
- any traditional jar running is module path is a automatic module 
> old jar file runing in module path 

# Explict Name Module 
- any jar running in module path with module descriptor is a explicty nameed module  and if run in classpath is again unnammed module 
> new jar with module descriptor in module path 
  
- module can't share packages 
- unamed module can talk to other unamed modules 
- automatic modules can talk to other automatic modules 
- automatic modules can tlak to unamed modules 
- an explicit named module can talk to other explict named module 
- an explict name module can talk to automatic modules 
- and explicit named module can't talk to unamed modules 
- and explicit named module has to requries any nmodules it need 
- an explicit name modules exports only what is specifically exported 
- and automatic named modules automatically export all its packages 

```

### Versioning format 

* $MAJOR.$MINOR.$SECURITY.$PATCH


### Jshell 

*  jshell --enable-preview 


### chars()

```
 String s = "xxxxxxxxxx";
 s.chars().forEach(x-> System.out.println((char)x));
```

### codePoints()

```
 String s = "\uface\ubeaf";
 s.codePoints().forEach(x-> System.out.println(x));
```

### Try with Resources 

```
 //Note R2 will close then R1 in reverse order of diclration 
 // catch block execution 
 // finally will be close at last 
  public static void main(String ...args){

       doOperation();       
  }

  public static void doOperation(){
  
       try(MyResource r1 = new MyResource();
          MyResource r1 = new MyResource()){
         
         ......................

      }catch(Exception e){
         System.out.println(":()");
      }finally{
         System.out.println(":(");
      }

  }
 
 class MyResource implement AutoCloseable{
 	 public void close()throrws Exception{
 	 	 System.out.println("clse");
 	 }
 }


 // In java 9 now we can diclar like this 
 //exception will not be handle by catch block now 

   public static void main(String ...args){
   	MyResource r1 = new MyResource();
    MyResource r2 = new MyResource()
      doOperation(r1,r2);
  }

  // MyResource is bydefault effectively final/ final 
  public static void doOperation(final MyResource r1,final MyResource r2 ){
  
       try( r1;r2){
         
         ......................

      }catch(Exception e){
         System.out.println(":()");
      }finally{
         System.out.println(":(");
      }
  }

 
 class MyResource implement AutoCloseable{
 	 public void close()throrws Exception{
 	 	 System.out.println("clse");
 	 }
 }

```


### Factory method for Immutable collection 

* List.of(xxxxx,xxxxx,xxxxx)
* Set.of(xxxxx,xxxxx,xxxxx)

---

### Interfaces 

* private method 
```
interface Util{
     privagte retrntype methodName(types argsName ){

        -----------xxxxx----------------
        return value;
     }

}
``` 

* private static method 
```
interface Util{
     privagte static retrntype methodName(types argsName ){

        -----------xxxxx----------------
        return value;
     }

}
``` 

### finilized() in Object class is depracated 


### Underscore as only identifieer Errors 
```
int _ = 10;
```

### takeWhile(Predicate p)
```
List<Integer> numbers = Arraya.asList(10,20,30,40,50);
numbers.stream().takWhile(e-> e > 38).forEach(System.out::println);
```

### dropWhile(Predicate p)
```
List<Integer> numbers = Arraya.asList(10,20,30,40,50);
numbers.stream().dropWhile(e-> e > 26).forEach(System.out::println);
```


### loop in functional style 
* iterate(seed,function);
* iterate(seed,[predicate],function);
```
// imprative style 
//for(seed;predicate;function)
  for(int i=0;i<=15;i=i+2){
    System.out.println(i);
  }

// functional style 
// iterate(seed,function);
// iterate(seed,[predicate],function);
  IntStream.iterrate(0,i-> i <=15, i-> i+2)
        .forEach(System.out::println);

```

### loop without prediate
```
  for(int i=0; ;i=i+2){
    if(i<=15){
      break;
    }
    System.out.println(i);
  }
  or 
  IntStream.iterrate(0, i-> i+2)
        .takeWhile(i-> i<=15)
        .forEach(System.out::println);

```

### ifPresentOrElse(value -> {"true part of if "} ,()->{ " runnable object for else part " })
```
 Optional<Integer> optional = IntStream.range(0,6).stream().filter(e-> e>10).findFirst();
 optional.ifPresentOrElse(value -> System.outl.println("The Value is "+value), () -> System.out.println("Value not Found "));
```


### Stream from Optional 
````
 Optional<Integer> optional = IntStream.range(0,6).stream().filter(e-> e>10).findFirst();
 optionl.stream().forEach(System.out.println);
```
















