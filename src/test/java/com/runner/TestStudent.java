package com.runner;

import com.classes.Student;
import com.classes.StudentService;

public class TestStudent {

	public static void main(String[] args) {
		StudentService studentService=new StudentService();
		int no=studentService.getRollNo();
		String name=studentService.getName();
		System.out.println(no);
		System.out.println(name);
		Student st=studentService.getStudentDetails();
		System.out.println("Student Aadhar Number: "+st.getAadharNumber());
		System.out.println("Student Address: "+st.getAddress());
		System.out.println("Student branch name: "+st.getBranchName());
		System.out.println("Student college name: "+st.getCollage());
	}

}
