package com.classes;

public class BMWCar extends Car {
	       // 2 properties
   public int gears;
   public String bodyStyle;
      // 4 properties
   //-------> 1 Method
   public void printBmwCarDetails() {
	   System.out.println("total gears: "+gears);
	   System.out.println("body style: "+bodyStyle);
	   System.out.println("car color: "+color);
	   System.out.println("car model: "+modelNo);
	   printCarDetails();
   }
   //-------------->2 methods
}
