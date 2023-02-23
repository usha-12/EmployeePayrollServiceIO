package com.brideglabz.employeepayroll;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class EmployeePayrollTest {
    @Test
    public void given3EmployeesWhenWrittenToFileShouldMatchEmployeeEntries() {
        EmployeePayRollImpl employeePayrollService = new EmployeePayRollImpl();
        employeePayrollService.addEmployee(new EmployeePayRollData(1, "Jeff Bezos", 10000));
        employeePayrollService.addEmployee(new EmployeePayRollData(2, "Bill Gates", 20000));
        employeePayrollService.addEmployee(new EmployeePayRollData(3, "Mark Z", 30000));
        employeePayrollService.writeEmployeeDataToFile();
        long entries = employeePayrollService.countEntries();
        Assertions.assertEquals(3, entries);
    }

    @Test
    public void given3EmployeesWhenWrittenToFileShouldPrintEmployeeEntries() {
        EmployeePayRollImpl employeePayrollService = new EmployeePayRollImpl();
        employeePayrollService.addEmployee(new EmployeePayRollData(1, "Jeff Bezos", 10000));
        employeePayrollService.addEmployee(new EmployeePayRollData(2, "Bill Gates", 20000));
        employeePayrollService.addEmployee(new EmployeePayRollData(3, "Mark Z", 30000));
        employeePayrollService.writeEmployeeDataToFile();
        employeePayrollService.printData();
        long entries = employeePayrollService.countEntries();
        Assertions.assertEquals(3, entries);
    }

    @Test
    public void given3EmployeesWhenWrittenToFileShouldPrintNumberOfEmployeeEntries() {
        EmployeePayRollImpl employeePayrollService = new EmployeePayRollImpl();
        employeePayrollService.addEmployee(new EmployeePayRollData(1, "Jeff Bezos", 10000));
        employeePayrollService.addEmployee(new EmployeePayRollData(2, "Bill Gates", 20000));
        employeePayrollService.addEmployee(new EmployeePayRollData(3, "Mark Z", 30000));
        employeePayrollService.writeEmployeeDataToFile();
        long entries = employeePayrollService.countEntries();
        System.out.println("Number of entries are " + entries);
        Assertions.assertEquals(3, entries);
    }
}
