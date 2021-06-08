package com.adarsh.english.message;

import com.espark.message.Message;

public class EnglishMessage implements Message {
    @Override
    public String getMessage(String name) {
        return "Hello " + name + " .";
    }
}
