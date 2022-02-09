JEP java enhancement proposal 


## java 7 based on the imperative style of proggramming 
	* try -with-resource 

```
public class Resource implements AutoCloseable{

   public void operation(){
   	sout("operation");
   }

	public void close(){
		sout("clean up ");
	}
}

try(Resource res= new Resource()){
	res.operation();
}

```

---

## java 8 based in functional programming 
	* interface 
		* public default method 
		* public static method 
	* signle underscore as varname is warnning 
	* streamObject.limit(Predicate)
		* once predicate is true it will close for ever
	* streamObject.skip(Predicate)
		* once predicate is true it will open for ever
	* IntStream.iterate()
		* IntStream.range(0,5).forEach(System.out::println)
		* IntStream.rangeClosed(0,5).forEach(System.out::println)
---

## java 9 
	* modeules 
		* allowd to create small deployment jars what is really needed. 
		* can't create same package with same class to break security 
		* dependency graph can be used at compile time and run time what is really need for run the code 
			* module graph is part of jar file so that ensure all dependency are avalable 
			* java --list-modeules // to list them modules in the env  
			* classpath 
				* where classes are reside 				
				* java -claasspath dir/jarfile.jar package.className
			* modeul path 
				* where the module is reside 
				* module avaliable in class path is part of unamed module 
				* java -p module-dir-path -m module-name/package.className
		* unamed module 
			* is part of class path and only one is allowed in one applicaion 
			* when jar is put in class paht and run from their its a unamed module 		
		* automatic module 
			* when jar file is put in the modulepaht and run from their its a automatic module 
			* create on the fly 
		* explictly module 
			* when the module info is provided in the module-info.java file inside the module 
		* how to find the module name 
			* jar -f path.jarfile.jar -d 
	* annonimus class with dimando operator 
```
new ClassName<>(){
	{
		method(xxx);
	}
};
```		
	* collection.of() for unmodifyable collection 
		* list.of()
		* set.of()
			* duplicate not allowd 
		* map.of()
			* without strict key and value type 
		* map.<KT,VT>of()
			* with strict key and value type 	

	* Completable Future 
		* deadlock wiating for resource 
		* livelock wiating for resources which may never get 
		* completeOnTimeout()
			* stop the thread if time is out and provide subsitue value 
		* orTimeOut()
			* stop the thread if time is out and errors out and timeout exception 
	* Optional stream
		* get the steam of the optional 
```
list.stream()
	.filter(e-> e>5)
	.findFirst() //optional 
	.stream()
	.forEach(System.out::println);
```
	* Optional.ifPresentOrElse()
```
 Optional.ifPresentOrElse(()->{ sout("value present")},()->{ sout("value not present")})
 ```	
	* IntStream.iterate()
		* IntStream.iterate(seedValue,function)
```
	IntStream.iterate(0,(int i)-> < 10, (i)-> i+1)
		.takeWhile(i-> i<5)
			.forEach(System.out::println);
```
		* IntStream.iterate(seedValue,[predicate],function)
```
	IntStream.iterate(0,(int i)-> < 10, (i)-> i+1)
		.forEach(System.out::println);
```
	* streamObject.takeWhile(Predicate)
		* once predicate is true it will close for ever
	* streamObject.dropWhile(Predicate)
		* once predicate is true it will open for ever
	* single underscore as varname is error 
	* deprecated finilized()
	* List.of("xxx","xxx");
		* return unmodifiable copy of the collection or map 
```
     List<String> unmodifiableList = List.of("xxxx","yyyy");
```
	* interface 
		* private instance method 
		* private static method 
		* private defualt is not allowed 
	* try-resources 
		* variable is efffetively final or final when its as reference to method 
		* resource can be accessable outside of the try block after the block excecutione and close() invocaton 
```
public class Resource implements AutoCloseable{

   public void operation(){
   	sout("operation");
   }

	public void close(){
		sout("clean up ");
	}
}

public void resourceOperation(final Resource res){
   try(res{
	res.operation();
   }
}

psvm(){
	resourceOperation(new Resource())
}
```

---

## java 10 
	* OPtioanl.orElsethrow()
	* Collectors
		* toUnmodifiableList();
		* toUnmodifiableSet();
		* toUnmodifiableMap();
	* List,Set,Map xxx.copyOf();
		* return unmodifiable copy of the collection or map 
		* will return the same object if the original object is its self immutable 
		* element can't be null in collections 
		* collection should not be null 
```
 List<String> list = new ArrayList<String>();
  list.add("xxx");
  list.add("yyy");
     List<String> unmodifiableList = list.copyOf(list);
```
	* var keywork (resolved at compile time)
		* var keyword for local variable 
		* final keyworld with var keyword 
		* var can be used in loops also 
		* cannot assigne null to var
		* var is not keyword 
			* var var = 1;
