package lesson_36;

import java.util.Comparator;

//имплементация Comparator - позволяет сравнить два объекта
public class CarSpeedComparator implements Comparator <Car> {

    @Override
    public int compare(Car car1, Car car2) {
        return car1.getMaxSpeed() - car2.getMaxSpeed();
    }

    /*
    car1 < car2 -> отрицательное
    car1 > car2 -> положительное
    car1 = car2 -> 0
     */
}
