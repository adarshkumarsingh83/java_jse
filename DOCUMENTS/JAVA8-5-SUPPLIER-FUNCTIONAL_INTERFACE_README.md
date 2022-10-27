# java.util.function.*

# Object Type Functional Interface 

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