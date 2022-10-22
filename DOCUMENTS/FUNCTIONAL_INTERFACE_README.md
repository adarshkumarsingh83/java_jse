# java.util.function.*

---
## Predicate<T>
* for testing any condition and return boolean 
*  T denotes the input parameter type.
```
public interface Predicate<T> {
    boolean test(T t);
}

Predicate<Integer> p = (i) -> (i > -10) && (i < 10);
System.out.println(p.test(9));
```

### default & static methods 

## Predicate<T>
```
default Predicate<T> and(Predicate<? super T> other)
```
* Returns a composed predicate that represents a short-circuiting logical AND of this predicate and another.

```
static <T> Predicate<T> isEqual(Object targetRef)
```
* Returns a predicate that tests if two arguments are equal according to Objects.equals(Object, Object).

```
default Predicate<T> negate()
```
* Returns a predicate that represents the logical negation of this predicate.

```
default Predicate<T> or(Predicate<? super T> other)
```
* Returns a composed predicate that represents a short-circuiting logical OR of this predicate and another.

```
default Predicate<T> not(Predicate<? super T> other)
```
* to 
----


## BiPredicate<T, U>
* T & U are input parameter types
```
interface BiPredicate<T, U> {
    boolean test(T t, U u)
}
BiPredicate<Integer,Integer> bp = (i,j)->(i+j) %2==0; 
System.out.println(bp.test(24,34)); 
```


### default & static methods 

## BiPredicate<T, U>
```
default BiPredicate<T, U> and(BiPredicate<? super T, ? super U> other)
```
* Returns a composed predicate that represents a short-circuiting logical AND of this predicate and another.

```
default BiPredicate<T, U> negate()
```
* Returns a predicate that represents the logical negation of this predicate.

```
default BiPredicate<T, U> or(BiPredicate<? super T, ? super U> other)
```
* Returns a composed predicate that represents a short-circuiting logical OR of this predicate and another.


---

## Function<T, R> 
* function is for performing any opration and return any type 
* T is method input parameter & R is return type

```
interface Function<T,R> { 
    R apply(T t);
}

Function<String, Integer> f = s -> s.length(); 
System.out.println(f.apply("I am happy now")); 
```

### default & static methods 

## Function<T,R>
```
default <V> Function<T, V> andThen(Function<? super R, ? extends V> after)
```
* Returns a composed function that first applies this function to its input, and then applies the after function to the result.

```
default <V> Function<V, R> compose(Function<? super V, ? extends T> before)
```
* Returns a composed function that first applies the before function to its input, and then applies this function to the result.

```
static <T> Function<T, T> identlity()
```
* Returns a function that always returns its input argument.

---


## BiFunction<T, U, R>
* T & U are method input parameters & R is return type
```
interface BiFunction<T, U, R> {
    R apply(T t, U u);
}
BiFunction<Integer,Integer,Integer> bf = (i,j)->i+j; 
System.out.println(bf.apply(24,4));
```

### default & static methods 

## BiFunction<T, U, R>
```
default <V> BiFunction<T, U, V> andThen(Function<? super R, ? extends V> after)
```
* Returns a composed function that first applies this function to its input, and then applies the after function to the result.

---

## Consumer<T> 
*  T denotes the input parameter type.
```
interface Consumer<T> {
   void accept(T t);
}

Consumer<String> c = s -> System.out.println(s); 
c.accept("I consume data but don't return anything"); 
```


### default & static methods 

## Consumer<T>
```
default Consumer<T> andThen(Consumer<? super T> after)
```
* Returns a composed Consumer that performs, then in sequence, this operation followed by the after operation.

---

## BiConsumer<T, U>
* T & U are method input parameters
```
interface BiConsumer<T, U> {
   void accept(T t, U u);
}
BiConsumer<String,String> bc = (s1, s2)->System.out.println(s1+s2); 
bc.accept("Bi","Consumer"); 
```

### default & static methods 

## BiConsumer<T, U>
```
default BiConsumer<T, U> andThen(BiConsumer<? super T, ? super U> after)
```
* Returns a composed BiConsumer that performs, in sequence, this operation followed by the after operation.

---

## Supplier<R> 
*  R is a return type
```
interface Supplier<R>{
    R get();
}

Supplier<String> otps = () -> { String val = "secret="+ (int) (Math.random() * 10); return val; }
System.out.println(otps.get());
System.out.println(otps.get());
```

### default & static methods 

## Supplier<R>
* There are no default & static methods in this interface.

---
## UnaryOperator<T>
* used as lambda expression to pass as an argument
*  T denotes the input parameter type.
```
 interface UnaryOperator<T> extends Function<T, T> {
  public static <T> java.util.function.UnaryOperator<T> identity();
}

UnaryOperator<Integer> unaryOpt = i->i*i; 
sout(unaryOpt.apply(10))
```

## BinaryOperator<T>
* accepts two operands of the same type and process it and then returns results of the same type as operands.
*  T denotes the input parameter type.
```
 interface BinaryOperator<T> extends java.util.function.BiFunction<T, T, T> {
  public static <T> java.util.function.BinaryOperator<T> minBy(java.util.Comparator<? super T>);
  public static <T> java.util.function.BinaryOperator<T> maxBy(java.util.Comparator<? super T>);
}

BinaryOperator<String> binaryOpt = (s1,s2)-> s1+"-"+s2; 
binaryOpt.apply(10,20)
```

### default & static methods 

## BinaryOperator<T>
```
 public static <T> java.util.function.BinaryOperator<T> minBy(java.util.Comparator<? super T>);
```
* accepts a Compotator and returns BinaryOperator which will return min between two elements

```
  public static <T> java.util.function.BinaryOperator<T> maxBy(java.util.Comparator<? super T>);
```
* accepts a Compotator and returns BinaryOperator which will return maximum between two elements
* example 
```
class Student{
	int age;
	String name;
	String class;
}

List<Student> list = new ArrayList(){
	{
       add(new Student(22,"aaa1",A))
       add(new Student(20,"bbb1",A))
       add(new Student(22,"aaa2",B))
       add(new Student(20,"bbb3",B))
	}
};

	//Using BinaryOperator.maxBy        
      Map<String, Optional<Student>> eldestByClass = list.stream().collect(Collectors.groupingBy(Student::getClassName, 
                Collectors.reducing(BinaryOperator.maxBy(ageComparator))));
        eldestByClass.forEach((k,v)->System.out.println("Class:"+k+" Age:"+
                ((Optional<Student>)v).get().getAge()+" Name:"+((Optional<Student>)v).get().getName()));
        

     //Using BinaryOperator.minBy        
        System.out.println("---BinaryOperator.minBy---");
        Map<String, Optional<Student>> youngestByClass = list.stream().collect(Collectors.groupingBy(Student::getClassName, 
                Collectors.reducing(BinaryOperator.minBy(ageComparator))));
        youngestByClass.forEach((k,v)->System.out.println("Class:"+k+" Age:"+
                ((Optional<Student>)v).get().getAge()+" Name:"+((Optional<Student>)v).get().getName()));
    
```

---