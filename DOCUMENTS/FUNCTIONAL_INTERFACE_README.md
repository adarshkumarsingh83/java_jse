# java.util.function.*

# Object Type Functional Interface 

---
## Predicate<T>
* for testing any condition and return boolean
* take one input param 
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
* to negative 
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
* take input and return type 
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
* To take input perform operationa and must reuturn 
```
default <V> Function<T, V> andThen(Function<? super R, ? extends V> after)
```
* Returns a composed function that first applies this function to its input, and then applies the after function to the result.
* f1.andThen(f2).apply("xxxxx") first apply f1 and then apply f2 


```
default <V> Function<V, R> compose(Function<? super V, ? extends T> before)
```
* Returns a composed function that first applies the before function to its input, and then applies this function to the result.
* return the same value as input identical value of the input 
* f1.compose(f2).apply("xxxxx") first apply f2 and then apply f1 



```
static <T> Function<T, T> identlity()
```
* Returns a function that always returns its input argument.
* Function<String,String> f = Function.identity(); sout(f.apply("radha")); // radha is o/p

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
* accept one input peform operation but don't return anythings  
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
* to supply some value 
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

# Premitive Type Functional Iterface 
* Premitive Funcatl interface help to improve performae by avoiding autoboxing and autounboxing 

### Autoboxing 
* automatic type convertion from premitive to object by compiler release in 1.5 verion 
```
Integer i = 10;
javac -source 1.4 ClassName.java 
```

### AutoUnboxing 
* automaic type convertion from object to the premitive by compiler release in 1.5 version 
```
Integer i = new Integer(10);
int x = i; 
javac -source 1.4 ClassName.java 
```

### Generic Type 
* applicable to the object type 

---

### Premitive Predicate 

## IntPredicate 
* specificaly for premitive int 
```
 IntPredicate intP = i -> i % 2 == 0;
  sout(intP.test(10));
```
* interface signature 
```
interface java.util.function.IntPredicate {
  public abstract boolean test(int);
  public default java.util.function.IntPredicate and(java.util.function.IntPredicate);
  public default java.util.function.IntPredicate negate();
  public default java.util.function.IntPredicate or(java.util.function.IntPredicate);
}
```

## LongPredicate 
* speciflly for long premetive 
```
 LongPredicate longP = i -> i % 2 == 0;
  sout(longP.test(10));
```

* interface signature 
```
public interface java.util.function.LongPredicate {
  public abstract boolean test(long);
  public default java.util.function.LongPredicate and(java.util.function.LongPredicate);
  public default java.util.function.LongPredicate negate();
  public default java.util.function.LongPredicate or(java.util.function.LongPredicate);
}
```

## DoublePredicate 
* speciflly for double premetive 
```
 DoublePredicate doubleP = i -> i % 2 == 0;
  sout(doubleP.test(10));
```
* interface signature 
```
public interface java.util.function.DoublePredicate {
  public abstract boolean test(double);
  public default java.util.function.DoublePredicate and(java.util.function.DoublePredicate);
  public default java.util.function.DoublePredicate negate();
  public default java.util.function.DoublePredicate or(java.util.function.DoublePredicate);
}
```

---

### Premitive Function 
* it has only R as return Type 

## IntFunction 
* input is always int type but return type can be anythings 
* interface signature 
```
IntFunction<String> intFunction = i -> (i % 2 == 0) ? "even no":"odd no";
sout(intFunction.apply(10));
```
* interface signagure 
```
public interface java.util.function.IntFunction<R> {
  public abstract R apply(int);
}
```

## LongFunction 
* input is always long type but return type can be anythings 
```
LongFunction<String> longFunction = i -> // logic to convert the milisecound to the string date and return ;
sout(longFunction.apply(System.getMilisecound));
```
* interface signature 
```
public interface java.util.function.LongFunction<R> {
  public abstract R apply(long);
}
```

## DoubleFunction 
* input is always double type but return type can be anythings 
* interface signature 
```
public interface java.util.function.DoubleFunction<R> {
  public abstract R apply(double);
}
```

----

## ToIntFucntion 
* input is any type but return type is int type 
```
public interface java.util.function.ToIntFunction<T> {
  public abstract int applyAsInt(T);
}
```

## ToLongFunction
* input is any type but return type is long type 
```
public interface java.util.function.ToLongFunction<T> {
  public abstract long applyAsLong(T);
}
```

## ToDoubleFunction 
* input is any type but return type is double type 
```
public interface java.util.function.ToDoubleFunction<T> {
  public abstract double applyAsDouble(T);
}
```

----

## IntToLongFunction
*  input will be int return will be long type 
```
public interface java.util.function.IntToLongFunction {
  public abstract long applyAsLong(int);
}
```

## IntToDoubleFunction
*  input will be int return will be double type 
```
public interface java.util.function.IntToDoubleFunction {
  public abstract double applyAsDouble(int);
}
```

---

## LongToIntFunction
* input will be long but return type is int type 
```
public interface java.util.function.LongToIntFunction {
  public abstract int applyAsInt(long);
}
```

## LongToDoubleFunction
* input will be long but return type is double type 
```
public interface java.util.function.LongToDoubleFunction {
  public abstract double applyAsDouble(long);
}
```

---

## DoubleToIntFunction
* input type will be double type and return type will be always int 
```
public interface java.util.function.DoubleToIntFunction {
  public abstract int applyAsInt(double);
}
```

