package com.adarsh.thread.classThread;

public class MyThreadClient {

	public MyThreadClient() {
		super();
	}

	
	public static void main(String[] args) {
		
	     MyThread myThread=new MyThread();
	     myThread.start();
	     MyThreadClient.method();
	}
    
	private static void method(){
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
