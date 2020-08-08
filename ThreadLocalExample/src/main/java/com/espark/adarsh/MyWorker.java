package com.espark.adarsh;

/**
 * Created by Adarsh on 8/18/15.
 */
public class MyWorker implements Runnable {

    private ThreadLocal<String> threadLocal=new ThreadLocal<String>(){
        @Override protected String initialValue() {
            return System.getProperty("user.name").toUpperCase();
        }
    };
    private String name;

    public MyWorker(final String name){
        this.name=name;
    }

    @Override
    public void run() {
        final String data=name.toUpperCase()+"_"+Math.random();
        System.out.println("Value Set "+data);
        this.threadLocal.set(data);
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Value Get from the Thread "+threadLocal.get());
    }
}
