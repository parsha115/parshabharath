package runner;

public class Sample1 
{
   int x;                   //property 
   public Sample1()      //constructor
   {
	   x=10;
   }
   public void display()
   {
	   System.out.println(x);
   }
   public static void main(String[] args)
   {
	   Sample1 obj=new Sample1();
	   obj.display();
   }
}
