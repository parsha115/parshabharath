package classes;

public class TestEmployeeService {

	public static void main(String[] args) {
		EmployeeService es=new EmployeeService();
		System.out.println(es.empid);
		System.out.println(es.getEmpName());
		System.out.println("--------------");
		int empi=es.empid;
		System.out.println(empi);
		String empn=es.getEmpName();
		System.out.println(empn);
	}

}
