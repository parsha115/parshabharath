package runner;

import classes.RelationalOperatorService;

public class TestRelationalOperatorsDemo {

	public static void main(String[] args) {
		RelationalOperatorService ros=new RelationalOperatorService();
		ros.relationalOperators(10,20);
		System.out.println("------------");
		ros.relationalOperators(20,10);
		System.out.println("------------");
		ros.relationalOperators(10,10);
	}

}
