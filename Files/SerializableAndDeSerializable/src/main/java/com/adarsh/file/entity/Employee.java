/*
 * Copyright © MeritTrac Services Pvt. Ltd.
 * All Rights Reserved.
 */

package com.adarsh.file.entity;
/*
 * {@inheritDoc}
*/

/**
 * @Product : Employee provide implementation of the specification
 *                    provided for the ...    
 */


import java.io.Serializable;

/**
 * @author $CreatedBy Adarsh_K
 * @author $LastChangedBy: Adarsh_K
 * @version $Revision: 1.0 $, $Date:: 22/5/13 8:45 PM
 * @see
 */

public class Employee implements Serializable {

    private Integer empId;
    private String empName;
    private String emailId;

    public Employee() {
        super();
    }

    public Employee(Integer empId, String empName, String emailId) {
        this();
        this.empId = empId;
        this.empName = empName;
        this.emailId = emailId;
    }

    public String displayEmployee() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
