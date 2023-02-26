package classes;

public class Shipment {
    public String originLoc="India";
    public String destLoc="USA";
    
    public int getShipmentWeight() {
    	return 100;
    }
    public static String getPackageName() {
    	return "Bag";
    }
}
