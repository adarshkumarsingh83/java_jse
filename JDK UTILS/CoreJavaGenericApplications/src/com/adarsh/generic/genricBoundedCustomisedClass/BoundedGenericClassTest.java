package com.adarsh.generic.genricBoundedCustomisedClass;

public class BoundedGenericClassTest {

    public BoundedGenericClassTest() {
        super();
    }

    public static void main(String[] args) {

        BoundedGenericClass<Number> numberObject = new BoundedGenericClass<Number>(100);
        numberObject.getClass();
        System.out.println(numberObject.toString());

        BoundedGenericClass<Integer> integerObject = new BoundedGenericClass<Integer>(200);
        integerObject.getClass();
        System.out.println(integerObject.toString());

        BoundedGenericClass<Float> floatObject = new BoundedGenericClass<Float>(12.23f);
        floatObject.getClass();
        System.out.println(floatObject.toString());

        BoundedGenericClass<Double> doubleObject = new BoundedGenericClass<Double>(56.23);
        doubleObject.getClass();
        System.out.println(doubleObject.toString());
    }

}
