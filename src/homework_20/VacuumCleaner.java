package homework_20;

public class VacuumCleaner extends HouseholdDevice {

    private ExtraBrush brush;

    private int power;
    private boolean fullTank;

    public VacuumCleaner(String model, int price, String color, int power) {
        super(model, price, color);
        brush = new ExtraBrush("small brush");
        this.power = power;
    }

    public boolean vacuum(boolean fullTank) {
        if (fullTank) {
            System.out.println("Warning! Tank needs emptying!");
            return false;
        } else {
            System.out.println("Vacuuming successfully completed!");
            return true;
        }
    }

    public ExtraBrush getBrush() {
        return brush;
    }

    public int getPower() {
        return power;
    }






}
