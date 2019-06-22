package com.espark.adarsh;

import java.util.concurrent.BlockingQueue;

public class MessageConsumer implements Runnable{

    private BlockingQueue<Message> queue;

    public MessageConsumer(BlockingQueue<Message> queue) {
        this.queue = queue;
    }

    public void run() {
        try{
            Message msg;
            //consuming messages until exit message is received
            while((msg = queue.take()).getPayload() !="exit"){
                Thread.sleep(10);
                System.out.println("Consumed "+msg.getPayload());
            }
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
