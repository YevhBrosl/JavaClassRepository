package lesson_36;

import java.util.Arrays;
import java.util.Comparator;

public class ComparingExample {
    public static void main(String[] args) {

        Car[] cars = new Car[6];
        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2020, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[3] = new Car("Bentley", 2023, 300);
        cars[4] = new Car("Ferrari", 2021, 300);
        cars[5] = new Car("Alfa", 2019, 150);

        //статический метод comparing - возвращает новый comparator
        // :: - ссылка на методы. Позволяет ссылаться на метод без его выполнения
        Comparator<Car> carComparator = Comparator.comparing(Car::getMaxSpeed);
        Arrays.sort(cars, Comparator.comparing(Car::getMaxSpeed));

        //специализированная версия comparing для сравнения примитивов
        Arrays.sort(cars, Comparator.comparingInt(Car::getMaxSpeed));
        System.out.println(Arrays.toString(cars));

        System.out.println("\n==================================");

        //обратный порядок сортировки
        Arrays.sort(cars, Comparator.comparing(Car::getMaxSpeed).reversed());
        Arrays.sort(cars, Comparator.comparing(Car::getMaxSpeed, Comparator.reverseOrder()));
        //Arrays.sort(cars, Comparator.comparing(Car :: getMaxSpeed, Comparator.naturalOrder()));
        Arrays.sort(cars, Comparator.comparing(Car::getModel, Comparator.nullsFirst(String::compareTo)));
        System.out.println(Arrays.toString(cars));

        //сравнить по модели, если одинаковая - сравнить по году выпуска

        Comparator<Car> comparator = Comparator.comparing(Car::getModel).thenComparing(Car::getYear);
        Arrays.sort(cars, comparator);
        System.out.println(Arrays.toString(cars));

        System.out.println("\n==================================");

        Comparator<Car> comparator1 = Comparator
                .comparing(Car::getMaxSpeed, Comparator.reverseOrder())
                .thenComparing(Car::getYear);
        Arrays.sort(cars, comparator1);
        System.out.println(Arrays.toString(cars));

        System.out.println("\n==================================");

        Arrays.sort(cars, Comparator
                .comparing(Car::getYear)
                .thenComparing(Car::getMaxSpeed, Comparator.reverseOrder()));
        System.out.println(Arrays.toString(cars));


    }
}
