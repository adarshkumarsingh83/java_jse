package com.adarsh.thread.runnableInterfaceMultithreading;

public class MyRunnable implements Runnable {

	public MyRunnable() {
		super();
		new Thread(this).start();
	}

	public void run() {
		Thread.currentThread().setName("child classThread");
		try{
	    	for(int i=0;i<10;i++){
		    	System.out.println(Thread.currentThread().getName()+" "+i);
			   Thread.sleep(1000);
		       }
     }catch (Exception e) {
				System.out.println(e.getMessage());
			}

	}

}
