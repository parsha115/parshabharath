package runner;

import classes.calculatorService;

public class Testcalculator {

	public static void main(String[] args) 
	{
		// to call calculatorservice
		// step:1 create calculatorservice object
		calculatorService calServ=new calculatorService();
        // step:2 call/invoke/access method
		int res=calServ.add(10,20);
		System.out.println(res);
		
		double result=calServ.calculatorSimpleIntrest(20000.350,2,1.5);
		System.out.println(result);
		
	}

}
