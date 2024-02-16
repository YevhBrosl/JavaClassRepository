package homework_22;

abstract public class Scooter extends Vehicle{


    @Override
    public void setEngine(Engine engine) {
        setEngine(new Engine(30, "Benz"));
    }

    @Override
    public String toString() {
        return "Scooter {}";
    }

    // Нельзя переопределить
    public final void hello() {
        System.out.println("Hello");
    }

    // перегруженный с таким же именем, но не помеченный final - можно
    public void hello(String s) {
        System.out.println("Hello, " + s);
    }
}

