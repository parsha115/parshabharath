package classes;

public class NestIfElseStringService {
	public String getStudentDistncation(int intotalmarks) {
		
		String result = null;
		
		if(intotalmarks > 360)
		{
			result = "First Class";
		} 
		else if(intotalmarks < 360 && intotalmarks > 240)
		{
			result = "Second Class";
		} 
		else if(intotalmarks < 240 && intotalmarks > 200)
		{
			result = "Third Class";
		}
		else
		{
			result = "Failed.....";
		}
         return result;
     }
}
