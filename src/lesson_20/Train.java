package lesson_20;

public class Train extends Vehicle {// обязательно должна быть связь IS-A
    private int wagonCounter;

    public Train(String model, int yearManufactured, int wagonCounter) {
        super(model, yearManufactured);
        this.wagonCounter = wagonCounter;
    }

    public int getWagonCounter() {
        return wagonCounter;
    }

    public void setWagonCounter(int wagonCounter) {
        this.wagonCounter = wagonCounter;
    }

}
