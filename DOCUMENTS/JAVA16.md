JAVA 16 CHANGES 

---

###  Invoke Default Methods From Proxy Instances
```
interface HelloWorld {
    default String hello() {
        return "world";
    }
}

Object proxy = Proxy.newProxyInstance(getSystemClassLoader(), new Class<?>[] { HelloWorld.class },
    (prox, method, args) -> {
        if (method.isDefault()) {
            return InvocationHandler.invokeDefault(prox, method, args);
        }
        // ...
    }
);
Method method = proxy.getClass().getMethod("hello");
assertThat(method.invoke(proxy)).isEqualTo("world");
```

### Add Stream.toList Method
```
List<String> integersAsString = Arrays.asList("1", "2", "3");

* old way 
List<Integer> ints = integersAsString.stream().map(Integer::parseInt).collect(Collectors.toList());


* new way 
List<Integer> intsEquivalent = integersAsString.stream().map(Integer::parseInt).toList();
```

### Records 
* Records were introduced in Java 14. Java 16 brings some incremental changes.
* With the release of Java 16, we can now define records as class members of inner classes
```
public record Book(String title, String author, String isbn) {
}

class OuterClass {
    class InnerClass {
        Book book = new Book("Title", "author", "isbn");
    }
}
```


### Sealed Classes
* Sealed classes, first introduced in Java 15, provide a mechanism to determine which sub-classes are allowed to extend or implement a parent class or interface.
	* sealed – meaning they must define what classes are permitted to inherit from it using the permits keyword.
	* final – preventing any further subclasses
	* non-sealed – allowing any class to be able to inherit from it.

```
public sealed interface Vechical permits Car, Truck  {
}

public final class Car implements Vechical {
}

public non-sealed class Truck implements Vechical {
}

Vechical v = // some JungleAnimal instance

if (v instanceof Car c) {
    // do logic
} else if (v instanceof Truck t) {
    // do logic
}
```
* few additions to sealed classes in Java 16.
	* The Java language recognizes sealed, non-sealed, and permits as contextual keywords (similar to abstract and extends)
	* Restrict the ability to create local classes that are subclasses of a sealed class (similar to the inability to create anonymous classes of sealed classes).
	* Stricter checks when casting sealed classes and classes derived from sealed classes


### Day Period Support Added to java.time Formats
```
 System.out.println( DateTimeFormatter.ofPattern("B").format(LocalTime.now()));
in the afternoon
```

