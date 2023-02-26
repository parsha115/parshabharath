package classes;

public class DiscountService {
    private int dicountCode=1001;
    
    private double getDiscountPercentage() {
    	return 10.5;
    }
    
    public static void main(String[] args) {
    	DiscountService ds=new DiscountService();
    	System.out.println(ds.dicountCode);
    	System.out.println(ds.getDiscountPercentage());
    	System.out.println("---------------------");
    	int dcode=ds.dicountCode;
    	System.out.println(dcode);
    	double percent=ds.getDiscountPercentage();
    	System.out.println(percent);
	}
}
