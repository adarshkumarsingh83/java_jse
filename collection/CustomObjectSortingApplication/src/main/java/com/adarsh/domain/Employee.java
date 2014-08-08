package com.adarsh.domain;

public class Employee implements Comparable{
	
   Integer empNumber;   
    String empName;
   
   public Employee(Integer empNumber, String empName) {
		this.empNumber = empNumber;
		this.empName = empName;
	}

   public Integer getEmpNumber() {
		return empNumber;
	}
   
   public String toString(){
       return "Employee Details "+empNumber+" "+empName;	   	   
   }

   public int compareTo(Object object) {
	  
	   int result=0;
	   int employeeNumber1=this.empNumber;
	   int employeeNumber2=((Employee)object).getEmpNumber();
	 //  System.out.println(employeeNumber1+" "+employeeNumber2);
	    if(employeeNumber1<employeeNumber2){
	    	result=-1;
	    }else if(employeeNumber2<employeeNumber1){
	    	result=1;
	    }else{
	    	result=0;
	    }
	  return result;
    }
}
