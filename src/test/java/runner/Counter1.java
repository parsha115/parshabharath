package runner;

public class Counter1 
{
   public int count=0;  //object level
   public  Counter1()
   {
	   count++; //incrementing value
	   System.out.println(count);
   }
   public static void main(String[] args)
   {
	   //creating objects
	   Counter1 c1=new Counter1();
	   Counter1 c2=new Counter1();
	   Counter1 c3=new Counter1();
   }
 
}
