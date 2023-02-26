package runner;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		int result1=(x<y)?(x+y):(x*y);
		System.out.println(result1);
		int result2=(x>y)?(x+y):(x*y);
		System.out.println(result2);

	}

}
//30
//200