package com.espark.adarsh;


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



        System.out.println("\n\njdk12");
        Jdk12Service jdk12Service = new Jdk12Service();
        jdk12Service.checkSwitchCaseJdk12("M");
        jdk12Service.checkSwitchCaseJdk12("TH");
        jdk12Service.checkSwitchCaseJdk12("");
        jdk12Service.checkSwitchCaseJdk12("SUN");
        jdk12Service.streamOperation12();


        jdk12Service.fileMismatchedJdk12();


        jdk12Service.compactNumberFormatting();


        jdk12Service.teeingCollector();
    }


}
