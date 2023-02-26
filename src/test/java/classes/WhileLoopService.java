package classes;

public class WhileLoopService {
  public int findTotalSumOf1to10Num() {
	  int x=1;
	  int sum=0;
	  while(x<=10) {
		  sum =sum+x;
		  ++x;
	  }
	  return sum;
  }
}
