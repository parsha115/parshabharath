package runner;

import classes.StudentServiceDetails;

public class TestStudentDetailsService {

	public static void main(String[] args) {
		//Step-1: create object
		StudentServiceDetails sdService=new StudentServiceDetails();
       //Step-2: access/invoke/call instance variables by using object
		System.out.println(sdService.sid);
		System.out.println(sdService.sname);
		System.out.println(sdService.branchName);
	}

}
