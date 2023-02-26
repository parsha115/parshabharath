package runner;

import classes.Product;

public class TestProduct {

	public static void main(String[] args) {
		// access instance properties/variables by using object
		Product prod=new Product();
		System.out.println(prod.tokenNo);
		System.out.println(prod.reigisterid);
		System.out.println(prod.pid);
		System.out.println(prod.productid);
		System.out.println(prod.salary);
		System.out.println(prod.price);
		System.out.println(prod.isValid);
		System.out.println(prod.abdul);
		System.out.println(prod.pname);
		
		//access static properties/variables by using class name
		System.out.println(Product.productISBN);
		System.out.println(Product.amount);
		System.out.println(Product.kalam);
		System.out.println(Product.countryCode);

	}

}
