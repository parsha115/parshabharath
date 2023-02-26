package runner;

import classes.StrArrayDemo;

public class TestStrArrayDemo {

	public static void main(String[] args) {
		StrArrayDemo sademo=new StrArrayDemo();  //object creation
		String[] studentNameArr=new String[4];   // string array creation
		studentNameArr[0]="abdul";
		studentNameArr[1]="kalam";
		studentNameArr[2]="magnitia";
		studentNameArr[3]="JNTUH";
		sademo.printStringElements(studentNameArr); //method calling/invoke/accessing
	    System.out.println(studentNameArr.length); 
	}

}
