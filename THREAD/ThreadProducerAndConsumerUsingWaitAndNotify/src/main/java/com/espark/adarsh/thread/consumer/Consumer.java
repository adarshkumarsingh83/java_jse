package com.espark.adarsh.thread.consumer;

import java.util.List;

/**
 * Created by Adarsh on 9/3/15.
 */
public class Consumer<T> extends Thread {

    private List<T> dataContainer;

    public Consumer(String name, List<T> dataContainer) {
        super(name);
        this.dataContainer = dataContainer;
    }

    public void run() {
        while (true) {
            this.consumeData();
        }
    }

    private void consumeData() {
        try {

            synchronized (this.dataContainer) {
                if (this.dataContainer.isEmpty()) {
                    System.out.println("Data Container is Empty ");
                    this.dataContainer.wait();
                } else {
                    Thread.sleep(1000);
                    System.out.println("Data is Consumed => " + this.dataContainer.remove(0));
                    this.dataContainer.notifyAll();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
