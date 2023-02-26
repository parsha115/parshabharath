package runner;

import classes.Customer;

public class TestCustomer {

	public static void main(String[] args) {
	    //step1: accessing instance variables by using object
		Customer cust=new Customer();
		System.out.println(cust.custId);
		System.out.println(cust.custName);
		
		//Step2: accessing static variables by using class name
		System.out.println(Customer.countryCode);
		System.out.println(Customer.x);
		
	}

}
