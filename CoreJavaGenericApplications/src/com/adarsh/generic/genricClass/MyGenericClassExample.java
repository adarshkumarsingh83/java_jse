package com.adarsh.generic.genricClass;

public class MyGenericClassExample {

    public MyGenericClassExample() {
        super();
    }

    public static void main(String[] args) {
        MyGeneric<String> stringObject = new MyGeneric<String>("Adarsh Radha");
        stringObject.showClassName();
        System.out.println(stringObject.getObject());

        MyGeneric<Integer> integerObject = new MyGeneric<Integer>(new Integer(101));
        integerObject.showClassName();
        System.out.println(integerObject.getObject());
    }

}

class MyGeneric<T> {
    T object;

    public MyGeneric(T object) {
        super();
        this.object = object;
    }

    public void showClassName() {
        System.out.println(this.object.getClass().getName());
    }

    public T getObject() {
        return this.object;
    }
} 
