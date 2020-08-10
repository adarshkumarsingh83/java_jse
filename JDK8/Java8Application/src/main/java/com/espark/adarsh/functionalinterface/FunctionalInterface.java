package com.espark.adarsh.functionalinterface;

/**
 * Created by Adarsh on 6/19/15.
 */
public class FunctionalInterface {
    public static void main(String[] args) {
        MyMessageService myMessageService=new MyMessageServiceImpl();
        System.out.println(myMessageService.getMessage(System.getProperty("user.name")));
        System.out.println(myMessageService.getWishMessage(System.getProperty("user.name")));
    }
}


@java.lang.FunctionalInterface
interface MyMessageService{

    public String getMessage(String userName);

    public default String getWishMessage(String userName){
        return "Hello "+userName.toUpperCase();
    }

}

class MyMessageServiceImpl implements MyMessageService{

    @Override
    public String getMessage(String userName) {
        return "HI "+userName.toLowerCase();
    }

}



