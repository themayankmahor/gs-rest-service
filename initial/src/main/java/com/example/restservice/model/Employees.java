package com.example.restservice.model;

import java.util.List;

import com.example.restservice.entity.Employee;

public class Employees {
	
	private List<Employee> employeeList;
	
	public List<Employee> getEmployeeList(){
		
		return employeeList;
	}
	
	public void setEmployeeList(List<Employee> employeeList) {
		
		this.employeeList = employeeList;
	}

}
