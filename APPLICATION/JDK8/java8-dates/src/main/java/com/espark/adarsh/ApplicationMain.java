package com.espark.adarsh;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ApplicationMain {
    public static void main(String[] args) {
        String tempData ="2021-04-21T13:12:10.228Z";
         dateFormat(tempData);
         dateFormatString(tempData);
    }

    public static void dateFormat(String input){
        String pattern = "yyyy-MM-dd'T'HH:mm:ssZ";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
        String temp =  ZonedDateTime.parse(input).withZoneSameInstant(ZoneId.of("America/Coral_Harbour")).format(dtf);
        //String temp =  ZonedDateTime.parse(tempData).withZoneSameInstant(ZoneId.of("America/New_York")).format(dtf);
        System.out.println(temp); // 2009-07-16T19:20:30-05:00
    }

    public static void dateFormatString(String input){
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy MM dd HH mm ss s a Z");
        String temp1 =  ZonedDateTime.parse(input).withZoneSameInstant(ZoneId.of("America/Coral_Harbour")).format(dtf1);
        System.out.println(temp1);
    }
}
