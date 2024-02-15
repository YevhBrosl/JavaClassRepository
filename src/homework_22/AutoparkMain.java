package homework_22;

public class AutoparkMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        Vehicle vehicle1 = new Bicycle();
        Vehicle vehicle2 = new Motorcycle();

        vehicle.startEngine();
        vehicle1.startEngine();
        vehicle2.startEngine();


        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = vehicle;
        vehicles[1] = vehicle1;
        vehicles[2] = vehicle2;



    }
}
