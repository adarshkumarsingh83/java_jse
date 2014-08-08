package com.adarsh.thread.mySynchronized.Function;

public class SynchronizedFunction extends Thread{
	
	String male,female;
	SynchronisedFunctionClass o;
	
    public SynchronizedFunction(String male, String female, SynchronisedFunctionClass o) {
		super();
		this.male = male;
		this.female = female;
		this.o = o;
		start();
    } 
    
    public void run(){
       o.display(male,female);
    }
}
