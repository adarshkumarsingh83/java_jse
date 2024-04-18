package com.espark.adarsh;


import com.espark.adarsh.claszz.GreetClazz;
import com.espark.adarsh.claszz.WishClazz;
import com.espark.adarsh.localrecord.MessageService;
import com.espark.adarsh.record.Greet;
import com.espark.adarsh.record.Wish;

public class Jdk15Service {

    public WishClazz getWishClazzMsg(String msg) {
        return new WishClazz(msg);
    }

    public GreetClazz getGreetClazzMsg(String msg) {
        return new GreetClazz(msg);
    }


    public Wish getWishMsg(String msg) {
        return new Wish(msg);
    }

    public Greet getGreetMsg(String msg) {
        return new Greet(msg);
    }


    public void getProcessedMsg(String msg){
        System.out.println(new MessageService().getWishMsg(msg));
    }

}
