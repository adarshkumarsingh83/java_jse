package com.adarsh.thread.consumerProducer.file;

public class FileConsumer extends Thread {
    FileProducer fileProducer;

    public void setFileProducer(FileProducer fileProducer) {
        this.fileProducer = fileProducer;
    }

    public FileConsumer() {
        super();
    }

    public void run() {
        while (true) {
            System.out.println("File Consumer is checking for file...");
            if (fileProducer.fileExist) {
                System.out.println("FileConsumer is reading the file");
                break;
            } else {
                try {
                    synchronized (this) {
                        this.wait();
                    }
                } catch (InterruptedException e) {

                }
            }
        }

    }

}
