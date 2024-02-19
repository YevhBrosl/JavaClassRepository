package lesson_24.printers.transport;

public class Duck implements Flyable, Floatable {

    private String color;

    public Duck(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void swim() {
        System.out.println(color + " уточка плывет по озеру");
    }

    @Override
    public void fly() {
        System.out.println(color + " уточка летит на юг");
    }
}
