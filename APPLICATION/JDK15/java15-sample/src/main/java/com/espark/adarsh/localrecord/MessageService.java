package com.espark.adarsh.localrecord;



public class MessageService {
    public String getWishMsg(String msg){
        record Wish(String msg) implements Message{
            @Override
            public String getMessage() {
                return Wish.this.msg.toUpperCase();
            }
        }
        return new Wish(msg).getMessage();
    }
}
