package runner;

import classes.Product1;
import classes.Student1;
import classes.StudentRegistrationService;

public class StudentRegistrationDemo {

	public static void main(String[] args) {
		StudentRegistrationService srs=new StudentRegistrationService();
		Student1 student=new Student1();
		student.setStudentId(1001);
		student.setStudentName("abdulkalam");
		srs.register(student);
		
		Product1 product=new Product1();
		product.setPid(1124);
		product.setPname("Electonic divces");
		srs.save(product);
		
	}

}
