package com.adarsh.thread.classThread;
import static java.lang.System.out;

public class MyThread extends Thread {

	public MyThread() {
		super();
	}

	public void start(){
		super.start();
		out.println("start method of the MyThread Class");
		Thread.currentThread().setName("Radha Singh ");
	}
	
	public void run(){
		try{
			for(int i=0;i<10;i++){
				out.println(Thread.currentThread().getName()+" "+i);
				Thread.sleep(1000);
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
