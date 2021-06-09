
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

