package runner;

import classes.EqualOperatorsService;

public class TestEqualOperatorDemo {

	public static void main(String[] args) {
		EqualOperatorsService eos=new EqualOperatorsService();
		eos.equalOperators(10,20);
		System.out.println("-----different------");
		eos.equalOperators(10,10);
		System.out.println("-----same--------");
		eos.equalOperatorsForBoolean(true,false);
		System.out.println("-----different boolean------");
		eos.equalOperatorsForBoolean(true,true);
		System.out.println("-----same boolean------");
		
		System.out.println("/////////////////////");
		System.out.println(30 == 40);
		System.out.println(30 !=40);
		System.out.println("***************");
		System.out.println(50 == 50);
		System.out.println(50 != 50);
		System.out.println("+++++++++++++++++");
		System.out.println(true == false);
		System.out.println(true == true);
		System.out.println(true != false);
		System.out.println(true != true);
		System.out.println("--------------");
		System.out.println(false == true);
		System.out.println(false == false);
		System.out.println(false != true);
		System.out.println(false != false);
	}

}
