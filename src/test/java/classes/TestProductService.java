package classes;

public class TestProductService {

	public static void main(String[] args) {
		ProductService ps=new ProductService();
		String pname=ps.getProductName();
		System.out.println(pname);
	}

}
