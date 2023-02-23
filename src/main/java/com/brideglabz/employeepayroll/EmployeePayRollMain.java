package com.brideglabz.employeepayroll;
public class EmployeePayRollMain {
    public static void main(String[] args) {
            //creating the object for accessing the method
            EmployeePayRollImpl employeePayrollService = new EmployeePayRollImpl();
            System.out.println("Welcome to employee payRoll");
            employeePayrollService.readEmployeeDataFromConsole();
            employeePayrollService.writeEmployeeDataInConsole();
        }
    }

