package com.adarsh.magic;
import java.util.LinkedHashMap;
public class MyBeanClass implements MagicFunction{

	private static LinkedHashMap<String,Object> beanClassProperties;
	
	static{
	    beanClassProperties=new LinkedHashMap<String,Object>();
	}
	
	protected String str;
	
	@Override
	public Object getProperties(String name) {	
		return beanClassProperties.get(name);
	}

	@Override
	public void setProperties(String name, Object value) {
		beanClassProperties.put(name, value);
	}

}
