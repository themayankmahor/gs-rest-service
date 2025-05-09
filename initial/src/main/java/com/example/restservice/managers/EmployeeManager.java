package com.example.restservice.managers;

import java.util.ArrayList;
import java.util.List;

import com.example.restservice.entity.Employee;
import com.example.restservice.model.Employees;

public class EmployeeManager {
	
	private static Employees employees = new Employees();
	
	static {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("E001", "John", "Doe", "john.doe@example.com", "Software Engineer"));
        employeeList.add(new Employee("E002", "Jane", "Smith", "jane.smith@example.com", "Product Manager"));
        employeeList.add(new Employee("E003", "Mike", "Johnson", "mike.johnson@example.com", "Data Analyst"));
        employeeList.add(new Employee("E004", "Emily", "Brown", "emily.brown@example.com", "UX Designer"));
        employees.setEmployeeList(employeeList);
    }

    public static Employees getAllEmployees() {
        return employees;
    }

    public static void addEmployee(Employee employee) {
        employees.getEmployeeList().add(employee);
    }
}
