package com.adarsh.message.provider;


import com.espark.message.Message;

import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

public class MessageProvider {

    public static MessageProvider getInstance(){
        return new MessageProvider();
    }

    public List<String> getMessages() {
        return ServiceLoader.load(Message.class).stream().map(messageProvider -> {
            return messageProvider.get().getMessage("Adarsh kumar");
        }).collect(Collectors.toList());
    }
}
