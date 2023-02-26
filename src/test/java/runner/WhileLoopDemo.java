package runner;

import classes.WhileLoopService;

public class WhileLoopDemo {

	public static void main(String[] args) {
		WhileLoopService ws=new WhileLoopService();
		int result=ws.findTotalSumOf1to10Num();
        System.out.println(result);
	}

}
