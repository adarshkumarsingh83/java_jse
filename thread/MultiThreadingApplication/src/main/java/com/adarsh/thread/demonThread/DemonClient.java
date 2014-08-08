package com.adarsh.thread.demonThread;

public class DemonClient {
	public static void main(String[] args) {
	
		@SuppressWarnings("unused")
		MyThreadClass t1=new MyThreadClass(" adarsh kumar ",200,5,10000);		
		@SuppressWarnings("unused")
		MyThreadClass t2=new MyThreadClass(" amit  kumar ",200,5,10000);
		@SuppressWarnings("unused")
		MyThreadClass t3=new MyThreadClass(" sonu kumar ",200,5,10);
		
		try{
		for(int i=0;i<50;i++){
			System.out.println(Thread.currentThread().getName()+" value of i "+i);
			Thread.sleep(300);
		}
		}catch(Exception e){
			System.out.println("Exception Generated "+e);
		}
	}

}
