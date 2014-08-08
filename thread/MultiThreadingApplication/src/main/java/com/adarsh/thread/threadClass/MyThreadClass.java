package com.adarsh.thread.threadClass;


public class MyThreadClass extends Thread{
	
	private long startTime;
	
	public MyThreadClass(String threadName,long startTime,int priority) {
		super();
		System.out.println("Thread is Started "+threadName);
		this.startTime =startTime;
		this.setName(threadName);
		this.setPriority(priority);
		this.start();
	}
	
	public void run(){
		try{
			for(int i=0;i<10;i++){	
		System.out.println(Thread.currentThread().getName());
		Thread.sleep(startTime);
			}
			System.out.println(Thread.currentThread().getName()+" is Completed ");
		}catch(InterruptedException e){
			System.out.println("Exception Generated "+e);
		}
	}

}
