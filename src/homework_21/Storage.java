package homework_21;

public class Storage extends Component {

    private int capacity;


    public Storage(String brand, String model, int capacity) {
        super(brand, model);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }


}
