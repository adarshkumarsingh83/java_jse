package com.espark.adarsh;

import com.espark.adarsh.bean.Greet;

public class Jdk14Service {

    public void checkSwitchCaseJdk14(String day) {
        String result = switch (day) {
            case "M", "W", "F" -> "MWF";
            case "T", "TH", "S" -> "TTS";
            default -> {
                if(day.isEmpty())
                    yield "Please insert a valid day.";
                else
                    yield "Looks like a Sunday.";
            }

        };
        System.out.println(result);
    }


    public void patternMatchingInstanceJdk14(Object obj){
        if (obj instanceof Greet greet) {
            System.out.println(greet.msg());
        }else{
            System.out.println("not a instance of Greet");
        }
    }


    public void nullPointerExceptionJdk14(Greet greet){
        System.out.println(greet.getMessage());
    }
}
