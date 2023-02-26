package runner;

import classes.printTextService;

public class TestprintDemo {

	public static void main(String[] args)
	{
       // create object
		printTextService printTextSer=new printTextService();
		// invoke/access/call method
		printTextSer.printMessage();
		printTextSer.wishMessage("Abdul Kalam");
	}

}
