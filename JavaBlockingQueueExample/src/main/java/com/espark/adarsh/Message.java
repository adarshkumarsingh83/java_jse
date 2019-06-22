package com.espark.adarsh;

public class Message<T> {

    T payload;

    public Message() {
    }

    public Message(T payload) {
        this.payload = payload;
    }

    public T getPayload() {
        return payload;
    }

    public void setPayload(T payload) {
        this.payload = payload;
    }
}
