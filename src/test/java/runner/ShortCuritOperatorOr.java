package runner;

public class ShortCuritOperatorOr {

	public static void main(String[] args) {
       int x=10;
       int y=20;
       int z=30;
       if((++x>y) || (++y<z))
       {
    	   ++x;
       }
       else
       {
    	   ++y;
       }
       System.out.println(x+"---xy---"+y);
       
       int a=10;
       int b=20;
       int c=30;
       if((++a<b) || (++b<c))
       {
    	   ++a;
       }
       else
       {
    	   ++b;
       }
       System.out.println(a+"---ab---"+b);
	}

}
// 12--xy--21
// 12--ab--20