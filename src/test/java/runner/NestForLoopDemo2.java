package runner;

public class NestForLoopDemo2 {

	public static void main(String[] args) {
	   //outer for loop
		for(int i=0;i<5;i++)
		{
			//inner for loop
			for(int j=0;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
