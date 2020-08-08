/*
 * Copyright © MeritTrac Services Pvt. Ltd.
 * All Rights Reserved.
 */

package com.adarsh.test;
/*
 * {@inheritDoc}
*/

/**
 * @Product : SerializableAndDeSerializableTest provide implementation of the specification
 *                    provided for the ...    
 */


import com.adarsh.file.entity.Employee;
import com.adarsh.file.service.ObjectReaderService;
import com.adarsh.file.service.ObjectReaderServiceImpl;
import com.adarsh.file.service.ObjectWitterService;
import com.adarsh.file.service.ObjectWitterServiceImpl;
import com.sun.corba.se.impl.orbutil.ObjectWriter;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author $CreatedBy Adarsh_K
 * @author $LastChangedBy: Adarsh_K
 * @version $Revision: 1.0 $, $Date:: 22/5/13 9:15 PM
 * @see
 */

public class SerializableAndDeSerializableTest {

    private static final BufferedReader BUFFERED_READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        System.out.println("Enter the File Name ");
        String fileName = BUFFERED_READER.readLine();
        System.out.println("Do U Want to Override the Existing Data Y}N ");
        boolean appendFlag = (BUFFERED_READER.readLine().trim().equalsIgnoreCase("Y") ? false : true);
        ObjectWitterService objectWitterService = new ObjectWitterServiceImpl(fileName, appendFlag);
        List<Object> empList = getEmployee();
        objectWitterService.writeObject(empList);
        ObjectReaderService objectReaderService=new ObjectReaderServiceImpl(fileName);
        empList=objectReaderService.readObject();
        displayEmployee(empList);
    }

    private static final List<Object> getEmployee() throws Exception {
        final List<Object> employeeList = new ArrayList<>();
        System.out.println("Enter the Employee Details ");
        String choice = "Y";
        do {
            System.out.println("Enter the Employee Id ");
            Integer empId = Integer.parseInt(BUFFERED_READER.readLine().trim());
            System.out.println("Enter the Employee Name ");
            String empName = BUFFERED_READER.readLine().trim();
            System.out.println("Enter the Email Id ");
            String empEmail = BUFFERED_READER.readLine().trim();
            employeeList.add(new Employee(empId, empName, empEmail));
            System.out.println("Do U Want to Continue Y|N ");
            choice = BUFFERED_READER.readLine();
        } while (choice.equalsIgnoreCase("Y"));
        return employeeList;
    }

    private static void displayEmployee(final List<Object> empList)throws Exception{
        for(Object object:empList){
            System.out.println(((Employee)object).displayEmployee());
        }
    }
}
