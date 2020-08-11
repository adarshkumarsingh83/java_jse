package com.espark.adarsh.thread;

import com.espark.adarsh.thread.consumer.Consumer;
import com.espark.adarsh.thread.consumer.MyConsumer;
import com.espark.adarsh.thread.producer.MyProducer;
import com.espark.adarsh.thread.producer.Producer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adarsh on 9/3/15.
 */
public class ApplicationMain {

    public static void main(String[] args) throws Exception {

        // startProducerAndConsumer();

        startMyProducerAndMyConsumer();
    }

    public static void startProducerAndConsumer() throws Exception {

        final List<Integer> dataContainer = new ArrayList<Integer>();
        final Producer<Integer> producer = new Producer<Integer>("Producer", dataContainer, 10);
        final Consumer<Integer> consumer = new Consumer<Integer>("Consumer", dataContainer);
        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
    }

    public static void startMyProducerAndMyConsumer() throws Exception {
        final Object lock = new Object();
        final List list = new ArrayList();
        new MyProducer("MyProducer", lock, list).start();
        new MyConsumer("MyConsumer", lock, list).start();
    }
}
