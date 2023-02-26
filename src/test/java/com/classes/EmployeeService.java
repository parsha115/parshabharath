package com.classes;

public class EmployeeService {
   public Employee getEmployeeDetails() {
	   Employee employee=new Employee();
	   employee.setAadharNumber(256525785);
	   employee.setAddress("Benguru");
	   employee.setDesgination("QA Lead");
	   return employee;
   }
}
