package com.espark.adarsh;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Set;

public class AllZonesTime {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        zoneIds.stream().forEach(e->{
            System.out.println(ZoneId.of(e).getId().substring(0,AllZonesTime.indexFinder(e.toString()))+"   "+e+"  "+instant.atZone(ZoneId.of(e)));
        });
    }


    public static int indexFinder(String val){
        if(val.contains("/")){
            return val.indexOf("/");
        }
        return val.length();
    }
}
