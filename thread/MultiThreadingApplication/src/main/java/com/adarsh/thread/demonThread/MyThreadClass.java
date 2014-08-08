package com.adarsh.thread.demonThread;

public class MyThreadClass extends Thread{
	long startTime;
	int counterVar;
	public MyThreadClass(String threadName,long startTime,int priority,int l){
		super();
		this.counterVar =l;
		this.startTime =startTime;
		this.setName(threadName);
		this.setPriority(priority);
		this.setDaemon(true);
		start();
	}
	
	public void run(){
		for( ; counterVar >0; counterVar--){
			try{
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(startTime);
			}catch(InterruptedException e){
				System.out.println("Exception Generated "+e);
			}
		}
	}

}
