package com.adarsh.thread.runnableInterfaceMultithreading;

public class MyRunnableClient {

	public MyRunnableClient() {
		super();
	}

public static void main(String[] args) {
		new MyRunnable();		
		MyRunnableClient.method();
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
