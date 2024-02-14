package homework_20;

public class WashingMachine extends HouseholdDevice {

    private Detergent detergent;
    private Laundry laundry;
    private int capacity;
    private String washMode;
    private int spin;
    private int laundryWeight;

    public WashingMachine(String model, int price, String color, int capacity) {
        super(model, price, color);
        this.capacity = capacity;
        this.detergent = detergent;
        this.laundry = laundry;
    }

    public boolean wash(Laundry laundry, int laundryWeight) {
        if (laundryWeight < capacity) {
            System.out.println("Washmode: " + getWashMode());;
            System.out.println("Spin: " + getSpin());
            System.out.println("Washing successfully completed!");
            return true;
        }
        System.out.println("Device capacity exceeded! Washing cannot start!");
        return false;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getWashMode() {
        return washMode;
    }

    public void setWashMode(String washMode) {
        this.washMode = washMode;
    }

    public int getSpin() {
        return spin;
    }

    public void setSpin(int spin) {
        this.spin = spin;
    }

}
