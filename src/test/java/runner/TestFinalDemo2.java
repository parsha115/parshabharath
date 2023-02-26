package runner;

public class TestFinalDemo2 {

	final int x=1000;
	final static int y=0;
	
	public static void main(String[] args) {
		TestFinalDemo2 td=new TestFinalDemo2();
		System.out.println(td.x);
		System.out.println(td.y);
		System.out.println("--------------");
		int xno=td.x;
		System.out.println(xno);
		int yno=td.y;
		System.out.println(yno);
		System.out.println("--------------");
		System.out.println(TestFinalDemo2.y);
		//  td.x=1001; CE:
		// td.y=10; CE:
	}

}
