package homework_22;

public class Person {
    private int speed;
    private int rest;
    private int restCounter;

    public Person(int speed, int rest) {
        this.speed = speed;
        this.rest = rest;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getRest() {
        return rest;
    }

    public void setRest(int rest) {
        this.rest = rest;
    }

    public void rest() {
        System.out.println("I need " + getRest() + " minutes rest");
    }

    public void run() {
        System.out.println("I'm running at the speed of " + getSpeed());
        rest();
    }
}
