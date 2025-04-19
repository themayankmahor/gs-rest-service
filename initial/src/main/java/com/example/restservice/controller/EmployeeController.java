package com.example.restservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.entity.Employee;
import com.example.restservice.managers.EmployeeManager;
import com.example.restservice.model.Employees;

@RestController
public class EmployeeController {

	@GetMapping("/employees")
	public Employees getEmployees() {
		
		return EmployeeManager.getAllEmployees();
	}
	
	@PostMapping("/employees")
	public String addEmployee(@RequestBody Employee employee) {
		
		EmployeeManager.addEmployee(employee);
		return "Employee added successfully!";
	}
}
