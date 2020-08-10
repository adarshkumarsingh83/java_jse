package com.espark.adarsh;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ApplicationMain {
    public static void main(String[] args) {
         String [] data={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        List<String> list= Arrays.asList(data);
        Service service=new Service();
        Map<Integer, List<String>>response = service.partition(list,5);
        for(Map.Entry<Integer,List<String>> entry:response.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
