package runner;

public class Counter2 
{
   public static int count=0;  //class level
   public  Counter2()
   {
	   count++; //incrementing value
	   System.out.println(count);
   }
   public static void main(String[] args)
   {
	   //creating objects
	   Counter2 c1=new Counter2();
	   Counter2 c2=new Counter2();
	   Counter2 c3=new Counter2();
   }

}
