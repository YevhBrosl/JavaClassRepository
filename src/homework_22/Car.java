package homework_22;

public class Car extends Vehicle{

    // Убираю пустой конструктор. Нельзя машину без двигателя
//    public Car() {
//        super();
//    }

    public Car (Engine engine) {
        super();
        this.setEngine(engine);
    }

    @Override
    public  String toString() {
        //Todo если двигателя нет - поменять вывод
        return "Car {id: " + getId() + "; engine: " + getEngine() + "}";
    }

    @Override
    public void startEngine() {
        if (getEngine() != null) {
            getEngine().start();
        }
    }
}
