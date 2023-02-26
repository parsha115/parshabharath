package classes;

public class NestIfElseService {
    public void studentDistincation(int totalMarks){
    	if(totalMarks > 360)
    	{
    		System.out.println("First Class");
    	}
    	else if(totalMarks<360 && totalMarks>260)
    	{
    		System.out.println("Second Class");
    	}
    	else if(totalMarks<260 && totalMarks>200)
    	{
    		System.out.println("Third Class");
    	}
    	else 
    	{
    		System.out.println("Failed--");
    	}
    }
}
