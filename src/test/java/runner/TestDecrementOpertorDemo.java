package runner;

public class TestDecrementOpertorDemo {

	public static void main(String[] args) {
      int x=10;
      int y=--x; //first decrement x variable and then assign x value to y
      System.out.println(x);
      System.out.println(y);
      
      int w=10;
      int z=w--; //first assign w value to z variable and then decrement w value
      System.out.println(w);
      System.out.println(z);
	}

}
