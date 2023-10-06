package com.finzly.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finzly.test.entity.Employee;
import com.finzly.test.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController 
{
	@Autowired
	EmployeeService es;
	
	@GetMapping("getemployeedetails")
	public Employee getEmployeeDetails()
	{
		return es.getEmployeeDetails();
	}

}
