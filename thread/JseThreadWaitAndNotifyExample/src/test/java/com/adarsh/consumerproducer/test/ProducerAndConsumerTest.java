package com.adarsh.consumerproducer.test;

import com.adarsh.consumerproducer.store.MyMessageStore;
import com.adarsh.consumerproducer.thread.Consumer;
import com.adarsh.consumerproducer.thread.Producer;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 3/7/14
 * Time: 12:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class ProducerAndConsumerTest {

    @Test
    public void test() throws Exception {
        final int maxSizeForMessageStore = 10;
        final long sleepTime = 0L;
        final MyMessageStore myMessageStore = new MyMessageStore();
        final Producer producer = new Producer(Producer.class.getSimpleName(), maxSizeForMessageStore, sleepTime, myMessageStore);
        final Consumer consumer = new Consumer(Consumer.class.getSimpleName(), maxSizeForMessageStore, sleepTime, myMessageStore);
        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
    }
}
