package com.adarsh.service;

public class MyThread extends Thread {

	private MySampleClass obj;
	private int c;
	private String name;
	
	public MyThread(MySampleClass obj,int c,String name){
		this.obj=obj;
		this.c=c;
		this.name=name;
	}
	
	@SuppressWarnings("static-access")
	public void run(){
	   	if(c==1){
	   		obj.method1(name);
	   	}else if(c==2){
	   		obj.method2(name);
	   	}else if(c==3){
	   		obj.method3(name);
	   	}else{
	   		obj.method4(name);
	   	}
	}
}
