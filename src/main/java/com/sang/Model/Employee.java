package com.sang.Model;

import java.util.Date;

/**
 * Created by Sang on 11/11/2016.
 */
public class Employee {
    private long    empID;
    private String empName;
    private Date empHireDate;
    private double  empSalary;

    public long getEmpID() {
        return empID;
    }

    public void setEmpID(long empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getEmpHireDate() {
        return empHireDate;
    }

    public void setEmpHireDate(Date empHireDate) {
        this.empHireDate = empHireDate;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }
}
