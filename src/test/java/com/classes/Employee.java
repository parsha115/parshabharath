package com.classes;

public class Employee extends Person {
                //-------> 4 methods
	private String desgination;
	public String getCompanyName() {
		return "magnitiait";
	}
	public String getDesgination() {
		return desgination;
	}
	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}
}
