package com.espark.adarsh.service;

import com.espark.adarsh.util.MessageUtil;

public class MessageServiceImpl implements MessageService {

    private static final MessageUtil messageUtil=new MessageUtil();

    @Override
    public String getMessage(String message){
         message="welcome to the espark    "+message;
        return messageUtil.conversion(message);
    }
}
