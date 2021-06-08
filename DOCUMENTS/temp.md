

9 

### 
----

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

----

### Jshell 
*  jshell --enable-preview 

### Factory method for Immutable collection 
* List.of(xxxxx,xxxxx,xxxxx)
* Set.of(xxxxx,xxxxx,xxxxx)


----
11
### Var Keyword 
* var x = 10;


---
12
### Swtich case
```
var value = Xxxl;
var response = switch(value){
	case 1 -> "XXX";
	case 2 -> "XXX";
	case 3 -> "XXX";
	default -> "-----xxx---";
}


```

---
13
### multi line string 
```
var data = """
			{
             "key":"value",
			 "key":"value"
			}
			""";

```


