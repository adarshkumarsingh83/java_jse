# Java Generics
---
```
1.Generics was introduces in java 1.5 
2.it provide type safety at the runtime operation and to resolve type casting problem 
3.only applicable for object type not for primitive type and  keywords is extends only
```

## allowed generics 

### Generics with Class and Interfaces
```
<T>
<T1,T2>
<T extends ClassName>
<T extends Interface>
<? extends Interface>
<T extends Interface & Interface>
<T extends ClassName & InterfaceName & .....>
<T1,T2> extends Interface 
```

```
package com.adarsh.generic;

public class MyClass<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
		
	public static void main(String[] args) {
        MyClass<String> myClass=new MyClass<>();
        myClass.setValue("Adarsh kumar ");
        System.out.println(myClass.getValue());
		
		MyClass<Integer> myClass=new MyClass<>();
        myClass.setValue(10);
        System.out.println(myClass.getValue());
    }	
}
```


## Generics in Methods and Constructors Parameter
```
T
ClassName<T>
ClassName<?>
Interface<T>
Interface<?>

ClassName<? super ClassName>
ClassName<? extend ClassName>

ClassName<? super Interface>
ClassName <? extends Interface>  

Interface<? super ClassName>
Interface <? extends Interface>  
```

## Generics in Methods Parameter
```
ClassName<T>
Interface<T>
ClassName<?>
Interface<?>
Interface<? super Interface>
Interface <? extends Interface>  
ClassName<? super Interface>
ClassName <? extends Interface> 
ClassName<? super ClassName>
ClassName <? extends ClassName> 
```


## Generics with variables 
```
DataType<Type> referenceVariable=new DataType<Type>();

List<?>variable =new ArrayList<>();
List<T>variable =new ArrayList<>();
List<InterfaceName>variable =new ArrayList<>();
List<ClassName>variable =new ArrayList<>();
List<? super Runnable>variable =new ArrayList<>();
List<? extends Cloneable>variable = new ArrayList<>();
```

