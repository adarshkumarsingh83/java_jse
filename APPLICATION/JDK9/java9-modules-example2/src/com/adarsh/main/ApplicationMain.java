package com.adarsh.main;

import com.adarsh.message.provider.MessageProvider;

public class ApplicationMain {
    public static void main(String[] args) {
        MessageProvider.getInstance().getMessages().stream().forEach(message -> System.out.println(message));
    }
}
