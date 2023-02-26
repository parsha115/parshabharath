package runner;

import classes.SwitchCaseService;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		SwitchCaseService ss=new SwitchCaseService();
		ss.findWeekDay(1);
		ss.findWeekDay(5);
		ss.findWeekDay(8);
	}

}
