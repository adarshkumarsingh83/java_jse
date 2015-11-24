package com.adarsh.generic.genricClass;

public class MyGenericClass<T1, T2, T3> {

    T1 a;
    T2 b;
    T3 C;

    public MyGenericClass() {
        super();
    }


    void display(T1 x, T2 y, T3 z) {

        System.out.println(" INTEGER " + x);
        System.out.println(" STRING " + y);
        System.out.println(" OBJECT " + z);
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        MyGenericClass<Integer, String, Object> obj = new MyGenericClass<Integer, String, Object>();
        obj.display(10, " ADARSH KUMAR ", new MyGenericClass());
    }
}

