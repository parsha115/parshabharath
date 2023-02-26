package com.classes;

public class StudentService {
  public Student getStudentDetails() {
	  Student st=new Student();
	  st.setAadharNumber(545465174);
	  st.setAddress("hyd");
	  st.setBranchName("csc");
	  return st;  
  }
  public int getRollNo() {
	  return 100;
  }
  public String getName() {
	  return "abdul";
  }
}
