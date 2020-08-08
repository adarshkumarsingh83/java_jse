package com.adarsh.generic.genricCustomisedClass;

public class GenericClass<T>{
	
private T object;

	public GenericClass(T object) {
	super();
	this.object=object;
	}

	public T getObject(){
		return object;
	}
	
	public String toString(){
		return object+" ";
	}
	
	public void getClassType(){
		System.out.println(object.getClass().getName());
	}
}
