package com.classes;

public class Student extends Person {
      //-------------> 4 methods
	private String branchName;
	public String getCollage() {
		return "Magnitia";
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
}
