package com.adarsh.main;

import com.adarsh.service.MySampleClass;
import com.adarsh.service.MyThread;

public class ClientClass {

	
	public static void main(String[] args) {
		MySampleClass obj=new MySampleClass();
		MyThread t1 = new MyThread(obj,1,"syn-method");
		MyThread t2 = new MyThread(obj,2,"syn-block");
		MyThread t3 = new MyThread(obj,3,"static syn-method");
		MyThread t4 = new MyThread(obj,4,"syn-block class level");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
