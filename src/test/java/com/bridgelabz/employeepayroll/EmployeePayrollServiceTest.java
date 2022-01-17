package com.bridgelabz.employeepayroll;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.bridgelabz.employeepayroll.EmployeePayrollService.IOService;


public class EmployeePayrollServiceTest {
    @Test
    public void given3Employees_WhenWrittenToFile_ShouldMatchEmployeeEntries() {
        EmployeePayrollData[] arrayOfEmployees = {
                new EmployeePayrollData(1, "Binny Bansal", 120000.0),
                new EmployeePayrollData(2, "Bhavesh Agarwal", 150000.0),
                new EmployeePayrollData(3, "Karuna Nayar", 200000.0)
        };
        EmployeePayrollService employeePayrollService;
        employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmployees));
        employeePayrollService.writeEmployeePayrollData(IOService.FILE_IO);

        employeePayrollService.printData(EmployeePayrollService.IOService.FILE_IO);
        long entries = employeePayrollService.countEntries(IOService.FILE_IO);
        Assertions.assertEquals(3, entries);

    }

    @Test
    public void givenFile_WhenRead_ShouldReturnNumberOfEntries() {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        long entries = employeePayrollService.readDataFromFile(IOService.FILE_IO);
        Assertions.assertEquals(3, entries);
    }

}