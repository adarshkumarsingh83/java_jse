package com.adarsh.util;

import com.adarsh.domain.Employee;

import java.util.Comparator;

public class MyComparator implements Comparator<Employee> {

	public MyComparator() {
		super();
	}

	public int compare(Employee empObject1, Employee empObject2) {
		
		Integer empNumber1=((Employee)empObject1).getEmpNumber();	
		Integer empNumber2=((Employee)empObject2).getEmpNumber();
//		System.out.println(empNumber1+" "+empNumber2);
		return empNumber1.compareTo(empNumber2);
	}

}
