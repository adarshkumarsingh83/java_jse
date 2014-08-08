package com.adarsh.thread.consumerProducer.file;

public class FileClient {

    public static void main(String[] args) {
        FileConsumer fileConsumer;
        FileProducer fileProducer;
        fileConsumer = new FileConsumer();
        fileProducer = new FileProducer(fileConsumer);
        fileConsumer.setFileProducer(fileProducer);
        fileProducer.start();
        fileConsumer.start();
    }
}
