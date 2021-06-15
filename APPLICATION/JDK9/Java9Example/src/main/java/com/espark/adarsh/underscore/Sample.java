package com.espark.adarsh.underscore;

public class Sample {
    public String getMsg(){

        // from java 9 single under score is keyword so can't use as identifier
        String __ = System.getProperty("user.name");
        return __;
    }
}
