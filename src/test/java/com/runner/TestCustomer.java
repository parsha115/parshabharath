package com.runner;

import com.classes.CustomerService;

public class TestCustomer {

	public static void main(String[] args) {
		CustomerService cs=new CustomerService();
		String cname=cs.getCustomerName();
		System.out.println(cname);
	}

}
