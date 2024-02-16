package homework_22;

import java.util.Arrays;

public class AutoparkMain {
    public static void main(String[] args) {
        Engine engine = new Engine(150, "Diesel");
        Engine bikeEngine = new Engine(150, "Elektro");

        // Невозможно создать экземпляр абстрактного класса
        //Vehicle vehicle = new Vehicle();

        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(engine);
        vehicles[1] = new Bicycle();
        vehicles[2] = new Motorcycle(bikeEngine);

        // for i -
//        for (int i = 0; i < vehicles.length; i++) {
//            Vehicle vehicle = vehicles[i];
//            System.out.println(vehicle);
//            vehicle.startEngine();
//        }

        // Перебирает все элементы в массиве.
        // На каждой итерации (шаге) - мы можем обращаться к текущему элементу массива,
        // используя переменную vehicle
        // for each
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
            vehicle.startEngine();
            System.out.println();
        }

        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 98, 1000};

        for (int value : ints) {
            System.out.println(value);
        }

        // я хочу заменить в массиве все значения, меньше 50 на число 100

        for (int val: ints) {
            if (val < 50) {
                val = 100;
                System.out.println("val изменен: " + val );
            }
        }

        System.out.println(Arrays.toString(ints));

        for (int i = 0; i < ints.length; i++) {
            int val = ints[i];
            if (val < 50) {
                val = 100;
            }
        }

        System.out.println(Arrays.toString(ints));

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
            vehicle.setEngine(null);
            System.out.println(vehicle);
            System.out.println();
        }

    }
}
