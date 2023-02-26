package runner;

public class Work7 
{
   //properties
	public int rollno;
	public String name;
	public static String college="magnitia";   //common memory to all objects
	//constructor method
	public Work7(int x,String y)
	{
		rollno=x;
		name=y;
	}
	//general methods
	public void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
}
