package StringAndArray;

public class Shipping {
    private int id;
    private String shipperName;
    private String modeOfTransportation;
    private Float totalWeight;
    private String arrivalPort;
    private String departurePort;
    private static int nextShipmentId = 1000;

    public Shipping(int id, String shipperName, String modeOfTransportation, Float totalWeight, String arrivalPort, String departurePort) {
        this.id = id;
        this.shipperName = shipperName;
        this.modeOfTransportation = modeOfTransportation;
        this.totalWeight = totalWeight;
        this.arrivalPort = arrivalPort;
        this.departurePort = departurePort;
    }

    public static Shipping createNewShipment(String shipperName, String modeOfTransportation, Float totalWeight, String arrivalPort, String departurePort) {
        Shipping shipment = new Shipping(nextShipmentId, shipperName, modeOfTransportation, totalWeight, arrivalPort, departurePort);
        nextShipmentId++;
        return shipment;
    }

    public void displayDetails() {
        System.out.println("Shipment ID: " + id);
        System.out.println("Shipper Name: " + shipperName);
        System.out.println("Mode of Transportation: " + modeOfTransportation);
        System.out.println("Total Weight: " + totalWeight);
        System.out.println("Arrival Port: " + arrivalPort);
        System.out.println("Departure Port: " + departurePort);
    }
    public static void main(String[] args) {
        Shipping s=new Shipping(1,"Kedhar","Train",10f,"Chennai","Vijayawada");
        s.displayDetails();
    }
}
