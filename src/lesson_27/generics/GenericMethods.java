package lesson_27.generics;

import util.MyList;

public class GenericMethods {

    //ограничиваем диапазон принимаемых типов данных
    //Ограничение сверху
    public static <T extends Number> int sum(T... elements) {
        int sum = 0;
        for (T value : elements) {
            sum += value.intValue();
        }
        return sum;
    }

    public static double printListSum(MyList<? extends Number> listNumber) {
        double sum = 0;
        for (int i = 0; i < listNumber.size(); i++) {
            sum += listNumber.get(i).doubleValue();
        }
        System.out.println("Сумма элементов: " + sum);
        return sum;
    }
}
