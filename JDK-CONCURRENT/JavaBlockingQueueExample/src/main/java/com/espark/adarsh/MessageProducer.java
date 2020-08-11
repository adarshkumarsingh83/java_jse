package com.espark.adarsh;

import java.util.concurrent.BlockingQueue;

public class MessageProducer implements Runnable {

    private BlockingQueue<Message> queue;

    public MessageProducer(BlockingQueue<Message> queue) {
        this.queue = queue;
    }

    public void run() {
        //produce messages
        for (int i = 0; i < 100; i++) {
            Message msg = new Message("" + i);
            try {
                Thread.sleep(i);
                queue.put(msg);
                System.out.println("Produced " + msg.getPayload());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //adding exit message
        Message msg = new Message("exit");
        try {
            queue.put(msg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
