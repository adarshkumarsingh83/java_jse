package com.adarsh.implementation;
import com.adarsh.annotation.*;
import com.adarsh.annotation.Message.messageType;

public class AnnotationImplement {
	
	@Message(messageType = messageType.IMPORTANT
    		,message = "This is the main method"
    		,methodName = "main"
    		,className = "AnnotationImplement"	)
	public static void main(String ...args){
		System.out.println("main method execution");
	}	
}
