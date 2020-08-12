package com.espark.adarsh.functionalinterface.example;

import com.espark.adarsh.functionalinterface.*;
import org.junit.Test;

import java.lang.FunctionalInterface;

/**
 * Created by Adarsh on 8/20/15.
 */
public class FunctionalInterfaceWithLambdaExpressions {

    @FunctionalInterface
    public interface Display {
        public String show();
    }

    @FunctionalInterface
    public interface Multiply {
        public int multiply(int num);
    }

    @FunctionalInterface
    public interface Add {
        public int addData(int n1, int n2);
    }


    @Test
    public void exampleTest() {
        // functional interface with no argument
        Display display = () -> "Functional interface with no argument";
        String s = display.show();
        System.out.println(s);
        // functional interface with one argument
        Multiply multiply = (int num) -> num * 10;
        int res = multiply.multiply(5);
        System.out.println(res);
        // functional interface with two argument
        Add add = (int a, int b) -> a + b;
        int rs = add.addData(15, 20);
        System.out.println(rs);
    }

}
