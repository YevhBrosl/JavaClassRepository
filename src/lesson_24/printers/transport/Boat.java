package lesson_24.printers.transport;

public class Boat extends Transport implements Floatable {

    public Boat(int capacity) {
        super(capacity);
    }

    @Override
    void takePassenger() {
        System.out.println("Корабль берет на борт пассажира");
    }

    @Override
    public void swim() {
        System.out.println("Корабль плывет по морю");
    }
}
