## OverLoading | Compile time polymorphism | static binding

```
a.Overloading is happen with in the same class.
b.method with same name but different signature with in the same class.
c.it is resolved by complier based on the reference type variable
d.datatype can be automatically promoted to upper level applicable datatype if matching method is not found.
 byte------>short------>int------>long------>float------>double
                        |
             char------>|
e.if the datatype is of same level then ambiguity state is arises which lead to Compilation error.
d.null is the applicable value for the object so it can also lead to ambiguity state and lead to Compilation error.
```
### Example:
```   
public class OverloadingTest {
    public static void main(String[] args) {
        Integer integer=new Integer(0);
        new OverloadingTest().invoke(integer);
        Long aLong=new Long(0);
        new OverloadingTest().invoke(aLong);
        Number number1=integer;
        new OverloadingTest().invoke(number1);
        Number number2=aLong;
        new OverloadingTest().invoke(number2);
    }
    public void invoke(Integer integerType){
        System.out.println("Integer Display");
    }
    public void invoke(Long longType){
        System.out.println("Long Display");
    }
    public void invoke(Number number){
        System.out.println("Number Display ");
    }
}
-------------------------
Output:
-------------------------
Integer Display
Long Display
Number Display 
Number Display 
```


## Overriding | Run Time polymorphism | dynamic binding
```
a.Overloading is happen in two different class having parent and child relationship between them
b.method with the same name and same signature in parent and child class but return type covariant 
type and checked exception can be narrow down.
     Child Class ------> Parent Class ------> Super Parent Class ------> Object Class
c.it is resolved by Jvm based on the run type instance.
d.private and static methods are not a part of overriding
e.while overriding we can increase the scope of the access modifier 
  default------>protected------>public
  protected------>public
f.synchronized can be overridden into non synchronized method.
g.non synchronized can be overridden into synchronized method.
h.native can be overridden into non native method. 
i.non native can be overridden into native method. 
j. abstract can be overridden into non abstract method. 
k.non abstract can be overridden into abstract method. 
l.non final can be overridden as the final method.
```
### Example:
```
public class OverridingTest {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Integer parentInteger=new Integer(0);
        parent.invoke(parentInteger);
        Long parentLong=new Long(0);
        parent.invoke(parentLong);
        Number parentNumber1=parentInteger;
        parent.invoke(parentNumber1);
        Number parentNumber2=parentLong;
        parent.invoke(parentNumber2);
        System.out.println();

        Child child=new Child();
        Integer childInteger=new Integer(0);
        child.invoke(childInteger);
        Long childLong=new Long(0);
        child.invoke(childLong);
        Number childNumber1 =childInteger;
        child.invoke(childNumber1);
        Number childNumber2=childLong;
        child.invoke(childNumber2);
        System.out.println();

        Parent parentChild=new Child();
        Integer parentChildInteger=new Integer(0);
        parentChild.invoke(parentChildInteger);
        Long parentChildLong=new Long(0);
        parentChild.invoke(parentChildLong);
        Number parentChildNumber1 =parentChildInteger;
        parentChild.invoke(parentChildNumber1);
        Number parentChildNumber2=parentChildLong;
        parentChild.invoke(parentChildNumber2);
    }
}
class Parent {
    public void invoke(Integer integerType) {
        System.out.println("Parent Integer Display");
    }
    public void invoke(Long longType) {
        System.out.println("Parent Long Display");
    }
    public void invoke(Number number) {
        System.out.println("Parent Number Display ");
    }
}

class Child extends Parent {
    @Override
    public void invoke(Integer integerType) {
        System.out.println("Child Integer Display");
    }
    @Override
    public void invoke(Long longType) {
        System.out.println("Child Long Display");
    }
    @Override
    public void invoke(Number number) {
        System.out.println("Child Number Display ");
    }
}
-------------------------
Output:
-------------------------
Parent Integer Display
Parent Long Display
Parent Number Display 
Parent Number Display 

Child Integer Display
Child Long Display
Child Number Display 
Child Number Display 

Child Integer Display
Child Long Display
Child Number Display 
Child Number Display 
```