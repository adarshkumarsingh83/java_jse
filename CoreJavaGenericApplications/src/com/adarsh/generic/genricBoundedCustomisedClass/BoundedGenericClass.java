package com.adarsh.generic.genricBoundedCustomisedClass;


public class BoundedGenericClass< T extends Number>{

	private T object;
	
	public BoundedGenericClass(T object){
             super();
             this.object=object;
	}
	
   public void getObjectClass(){
	   System.out.println(object.getClass().getName());
	   System.out.println(object.intValue());
   }
	
   public String toString(){
	   return object+"";
   }
}
