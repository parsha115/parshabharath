package runner;

public class Work4 
{
  public int x;
  public float y;
  public char z;
  public boolean w;
  public String s;
  public Work4(int a) //1st
  {
	  x=a;
	  z='Q';
	  s="kalam";
  }
  public Work4(String a) //2nd
  {
	  x=10;
	  z='Q';
	  s=a;
  }
  public Work4(int a,String b) //3rd
  {
	  x=a;
	  z='Q';
	  s=b;
  }
  public Work4(String a,int b) //4th
  {
	  x=b;
	  z='Q';
	  s=a;
  }
}
