# Java Enum
----

## Top Level Enum
```
 1.every java enum is extended from java.lang.Enum class
 2.every java enum is public final class internally 
 3.we can implements multiple interface in java enum at a time but its mandatory to provide 
  implementation to all the method present in interfaces.
 4.we can't declare abstract method in enum
 5.we can't extends any java enum in any other class becoz its final.
 6.we can keep constructor in enum both default and parametrised without any access specifier.
 7.semicolon is not mandatory at end of declared constant when only enum constants are declared
 8.semicolon is mandatory when var are declared in enum and it should be declared after enum constants.
 9.enum constant will be declared at the top it should be the first declaration in the enum.
 10.we can keep static and instance block in the enum.
 11.we can declared the instance and static method in the enum.
 12.we can declared the main method in the enum.
 13.we can use == , != and instanceof operator for comparison 
   other then that we can't use any other operator.
 14.we can't extends any class in java enum 
 15.ordinal method is used to provide the order of the enum constant in the enum.
 16.we can declare interface in the enum after enum constant.
 17.valueof will give the constant value of the enum .
 18.values method will provide the array of the enum objects.
 19.we can declare interface inside the enum
 20.we can declare static interface inside the enum.
 21.we can have abstract as well as concrete class inside the enum.
 22.we can have enum inside the enum.
 23.we can use strictfp for top level enum only.
 24.we can use enum inside the switch cases.
```

## Inner Enum
```
 1.enum declared inside the class or interface or enum is know as inner enum.
 2.every inner enum also extends form java.lang.Enum class and every java enum class is public final internally.
 3.we can implements multiple interface in java enum at a time.
 4.we can't extends any class in java inner enum 
 5.we can't extends any java inner enum in any other class becoz its final.
 6.we can keep constructor in inner enum both default and parametrised without any access specifier.
 7.semicolon is not mandatory at end of declared constant when only enum constants are declared
 8.semicolon is mandatory when var are declared in enum and it should be declared after enum constants.
 9.enum constant will be declared at the top it should be the first declaration in the enum.
 10.we can keep static and instance block in the enum.
 11.we can declared the instance and static method in the enum.
 12.we can declared the main method in the enum.
 13.ordinal method is used to provide the order of the enum constant in the enum.
 14.we can declared inner class in the enum after enum constant.
 16.valueof will give the constant value of the enum .
 17.value method will provide the array of the enum objects.
 18.we can declare interface inside the enum 
 19.we can declare static interface inside the enum.
 20.we can have abstract as well as concrete class inside the enum.
 21.we can have enum inside the enum inner enum.
 22.we can have public,private,protected,static,strictfp key word for inner enum.
```

## Method Local Enum
```
In java we don't have method local enum.
```