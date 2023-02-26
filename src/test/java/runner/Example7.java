package runner;

public class Example7 {

	public static void main(String[] args)
	{
		//Work4 obj1=new Work4();  //error
		//default constructor won't come directly due to existence of our constructors
		Work4 obj2=new Work4(11);                     //1st constructor
		Work4 obj3=new Work4(11,"steve");            //3rd constructor
		Work4 obj4=new Work4("kalam",11);           //4th constructor
		Work4 obj5=new Work4(110);                 //1st constructor
		Work4 obj6=new Work4("check de india");   //2nd constructor
	}

}
