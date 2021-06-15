package com.adarsh.hindi.message;

import com.espark.message.Message;

public class HindiMessage implements Message {

    @Override
    public String getMessage(String name) {
        return "Namastey " + name+" !";
    }
}
