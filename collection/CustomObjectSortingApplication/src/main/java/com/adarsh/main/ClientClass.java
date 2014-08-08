package com.adarsh.main;

import com.adarsh.domain.Employee;
import com.adarsh.util.MyComparator;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ClientClass {

	public static void main(String[] args) {
    
       Integer []empNumber={101,102,103,104,105};
       String []empName={"adarsh","amit","abhishek","amritesh","ajay"};
       Employee empObject[]=new Employee[5];
       
       for(int i=0;i<5;i++){
    	   empObject[i]= new Employee(empNumber[i],empName[i]);
       }
              
       TreeSet<Employee> treeSet1=new TreeSet<Employee>();
       for(Employee e1:empObject){
	   treeSet1.add(e1);
       }

        displayTree(treeSet1);

	   TreeSet<Employee> treeSet2=new TreeSet<Employee>(new MyComparator());
        for(Employee e1:empObject){
	           treeSet2.add(e1);
       }
        displayTree(treeSet2);
       
	}

    private static void displayTree(Set treeSet){
       Iterator<Employee> employeeIterator=treeSet.iterator();
        while(employeeIterator.hasNext()){
            Employee employee=(Employee)employeeIterator.next();
            System.out.println(employee.toString());
        }
    }

}
