package runner;

import classes.StudentService;

public class TestStudentService {

	public static void main(String[] args) 
	{
        // how to invoke/access/call static method
		// by using calss name
		StudentService univerName=new StudentService();
		// method calling
		//UnvierName is variable to hold the returns of method
		System.out.println(univerName);
	}

}
