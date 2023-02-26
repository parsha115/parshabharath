package classes;

public class TestTradeProduct {

	public static void main(String[] args) {
		TradeProduct tp=new TradeProduct();
		System.out.println(tp.productId);
		System.out.println(tp.getProductName());
		System.out.println("----------------");
		int id=tp.productId;
		System.out.println(id);
		String pname=tp.getProductName();
		System.out.println(pname);
	}

}
