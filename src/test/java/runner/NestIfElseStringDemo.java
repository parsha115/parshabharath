package runner;

import classes.NestIfElseStringService;

public class NestIfElseStringDemo {

	public static void main(String[] args) {
		NestIfElseStringService ns=new NestIfElseStringService();
	    String stresult=ns.getStudentDistncation(380);
	    String stresult1=ns.getStudentDistncation(300);
	    String stresult2=ns.getStudentDistncation(220);
	    String stresult3=ns.getStudentDistncation(160);
	    
	    System.out.println(stresult);
	    System.out.println(stresult1);
	    System.out.println(stresult2);
	    System.out.println(stresult3);
	    
	}

}
