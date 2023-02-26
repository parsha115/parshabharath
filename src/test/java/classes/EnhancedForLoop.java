package classes;

public class EnhancedForLoop {
   public void retrivePrimitiveElementArr(int[] empIdArr)
   {
	   for(int empid:empIdArr)
	   {
		   System.out.println(empid);
	   }
   }
   
   public void retriveReferenceElementArr(String[] stNameArr)
   {
	   for(String sname:stNameArr)
	   {
		   System.out.println(sname);
	   }
   }
}
