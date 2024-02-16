package homework_22;
// Класс, у которого есть хотя бы один абстрактный метод - обязан быть помечен как abstract
abstract public class Vehicle {

    private final long id;
    private static long idCounter;

    private Engine engine;

    public Vehicle() {
        this.id = idCounter++;
    }


    // абстрактный метод не имеет реализации. Предназначен для переопределения в классах-потомках
    abstract public void startEngine();

    public long getId() {
        return id;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
