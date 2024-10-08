package com.espark.adarsh;

public class Main {

    public static void main(String[] args) throws Exception {
        Runtime.Version version = Runtime.version();
        System.out.println("Java Version = " + version);
        System.out.println("Java Version Feature Element = " + version.feature());
        System.out.println("Java Version Interim Element = " + version.interim());
        System.out.println("Java Patch Element Version = " + version.patch());
        System.out.println("Java Update Element Version = " + version.update());
        System.out.println("Java Version Build = " + version.build().get());
        System.out.println("Java Pre-Release Info = " + version.pre().orElse("NA"));


        System.out.println("\n\njdk13");
        Jdk13Service jdk13Service = new Jdk13Service();
        jdk13Service.checkSwitchCaseJdk13();
        jdk13Service.stringDataDisplay();


    }


}
