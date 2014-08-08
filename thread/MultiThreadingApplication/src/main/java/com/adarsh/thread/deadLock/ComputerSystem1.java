package com.adarsh.thread.deadLock;

public class ComputerSystem1 extends Thread{

	Object printer,cdRom;

	public ComputerSystem1(Object printer, Object cdRom) {
		super("Computer System 1");
		this.printer = printer;
		this.cdRom = cdRom;
		start();
	}
	
	public void run(){
	 try{
		 
		 synchronized(printer){
			 System.out.println("Computer 1 is using printer ");
			 Thread.sleep(10000);
		 }
		 
		 System.out.println("Computer 1 System is Trying to use cdRom ");

		 synchronized (cdRom) {
			System.out.println("Computer 1 System is using cdRom ");
		}
		 
	 }catch(Exception e){
		 System.out.println("Exception Generated "+e);
	 }
	}
}