## DoubleToLongFunction
* input type will be double type and return type will be always long 
```
public interface java.util.function.DoubleToLongFunction {
  public abstract long applyAsLong(double);
}
```

---

## ToIntBiFunction
* 2 input type can be anythings but return type will be int type 
```
public interface java.util.function.ToIntBiFunction<T, U> {
  public abstract int applyAsInt(T, U);
}
```

## ToLongBiFunction
* 2 input type can be anythings but return type will be long type 
```
public interface java.util.function.ToLongBiFunction<T, U> {
  public abstract long applyAsLong(T, U);
}
```

## ToDoubleBiFunction
* 2 input type can be anythings but return type will be double type 
```
public interface java.util.function.ToDoubleBiFunction<T, U> {
  public abstract double applyAsDouble(T, U);
}
```

---

# Premitive Consumer
* premitive consumer for consuming premitive type value int, long, double 

## IntConsumer 
* when we have to consume premetive int value 
```
public interface java.util.function.IntConsumer {
  public abstract void accept(int);
  public default java.util.function.IntConsumer andThen(java.util.function.IntConsumer);
}
```

## LongConsumer 
* when we have to consume premetive long value 
```
public interface java.util.function.LongConsumer {
  public abstract void accept(long);
  public default java.util.function.LongConsumer andThen(java.util.function.LongConsumer);
}
```

## DoubleConsumer 
* when we have to consume premetive double value 
```
public interface java.util.function.DoubleConsumer {
  public abstract void accept(double);
  public default java.util.function.DoubleConsumer andThen(java.util.function.DoubleConsumer);
}
```

---
# ObjXXXConsmer 
* accept one args as object and other as xxx premite type for operation 

## ObjIntConsumer
* accept args as object aand other as premitive int 
```
public interface java.util.function.ObjIntConsumer<T> {
  public abstract void accept(T, int);
}
```

## ObjLongConsumer
* accept args as object aand other as premitive long 
```
public interface java.util.function.ObjLongConsumer<T> {
  public abstract void accept(T, long);
}
```

## ObjDoubleConsumer 
* accept args as object aand other as premitive double 
```
public interface java.util.function.ObjDoubleConsumer<T> {
  public abstract void accept(T, double);
}
```

### Premitive Supplier 
* when we have to only return value without taking input 

## IntSupplier
* only return int value 
```
public interface java.util.function.IntSupplier {
  public abstract int getAsInt();
}
```

## LongSupplier
* only return long premitive value 
```
public interface java.util.function.LongSupplier {
  public abstract long getAsLong();
}
```

## DoubleSupplier
* only return double premitive value 
```
public interface java.util.function.DoubleSupplier {
  public abstract double getAsDouble();
}
```

## BooleanSupplier
* only return boolean premitive value 
```
public interface java.util.function.BooleanSupplier {
  public abstract boolean getAsBoolean();
}
```
---

### Operators 

### for object type 
### UnaryOperator 
* if the input type and return type is same type then we have to use UnaryOperator
* its child of function interface so via inheritancee we get the sam of function apply()
```
public interface java.util.function.UnaryOperator<T> extends java.util.function.Function<T, T> {
  public static <T> java.util.function.UnaryOperator<T> identity();
}
```

### for premitive type 
## IntUnaryOperator 
```
public interface java.util.function.IntUnaryOperator {
  public abstract int applyAsInt(int);
  public default java.util.function.IntUnaryOperator compose(java.util.function.IntUnaryOperator);
  public default java.util.function.IntUnaryOperator andThen(java.util.function.IntUnaryOperator);
  public static java.util.function.IntUnaryOperator identity();
}
```
## LongUnaryOperator
```
public interface java.util.function.LongUnaryOperator {
  public abstract long applyAsLong(long);
  public default java.util.function.LongUnaryOperator compose(java.util.function.LongUnaryOperator);
  public default java.util.function.LongUnaryOperator andThen(java.util.function.LongUnaryOperator);
  public static java.util.function.LongUnaryOperator identity();
}
```
## DoubleUnaryOperator 
```
public interface java.util.function.DoubleUnaryOperator {
  public abstract double applyAsDouble(double);
  public default java.util.function.DoubleUnaryOperator compose(java.util.function.DoubleUnaryOperator);
  public default java.util.function.DoubleUnaryOperator andThen(java.util.function.DoubleUnaryOperator);
  public static java.util.function.DoubleUnaryOperator identity();
}
```

---

### for object type 

### BinaryOperator 
* if the 2 input type and return type is same type then we have to use BinaryOperator
* its child of bifunction interface so via inheritancee we get the sam apply()
```
public interface java.util.function.BinaryOperator<T> extends java.util.function.BiFunction<T, T, T> {
  public static <T> java.util.function.BinaryOperator<T> minBy(java.util.Comparator<? super T>);
  public static <T> java.util.function.BinaryOperator<T> maxBy(java.util.Comparator<? super T>);
}
```

### for premitive type 
## IntBinaryOperator 
```
public interface java.util.function.IntBinaryOperator {
  public abstract int applyAsInt(int, int);
}
```

## LongBinaryOperator 
```
public interface java.util.function.LongBinaryOperator {
  public abstract long applyAsLong(long, long);
}
```

## DoubleBinaryOperator
```
public interface java.util.function.DoubleBinaryOperator {
  public abstract double applyAsDouble(double, double);
}
```