```
List list1 = List.of("xxx","yyy");
List list2 = List.of("xxx","yyy");
List<List<String>> topList = List.of(list1,list2);
or 
var topList = List.of(list1,list2);
or 
final var topList = List.of(list1,list2);
```
	

----


## java 11
	* var keyworld for the lambda 
		* (var x) -> sout(x);
	* IO 
		* InputStream nullInputStream()
		* OutputStream nullOutputStream()
		* Reader nullReader()
		* Writer nullWriter()
	* Optioanl	
		* isEmpty()
	* Character
		* toString(int)
	* Signgle File source Code 
```
#!$JAVA_HOME/bin/java --source 11 
public class Wish{
	public static void main(String[] args){
		System.out.println("welcome "+args[0]);
	}
}
$ ./Wish adarsh
```

	* String.transform(function);
		* transform the string based on provided function 
```
"adarsh".transform(e-> t.toUppper());
```
	* Strinng.formatted(args1,args2.....argsN);
	* String.lines();
		* return stream of lines 
		* print the data in seprarte lines where it find "\n" in string 
```
"xxx\nxxx\nxxx\n".lines().forEach(System.out::print);
``` 
	* String.repeat();
		* to repeate the stirng 
	* String.strip();
		* remove the leading and trailing spaces 
	* String.stripLeading();
		* remove the leading spaces 
	* String.stripTrailing();
		* remove the trailing spaces 	
	* String.isBlank();
		* return boolean if empty or contains only whitespaces		
```
"".isBlank();
"   ".isBlank();
```

	* File.readString()
```
Path path = Paths.get("./resources/sample.txt")
String fileData = Files.readString(path);
```

	* File.writeString()
```
Path path = Paths.get("./resources/sample.txt")
Files.writeString(path,"xxx content xxx ");
```

	* Predicate.not
```
  List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
  Predicate<Integer> evenNumber = number -> number % 2==0;
  list.stream().filter(evenNumber).forEach(System.out::print);
  // for odd number
  list.stream().filter(evenNumber.negate()).forEach(System.out::print);

  public static boolean isEven(Integer number){
  	return number -> number % 2==0;
  }

  // to print the even using static method 
  number.stream().fkilter(Class::isEven).forEach(System.out::print);
  // to print the odd  using  method and predicate not 
  number.stream().fkilter(Predicate.not(Class::isEven).forEach(System.out::print);
```	
	* NullPointerException is clear with messages for what we are getting null 

---

## java 12
	* swtich Expression preveiw 
		* statement which will not return result earlier switch 
		* expression which will return result new switch 
```
String msg = swtich("xxx"){
	
}

```

---

## java 14
	* swtich expression 
		* preview in 12 and 13 jdk 
		* released in jdk 14 
		* no fallthrow in new switch 
```
  var option = switch(input){
  	case 0 -> "xxx";
  	case 1 -> "yyy";
  	case 10 -> {
  		System.out.println("xxxxx");
  		yield "zzzz";
  	}
  	default -> throw new IllegalArgumentException("invlid option");
  }
```
	* instanceof
		* store the type from instanceof to the variable for further use 
```

   if(abstract instanceOf Implement1 implementTempVar){
   	       implementTempVar.methodOfImplement1();
   }
```

---

## java 15 
	* Text Block 	
		* to print the String with its format 
		* preview in 13 and 14 jdk 
		* released in jdk 15 
```
System.out.println("""
xxxxxx
yyyyyy
zzzzz
""");
```

## java 16 
	* records 
		* bean class with constructors 
		* bean class with equals, hashcode and toString()
		* bean class with getters 
		* preview in jdk 14 and 15 
		* release in jdk 16 
		* can't have instaic vairable and instance initalizers 
```
record Person(String name,String email,String phone){
}
Person person = new Person("adarsh","adarsh@kumar","987676554321");
person.name();
```
		* compact consturctor 
```
record Person(String name,String email,String phone){
	Person {	
	    if(email == null){
	    	throw new IllegalArgumentException("Null email not allowed");
	    }	
	}
}
```
		* can have static fields static initilizers and static method 
```		
record Person(String name,String email,String phone){
	static int value; 
	Person {	
	    if(email == null){
	    	throw new IllegalArgumentException("Null email not allowed");
	    }	
	}
}
```
		* instance method is allowd 
````
record Person(String name,String email,String phone){
	static int value; 
	Person {	
	    if(email == null){
	    	throw new IllegalArgumentException("Null email not allowed");
	    }	
	}

	public String name(){
		System.out.println("name method ");
		return this.name;
	}
}
````

---

##	java 17 
	* sealed classes/interface  
		* who can extends the parent classes 
		* child class of sealed class must be final ,sealed or non-sealed 
```
public  sealed abstract class Parent permits Child1{

}

pulic final class Child1 extended Parent {

}

```
		* sealed iterface

```
public sealed interface Parent permits Child1{

}

pulic non-sealed class Child1 implements Parent {

}
```

