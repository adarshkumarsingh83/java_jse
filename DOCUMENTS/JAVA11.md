
# JAVA 11

---


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
### readString(Paht.of(path of file ))

### writeString()

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

### Predicate.not(Predicate p) for other then predicate value 
```
// in jdk8 
public static boolean isEven(int n){
	return n % 2 ==0 ;
}

IntStream.range(0,10).stream().filter(((Predicate<Integer>)(Sample::isEven)).negate()).forEach(System.out.println);
// or 
IntStream.range(0,10).stream().filter(((Predicate<Integer>)(e->e%2==0)).negate()).forEach(System.out.println);

// in jdk11 


IntStream.range(0,10).stream().filter(Predicate.not(Sample::isEven).forEach(System.out.println);
// or 
IntStream.range(0,10).stream().filter(Predicate.not(e->e%2==0)).forEach(System.out.println);

```