package classes;

public class SwitchCaseArthmeticOperatorService {
  public void performArthmetic(String operator, int firstNum, int secondNum) {
  switch(operator) {
  case "+":
	      int sum=firstNum+secondNum;
	      System.out.println(sum);
	      break;
  case "-":
      int sub=firstNum-secondNum;
      System.out.println(sub);
      break;
  case "*":
      int mult=firstNum*secondNum;
      System.out.println(mult);
      break;
  case "/":
      int div=firstNum/secondNum;
      System.out.println(div);
      break;
  case "%":
      int mod=firstNum%secondNum;
      System.out.println(mod);
      break;
  default:
    	  System.out.println("Invalid Arthmetic Operator");
  }
}
}