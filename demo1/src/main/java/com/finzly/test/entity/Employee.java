package com.finzly.test.entity;

public class Employee
{
	private int empID;
	private String name;
	private int age;
	private String role;
	private double salary;
	
	public Employee(int empID, String name, int age, String role, double salary) {
		super();
		this.empID = empID;
		this.name = name;
		this.age = age;
		this.role = role;
		this.salary = salary;
	}

	public int getEmpID() {
		return empID;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getRole() {
		return role;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", age=" + age + ", role=" + role + ", salary=" + salary
				+ "]";
	}
	
	
	

}
