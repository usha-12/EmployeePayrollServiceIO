package com.brideglabz.employeepayroll;

public class EmployeePayRollMain {
    public static void main(String[] args) {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        System.out.println("Welcome to the Employee_Payroll_Services");
        employeePayrollService.readEmployeeDataFromConsole();
        employeePayrollService.writeEmployeeDataInConsole();
    }

}
