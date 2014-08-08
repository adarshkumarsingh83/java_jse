package com.adarsh.thread.mySynchronized.Function;

public class SynchronisedFunctionClass {
	
	public SynchronisedFunctionClass(){
		super();
	}
	
	 synchronized void display(String male,String female){
	    	try{
	    		System.out.print(" [ "+male);
	    		Thread.sleep(1000);
	    		System.out.print(female+" ] ");
	    	}catch(InterruptedException e){
	    		System.out.println("Exception Generated "+e);
	    	}
	      }     

}
