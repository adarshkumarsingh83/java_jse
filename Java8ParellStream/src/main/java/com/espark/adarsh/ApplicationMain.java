package com.espark.adarsh;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ApplicationMain {
    public static void main(String[] args) {
        parallStream();
    }

    public static void parallStream(){
        List<Integer> list= IntStream.range(0,10).boxed().collect(Collectors.toList());
        System.out.println(list.stream()
                .parallel()
                .map(ApplicationMain::transform)
                .reduce(0,(sum,element)-> ApplicationMain.add(sum,element)));
    }

    public static Integer transform(Integer data){
        System.out.println("\n"+data+" = "+Thread.currentThread().getName());
        return data;
    }

    public static Integer add(Integer total,Integer number){
        System.out.println("\n"+number+" + "+Thread.currentThread().getName());
        return total+number;
    }
}
