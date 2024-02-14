package lesson_20;

public class Bus extends Vehicle {

    private int capacity;
    private int countPassengers;// по умолчанию установлено в 0. Количество пассажиров в автобусе в настоящий момент

    private int totalPassengerCounter;// общее количество пассажиров, перевезенное одним автобусом

    public Bus(String model, int yearManufactured, int capacity) {
        // чтобы создать объект-родителя нужно вызвать конструктор родителя
        super(model, yearManufactured);// вызов конструктора родителя
        System.out.println("Constructor Bus start!");
        this.capacity = capacity;
    }
    public boolean takePassenger() {
        // проверить, есть ли место в автобусе
        if (countPassengers < capacity) {
            //свободное место есть. Добавляем пассажира
            countPassengers++;
            System.out.println("Пассажир зашел в автобус " + this.getModel());
            totalPassengerCounter++;
            return true;
        }
        System.out.println("Автобус полный! Пассажир не смог зайти");
        return false;
    }

    public void getOutPassenger() {
        //проверить, есть ли в автобусе пассажиры
        if (countPassengers > 0) {
            countPassengers--;
            System.out.println("Пассажир вышел из автобуса " + this.getModel());
        } else {
            System.out.println("Некому выходить. В автобусе больше нет пассажиров");
        }

    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        //TODO надо проверять, есть ли "лишние" пассажиры в автобусе
        this.capacity = capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public int getTotalPassengerCounter() {
        return totalPassengerCounter;
    }
}
