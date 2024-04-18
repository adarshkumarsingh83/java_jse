package com.espark.adarsh;



public class Main {

    static Jdk15Service jdk15Service = new Jdk15Service();

    public static void main(String[] args) throws Exception {
        Runtime.Version version = Runtime.version();
        System.out.println("Java Version = " + version);
        System.out.println("Java Version Feature Element = " + version.feature());
        System.out.println("Java Version Interim Element = " + version.interim());
        System.out.println("Java Patch Element Version = " + version.patch());
        System.out.println("Java Update Element Version = " + version.update());
        System.out.println("Java Version Build = " + version.build().get());
        System.out.println("Java Pre-Release Info = " + version.pre().orElse("NA"));


        System.out.println(jdk15Service.getGreetMsg("hi welcome to espark"));


        System.out.println(jdk15Service.getWishMsg("hi welcome to espark"));

        System.out.println(jdk15Service.getGreetClazzMsg("hi welcome to espark"));


        System.out.println(jdk15Service.getWishClazzMsg("hi welcome to espark"));

        jdk15Service.getProcessedMsg("welcome to the epsark local msg ");

    }


}
