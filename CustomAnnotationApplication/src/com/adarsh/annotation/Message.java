package com.adarsh.annotation;

public @interface Message {
	
	  public enum messageType{IMPORTANT,NOT_IMPORTANT,NONE};
	  public String message();
	  public String methodName();
	  public String className();
      public messageType messageType() default messageType.NONE;
	
}
//http://www.ibm.com/developerworks/library/j-annotate2/index.html