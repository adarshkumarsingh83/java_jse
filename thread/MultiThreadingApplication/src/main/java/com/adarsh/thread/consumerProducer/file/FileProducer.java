package com.adarsh.thread.consumerProducer.file;

public class FileProducer extends Thread {

    boolean fileExist = false;
    FileConsumer fileConsumer;

    public FileProducer(FileConsumer fileConsumer) {
        this.fileConsumer = fileConsumer;
    }

    public void run() {
        System.out.println("File producer is creating file");
        try {

            Thread.sleep(10000);
        } catch (InterruptedException e) {

        }
        fileExist = true;
        synchronized (fileConsumer) {
            fileConsumer.notify();
        }

        System.out.println("File has been created");

    }


}
