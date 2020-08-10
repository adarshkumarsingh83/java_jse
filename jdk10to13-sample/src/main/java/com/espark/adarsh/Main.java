package com.espark.adarsh;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception {
        Runtime.Version version = java.lang.Runtime.version();
        System.out.println("Java Version = " + version);
        System.out.println("Java Version Feature Element = " + version.feature());
        System.out.println("Java Version Interim Element = " + version.interim());
        System.out.println("Java Patch Element Version = " + version.patch());
        System.out.println("Java Update Element Version = " + version.update());
        System.out.println("Java Version Build = " + version.build().get());
        System.out.println("Java Pre-Release Info = " + version.pre().orElse("NA"));

        System.out.println("\n\njdk10");
        Jdk10Service jdk10Service = new Jdk10Service();
        jdk10Service.varForInitVar();
        jdk10Service.copyOfStaticMethod();
        jdk10Service.unModifiableCollectionMethod();

        System.out.println("\n\njdk11");
        Jdk11Service jdk11Service = new Jdk11Service();
        jdk11Service.checkSwitchCaseJdk11();
        jdk11Service.lashNStringLines("JD\nJD\nJD");
        jdk11Service.repeatExample("-*-,", 10);
        jdk11Service.readFile("hi welcome to the espark jdk samples");
        jdk11Service.localVarInLambda(10);
        jdk11Service.nestedBaseAccessControl();

        System.out.println("\n\njdk12");
        Jdk12Service jdk12Service = new Jdk12Service();
        jdk12Service.checkSwitchCaseJdk12();
        jdk12Service.streamOperation12();

        System.out.println("\n\njdk13");
        Jdk13Service jdk13Service = new Jdk13Service();
        jdk13Service.checkSwitchCaseJdk13();
        jdk13Service.stringDataDisplay();


    }


}
