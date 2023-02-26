package runner;

public class Example8
{

	public static void main(String[] args) 
	{
		//create objects to class
         Work7 obj1=new Work7(101,"Abdul kalam");
         Work7 obj2=new Work7(102,"Thomus kutty");
         Work7 obj3=new Work7(103,"Steve jobs");
         //display values before change
         obj1.display();
         obj2.display();
         obj3.display();
         //change college name
         Work7.college="Google";
       	 //display values after change
         obj1.display();
         obj2.display();
         obj3.display();
         			
	}

}
