package com.espark.adarsh.thread.producer;

import java.util.List;

/**
 * Created by Adarsh on 9/3/15.
 */
public class Producer<T> extends Thread {

    private List<T> dataContainer;
    private T data;


    public Producer(String name, List<T> dataContainer, T data) {
        super(name);
        this.dataContainer = dataContainer;
        this.data = data;
    }

    public void run() {
        while (true) {
            this.produceData(this.data);
        }
    }

    private void produceData(final T data) {
        try {
            synchronized (this.dataContainer) {
                if (this.dataContainer.size() == 5) {
                    System.out.println("Data Container is Full Now");
                    this.dataContainer.wait();
                }else{
                Thread.sleep(1000);
                this.dataContainer.add(data);
                System.out.println("Data is Produced " + data);
                this.dataContainer.notifyAll();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
