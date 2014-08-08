package com.adarsh.thread.mySynchronized.BlockCode;

public class SynchronizedBlock extends Thread{
	
	String male,female;
	Object o;

	public SynchronizedBlock(String male, String female,Object o) {
		super();
		this.male = male;
		this.female = female;
		this.o=o;
		start();
	}
	
    public void run(){
    	synchronized(o){
    	try{
    		System.out.print(" [ "+male);
    		Thread.sleep(1000);
    		System.out.println(female+" ] ");
    	}catch(InterruptedException e){
    		System.out.println("Exception Generated "+e);
    	}
      }
    }
}
