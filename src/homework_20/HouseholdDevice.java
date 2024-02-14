package homework_20;

public class HouseholdDevice {
    private String model;
    private int price;
    private String color;

    public HouseholdDevice(String model, int price, String color) {
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }


    public String toString() {
        return "Household device " + model + " color: " + color + ", price: " + price;
    }

    public void on() {
        System.out.println("Household device " + model + " is on.");
    }

    public void off() {
        System.out.println("Household device " + model + " is off.");
    }


}
