package classes;

public class TestCarhasa {

	public static void main(String[] args) {
		BMWCar bm=new BMWCar();
		System.out.println(bm.getNoOfWheels());
        bm.bmwCarStart();
        System.out.println("-------------------------");
        SwiftCar sf=new SwiftCar();
        System.out.println(sf.getNoOfWheels());
        sf.swiftCarStart();
	}

}
