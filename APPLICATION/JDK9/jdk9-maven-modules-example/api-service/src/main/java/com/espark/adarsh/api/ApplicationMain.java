package com.espark.adarsh.api;

import com.espark.adarsh.service.MessageService;
import com.espark.adarsh.service.MessageServiceImpl;

public class ApplicationMain {

    public static void main(String[] args) {
        MessageService messageService=new MessageServiceImpl();
        System.out.println(messageService.getMessage(System.getProperty("user.name")));
    }
}
