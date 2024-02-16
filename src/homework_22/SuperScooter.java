package homework_22;

public class SuperScooter extends Scooter {
    @Override
    public void startEngine() {
        System.out.println("Start");
    }

    @Override
    public void hello(String string) {
        super.hello();
        System.out.println(string);
    }
}
