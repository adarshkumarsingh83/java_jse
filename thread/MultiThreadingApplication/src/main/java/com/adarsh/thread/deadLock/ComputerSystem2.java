package com.adarsh.thread.deadLock;

public class ComputerSystem2 extends Thread {
	Object printer,cdRom;

	public ComputerSystem2(Object printer, Object cdRom) {
		super("Computer System32");
		this.printer = printer;
		this.cdRom = cdRom;
		start();
	}
	
	public void run(){
	 try{
		 
		 synchronized(cdRom){
			 System.out.println("Computer 2 is using cdRom ");
			 Thread.sleep(10000);
		 }
		 
		 System.out.println("Computer 2 System is Trying to use printer ");
		 
		 synchronized (printer) {
			System.out.println("Computer 2 System is using printer ");
		}
		 
	 }catch(Exception e){
		 System.out.println("Exception Generated "+e);
	 }
	}


}
