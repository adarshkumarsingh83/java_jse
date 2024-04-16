package com.espark.adarsh;

import com.espark.adarsh.bean.Greet;

public class Main {

    static Jdk14Service jdk14Service = new Jdk14Service();

    public static void main(String[] args) throws Exception {
        Runtime.Version version = Runtime.version();
        System.out.println("Java Version = " + version);
        System.out.println("Java Version Feature Element = " + version.feature());
        System.out.println("Java Version Interim Element = " + version.interim());
        System.out.println("Java Patch Element Version = " + version.patch());
        System.out.println("Java Update Element Version = " + version.update());
        System.out.println("Java Version Build = " + version.build().get());
        System.out.println("Java Pre-Release Info = " + version.pre().orElse("NA"));


        jdk14Service.checkSwitchCaseJdk14("M");
        jdk14Service.checkSwitchCaseJdk14("S");
        jdk14Service.checkSwitchCaseJdk14(" ");


        jdk14Service.patternMatchingInstanceJdk14(new Greet("hi welcome to espark"));
        jdk14Service.patternMatchingInstanceJdk14(new Main());


        jdk14Service.nullPointerExceptionJdk14(new Greet("hi welcome to espark"));
        jdk14Service.nullPointerExceptionJdk14(new Greet(null));

    }


}
