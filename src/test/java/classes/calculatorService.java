package classes;

public class calculatorService 
{
	//perform addition of two numbers 30=10+20
  public int add(int firstNum, int secondNum) {
	  int result=firstNum+secondNum;
	  return result;
	  // or
	  // return firstNum+secondNum;
  }
  public double calculatorSimpleIntrest(double principleAmount,int time,double rateofIntrest) {
	  double simpleIntrest=(principleAmount*time*rateofIntrest)/100;
	  return simpleIntrest;
  }
  
}
