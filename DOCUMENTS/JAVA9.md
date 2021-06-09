

# JAVA 9 

---

### Modular programming 
> new optional phase, link time, which is in-between compile time and run time, during which a set of modules can be assembled and optimized into a custom runtime image



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
    MyResource r1 = new MyResource()

      try(r1;r2){
         
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

