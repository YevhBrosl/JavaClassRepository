package homework_21;

public class Memory extends Component {

    private int size;
    private int speed;

    public Memory(String brand, String model, int size, int speed) {
        super(brand, model);
        this.size = size;
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public int getSpeed() {
        return speed;
    }
}
