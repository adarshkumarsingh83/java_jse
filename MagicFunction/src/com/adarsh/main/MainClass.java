package com.adarsh.main;
import com.adarsh.magic.*;
import static java.lang.System.out;


public class MainClass {

	static private MagicFunction object=new MyBeanClass();
	
	public static void main(String[] args) {
      object.setProperties("name","Adarsh Kumar");
      object.setProperties("age",28);
      object.setProperties("dob", "13-sept-1983");
      
      out.println(""+object.getProperties("name"));
      out.println(""+object.getProperties("dob"));
      out.println(""+object.getProperties("age"));
      object.setProperties("age",30);
      out.println(""+object.getProperties("age"));
	}

}
