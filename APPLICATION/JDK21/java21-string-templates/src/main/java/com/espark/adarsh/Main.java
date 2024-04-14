package com.espark.adarsh;


import static java.lang.StringTemplate.STR;

public class Main {

    public static void main(String[] args) {
            String name =  (args[0] !=null && !args[0].isEmpty() ) ? args[0] : "default name";

            String message = STR." welcome to the espark \{name}!";
            System.out.println(message);

    }
}
