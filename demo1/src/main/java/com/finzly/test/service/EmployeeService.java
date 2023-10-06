package com.finzly.test.service;
import org.springframework.stereotype.Service;

import com.finzly.test.entity.Employee;

@Service
public class EmployeeService
{
	Employee emp;
	
	public Employee getEmployeeDetails()
	{
		emp = new Employee(1, "Urvashi Tiwari", 22, "Trainee Developer", 35000);	
		return emp;
	}

}
