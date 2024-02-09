package lesson_18;

public class Auto {

    private static int countAuto;
    private String model;
    private int powerPS;

    public Auto(String model, int powerPS) {
        this.model = model;
        this.powerPS = powerPS;
        countAuto++;
    }

    public void info() {
        System.out.println("Auto: " + model + " | power: " + powerPS + " | count: " + countAuto);
    }

    public static int getCountAuto() {
        return countAuto;
    }

    public static void main(String[] args) {

        Auto auto = new Auto("BMW", 200);
        auto.info();

        Auto auto1 = new Auto("VW", 300);
        auto1.info();

        Auto auto2 = new Auto("Ford", 75);
        auto2.info();

        auto1.model = "Stels";
        auto1.info();

        System.out.println("Создано всего атвомобилей: " + Auto.countAuto);

    }


}
