package com.runner;

import com.classes.Employee;
import com.classes.EmployeeService;

public class TestEmployee {

	public static void main(String[] args) {
		EmployeeService employeeService=new EmployeeService();
		Employee emp=employeeService.getEmployeeDetails();
		System.out.println("Employee Aadhar Number: "+emp.getAadharNumber());
		System.out.println("Employee Address: "+emp.getAddress());
		System.out.println("Employee company name: "+emp.getCompanyName());
		System.out.println("Employee designation is: "+emp.getDesgination());
	}

}
