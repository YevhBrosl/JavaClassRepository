package lesson_20;

public class SpecialBus extends Bus {

    private int bicyclePlaces;

    private int bicyclesCount;// по дефолту инициализируются 0

    public SpecialBus(String model, int yearManufactured, int capacity, int bicyclePlaces) {
        super(model, yearManufactured, capacity);
        this.bicyclePlaces = bicyclePlaces;
    }

    public boolean takePassengerWithBicycle() {
        //Есть ли место для
        //1. пассажира
        //2. велосипеда
        // если есть место для обоих - посадить пассажира
        // если для кого-то нет места - никого не садим в автобус

        if (bicyclePlaces > bicyclesCount && takePassenger()) {
            bicyclesCount++;
            System.out.println("Пассажир с велосипедом зашел в автобус." + getModel());
            return true;
        }
        System.out.println("В автобусе нет места для велосипеда. Пассажир с велосипедом не смог зайти" + getModel());
        return false;
    }


    public int getBicyclePlaces() {
        return bicyclePlaces;
    }

    public int getBicyclesCount() {
        return bicyclesCount;
    }

    public int example() {
        return super.getCapacity();
    }


}
