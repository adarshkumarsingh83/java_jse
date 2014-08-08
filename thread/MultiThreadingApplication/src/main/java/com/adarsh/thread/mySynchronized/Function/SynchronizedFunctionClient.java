package com.adarsh.thread.mySynchronized.Function;

public class SynchronizedFunctionClient {
	
	public static void main(String[] args) {
		
		SynchronisedFunctionClass synchronisedFunctionClass=new SynchronisedFunctionClass();
	
		new SynchronizedFunction(" Adarsh "," Sonu ",synchronisedFunctionClass);
		
		new SynchronizedFunction(" Adarsh "," Sonu ",synchronisedFunctionClass);
		
		new SynchronizedFunction(" Adarsh "," Sonu ",synchronisedFunctionClass);
	
		new SynchronizedFunction(" Adarsh "," Sonu ",synchronisedFunctionClass);
	}

}
