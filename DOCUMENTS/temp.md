
----
# 9 

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

----

### Jshell 
*  jshell --enable-preview 

### Factory method for Immutable collection 
* List.of(xxxxx,xxxxx,xxxxx)
* Set.of(xxxxx,xxxxx,xxxxx)

---
# 10 

### var keyword 
* var x= 10;
* assignement of null value is not possible expect type value is expected 
* based on the value assiged type is defined 
* reassignment of the differnt type is not possible 
* var as return type of method is not possible 
* var as method param is not possible 
* var as a identifier not possible 
* can be used in loop 
  ```
    for (var x : list){
    	System.out.println(x);
    }
  ``` 



----
# 11

### Var Keyword 
* var x = 10;
* var with predicate 
```
Predicate<Integer> p1 = x -> x % 2 == 0;
Predicate<Integer> p1 = (x) -> x % 2 == 0;
Predicate<Integer> p1 = (Integer x) -> x % 2 == 0;
or now 
Predicate<Integer> p1 = (var x) -> x % 2 == 0;
```


### repeat()
```
  String s ="radha ";
  s = s.repeat(3);
  System.out.printf("=> "+s);

```

### strip()
```
String s ="      radha       singh ";
        s = s.strip();
        System.out.printf("=> "+s);
```

#### stripLeading()
```
String s ="      radha       singh ";
        s = s.stripLeading();
        System.out.printf("=> "+s);
```

### stripTrailing()
```
String s ="      radha       singh ";
        s = s.stripTrailing();
        System.out.printf("=> "+s);

```

### isBlank()
````
String s ="      ";
System.out.printf("=> "+s.isBlank());
````

### lines()
```
String s ="   Adarsh\nRadha   ";
s.lines().forEach(System.out::println);
```

---

# 12

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

### indent()
```
 String s ="Adarsh\nRadha";
        s = s.indent(3);
        System.out.println(s);
```


### transform()
```
String s ="Adarsh\nRadha";
        s = s.transform(x -> x.toUpperCase());
        System.out.println(s);
```

---

# 13

### multi line string 
```
var data = """
			{
             "key":"value",
			 "key":"value"
			}
			""";

```


