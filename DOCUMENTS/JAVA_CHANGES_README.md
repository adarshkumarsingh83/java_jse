JEP java enhancement proposal 

## java 9 
	* List.of("xxx","xxx");
		* return unmodifiable copy of the collection or map 
```
     List<String> unmodifiableList = List.of("xxxx","yyyy");
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

