package com.espark.adarsh;

public class ApplicationMain {

    public static void main(String[] args) {
        Service service=new Service();
        service.display("adarsh kumar  ");
        service.display(new Integer[]{1,2,3,4,5,6,7,8,9,10},"Failed to process");
    }
}
