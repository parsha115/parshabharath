package runner;

import classes.Shipment;

public class TestShipmentDemo {

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
		int shipName=ss.getShipmentWeight();
		System.out.println(shipName);
		String packName=ss.getPackageName();
		System.out.println(packName);
		System.out.println("------------------");
		System.out.println(Shipment.getPackageName());
	}

}
