package com.adarsh.service;

import java.lang.Thread;
import static java.lang.System.out;

public class MySampleClass {
		
	/** OBJECT LEVEL LOCK IS REQUIRED */
	public synchronized void method1(String name){
		try{
		    out.print("[ "+name);
		    Thread.currentThread().sleep(5000);
		    out.print("]");
		}catch(Exception e){
			e.printStackTrace();
		}
	} 
	 
	public void method2(String name){
		try{		
			synchronized(this){
				out.print("[ "+name);
			    Thread.currentThread().sleep(5000);
			    out.print("]");
			}	
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/** CLASS LEVEL LOCK IS REQUIRED */
	public static synchronized void method3(String name){
		try{
		    out.print("[ "+name);
		    Thread.currentThread().sleep(5000);
		    out.print("]");
		}catch(Exception e){
			e.printStackTrace();
		}
	} 
	 
	public void method4(String name){
		try{		
			synchronized(MySampleClass.class){
				out.print("[ "+name);
			    Thread.currentThread().sleep(5000);
			    out.print("]");
			}	
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
