package com.adarsh.thread.interfaceRunnable;

public class MyThreadInterface implements Runnable{
	Thread thread;
	private long startTime;
	
	public MyThreadInterface(String threadName, long startTime, int priority) {
		thread =new Thread(this);
		System.out.println(threadName+" Started ");
		this.startTime = startTime;
		thread.setName(threadName);
		thread.setPriority(priority);
		thread.start();
	}

	public void run(){
		try{
			for(int i=0;i<20;i++){
				System.out.println(Thread.currentThread().getName()+"  Value  of the I "+i);
				Thread.sleep(startTime);
			}
			System.out.println(Thread.currentThread().getName()+" Completed ");
		}catch(InterruptedException e){
			System.out.println("Exception Generated "+e);
		}
		
	}

}
