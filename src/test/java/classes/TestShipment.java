package classes;

public class TestShipment {

	public static void main(String[] args) {
		Shipment ss=new Shipment();
		System.out.println(ss.destLoc);
		System.out.println(ss.originLoc);
		System.out.println(ss.getShipmentWeight());
		System.out.println(ss.getPackageName());
		System.out.println("-----------------------");
		String sname=ss.destLoc;
		System.out.println(sname);
		String oname=ss.originLoc;
		System.out.println(oname);
		int shipWt=ss.getShipmentWeight();
		System.out.println(shipWt);
		String packName=ss.getPackageName();
		System.out.println(packName);
		System.out.println("------------------");
	    System.out.println(Shipment.getPackageName());
	}

}
