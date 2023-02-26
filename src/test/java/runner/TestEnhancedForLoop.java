package runner;

import classes.EnhancedForLoop;

public class TestEnhancedForLoop {

	public static void main(String[] args) {
		EnhancedForLoop el=new EnhancedForLoop();
		int[] empid= {10,20,30,40,50};
		el.retrivePrimitiveElementArr(empid);
		
		String[] sname= {"kalam","abdul","nagesharao"};
		el.retriveReferenceElementArr(sname);
	}

}
