package homework_21;

public class Processor extends Component {

    private double clockspeed;
    private int numberOfCores;

    public Processor(String brand, String model, double clockspeed, int numberOfCores) {
        super(brand, model);
        this.clockspeed = clockspeed;
        this.numberOfCores = numberOfCores;
    }

    public double getClockspeed() {
        return clockspeed;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }
}
