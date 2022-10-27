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