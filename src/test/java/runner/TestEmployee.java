package runner;

import classes.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		//accessing static variables by using class name
		System.out.println(Employee.x);
        System.out.println(Employee.organizationName);
        //accessing static variables by using object (not recommended approach)
        Employee emp=new Employee();
        System.out.println(emp.x);
        System.out.println(emp.organizationName);
	}

}
