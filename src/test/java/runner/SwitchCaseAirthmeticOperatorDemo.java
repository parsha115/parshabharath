package runner;

import classes.SwitchCaseArthmeticOperatorService;

public class SwitchCaseAirthmeticOperatorDemo {

	public static void main(String[] args) {
		SwitchCaseArthmeticOperatorService sss=new SwitchCaseArthmeticOperatorService();
		sss.performArthmetic("+",10,2);
		sss.performArthmetic("-",10,2);
		sss.performArthmetic("*",10,2);
		sss.performArthmetic("/",10,2);
		sss.performArthmetic("%",10,2);
		sss.performArthmetic("^",10,2);
	}
}
