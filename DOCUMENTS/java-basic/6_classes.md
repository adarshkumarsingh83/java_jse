# types of the classes
---

## Top Level Class 
```
 1.java file name and the public class inside the .java file both names must be same.
 2.one .java file can have multiple java class no restriction on this.
 3.key words for top level class.
    public,abstract,strictfp,final
 4.top level class can extended only one class at the time 
 5.by default parent of every top level class is java.lang.Object class.
 6.top level class can implement multiple interface at the time.
 7.we can have multiple static block inside a top level class
 8.we can have multiple instance block inside a top level class.
 9.we have have multiple constructor inside the top level class.
 10.we can have static as well as instance method inside the top level class.
 11.we can have abstract method inside the top level class but in that case class must be abstract class.
 12.we can have inner class inside the top level class.
 13.we can have static nested inner class inside the top level class.
 14.we can have interface inside the top level class.
 15.we can have static interface inside the top level class.
 16.we can overload the methods inside the top level class.
 17.we can override the methods inside the top level class.
 18.we can have instance variable inside the top level class.
 19.we can have static variable inside the top level class
 20.we can have enum in top level class.
 21.class implementing two interface having same method signature then only one method need to implement
 22.class implementing two interface having same var then it can access by prefixing interface  name.
```

## Inner Class
```
 1.class which is created inside a top level class.
 2.we can have multiple inner class inside the top level class.
 3.key words for the inner class
   public,private,protected,abstract,final,strictfp,static
 4.inner class can extended only one class at the time 
 5.by default parent of every inner class is java.lang.Object class.
 6.inner class can implement multiple interface at the time.
 7.we can have static member in the inner class for that inner class must be static class.
 8.we can have multiple instance block inside a inner class.
 9.we have have multiple constructor inside the inner class.
 10.we can have static as well as instance method inside the inner class.
 11.we can have abstract method inside the inner class but in that case class must be abstract class without any static member.
 12.we can have inner class inside the inner class.
 13.we can have static nested inner class inside the inner class in that case class must be static class without any abstract method.
 14.we can have interface inside the inner class but inner class must be static.
 15.we can have static interface inside the inner class but inner class must be static.
 16.we can overload the methods inside the inner class.
 17.we can override the methods inside the inner class.
 18.we can have instance variable inside the inner class.
 19.we can have static variable inside inner class but inner class must be static. 
 20.we can have enum in the inner class.
```

## Method Local Inner Class
```
 1.class declared inside the method is method local inner class.
 2.we can have multiple inner class inside the method local inner class.
 3.key words for the inner class
   final,strictfp,abstract
 4.method local inner class can extended only one class at the time 
 5.by default parent of every method local inner class is java.lang.Object class.
 6.method local inner class can implement multiple interface at the time.
 7.we can have static var. in the method local inner class but not the static method.
 8.we can have multiple instance block inside a method local inner class.
 9.we have have multiple constructor inside the method local inner class.
 10.we can't have static method but instance method is allowed inside the method local inner class.
 11.we can have abstract method inside the method local inner class but in that case class must be abstract.
 12.we can have method local inner class inside the inner class.
 13.we can't have static nested inner class inside the method local inner class.
 14.we can't have interface inside the method local inner class .
 15.we can't have static interface inside the method local inner class .
 16.we can overload the methods inside the method local inner class.
 17.we can override the methods inside the method local inner class.
 18.we can have instance variable inside the method local inner class.
 19.we can have static final variable inside method local inner class.
 20.we can't have enum in the method local inner class.
 ```

## Annonimus Class
```
 1.class which is created without the name 
 2.we can have multiple inner class inside the Annonimus class.
 3. no key words is applicable for the Annonimus class.
 4.Annonimus class can extended only any class at the time.
 5.by default parent of every Annonimus class is java.lang.Object class.
 6.inner class can implement one interface at the time.
 7.we can have static final variable in the Annonimus class but not the static methods or blocks
 8.we can have multiple instance block inside a Annonimus class.
 9.we can't have have constrictor inside the Annonimus class.
 10.we can have only instance method inside the Annonimus class.
 11.we can't have abstract method inside the Annonimus class .
 12.we can have inner class inside the Annonimus class.
 13.we can't have static nested inner class inside the Annonimus class.
 14.we can't have interface inside the Annonimus class .
 15.we can't have static interface inside the Annonimus class .
 16.we can overload the methods inside the Annonimus class.
 17.we can override the methods inside the Annonimus class.
 18.we can have instance variable inside the Annonimus class.
 19.we can't have static variable inside Annonimus class.
 20.we can have enum inside the Annonimus class.
 ```