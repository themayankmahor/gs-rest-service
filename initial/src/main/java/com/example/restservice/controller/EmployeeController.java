package com.example.restservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.managers.EmployeeManager;
import com.example.restservice.model.Employees;

@RestController
public class EmployeeController {

	@GetMapping("/employees")
	public Employees getEmployees() {
		
		return EmployeeManager.getAllEmployees();
	}
}
