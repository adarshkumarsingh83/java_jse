# java.util.function.*

# Object Type Functional Interface 


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