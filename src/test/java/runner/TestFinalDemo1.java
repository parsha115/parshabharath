package runner;

public class TestFinalDemo1 {
	final int x=100;
	int y=200;
	public static void main(String[] args) {
		TestFinalDemo1 td=new TestFinalDemo1();
		System.out.println(td.x);
		System.out.println(td.y);
		System.out.println("---------------");
		int tn1=td.x;
		System.out.println(tn1);	
		int tn2=td.y;
		System.out.println(tn2);	
		System.out.println("-----------");
		// td.x =101; CE:
		td.y=201;
		System.out.println(td.y);
	}

}
