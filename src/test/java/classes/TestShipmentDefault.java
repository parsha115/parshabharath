package classes;

public class TestShipmentDefault {

	public static void main(String[] args) {
		ShipmentDefault sd=new ShipmentDefault();
		System.out.println(sd.destLoc);
		System.out.println(sd.originLoc);
		System.out.println(sd.getShipmentWeight());
		System.out.println(sd.getPackageName());
		System.out.println("---------------------------");
		String sname=sd.destLoc;
        System.out.println(sname);
        String oname=sd.originLoc;
        System.out.println(oname);
	    int shipwt=sd.getShipmentWeight();
	    System.out.println(shipwt);
	    String packname=sd.getPackageName();
	    System.out.println(packname);
	    System.out.println("------------------");
	    System.out.println(ShipmentDefault.getPackageName());
	}

}
