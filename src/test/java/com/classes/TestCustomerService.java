package com.classes;

public class TestCustomerService {

	public static void main(String[] args) {
		CustomerService cs=new CustomerService();
		String cname=cs.getCustomerName();
		System.out.println(cname);
	}

}
