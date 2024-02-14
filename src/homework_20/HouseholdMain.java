package homework_20;

public class HouseholdMain {

    public static void main(String[] args) {

        HouseholdDevice householdDevice = new HouseholdDevice("Mop", 10, "white");
        System.out.println(householdDevice.toString());
        householdDevice.on();
        householdDevice.off();

        System.out.println("\n========================\n");

        VacuumCleaner vacuumCleaner = new VacuumCleaner("Philips", 75, "red", 800);
        System.out.println(vacuumCleaner.toString());
        vacuumCleaner.on();
        vacuumCleaner.off();
        vacuumCleaner.vacuum(false);

        System.out.println("\n========================\n");


        WashingMachine washingMachine = new WashingMachine("LG", 150, "white", 5);
        System.out.println(washingMachine.toString());
        washingMachine.on();
        washingMachine.off();

        Detergent washingLiquid = new Detergent("color");
        Laundry laundryItem = new Laundry("jeans", "cotton", "blue");

        washingMachine.setWashMode("cotton 30");
        washingMachine.setSpin(800);

        washingMachine.wash(laundryItem, 3);
    }



}
