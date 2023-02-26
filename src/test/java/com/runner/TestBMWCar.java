package com.runner;

import com.classes.BMWCar;

public class TestBMWCar {

	public static void main(String[] args) {
		BMWCar bmwcar=new BMWCar();
		bmwcar.color="black";
		bmwcar.modelNo=2017;
		bmwcar.gears=5;
		bmwcar.bodyStyle="Activean";
		System.out.println("--------------------");
		bmwcar.printBmwCarDetails();
		System.out.println("-----------------");
		bmwcar.printCarDetails();
	}

}
