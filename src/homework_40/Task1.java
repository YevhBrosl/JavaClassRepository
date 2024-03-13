package homework_40;

//Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.
//Используйте несколько предикатов для фильтрации списка чисел, где числа должны быть четными, больше 10 и меньше 100

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task1 {

    public static List<Integer> getListByPredicate(List<Integer> integers) {
        List<Integer> result = new ArrayList<>();
        Predicate<Integer> isEven = i -> i % 2 == 0;
        Predicate<Integer> isBigger10 = i -> i > 10;
        Predicate<Integer> isSmaller100 = i -> i < 100;
        Predicate<Integer> combinedPredicate = isEven.and(isBigger10).and(isSmaller100);
        for (Integer i : integers) {
            if (combinedPredicate.test(i)) {
                result.add(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(-1, 3, 4, 128, 21, -28, 342, 17, 68, 54, -45, 11, 76, 45));
        List<Integer> res1 = getListByPredicate(list);
        System.out.println(res1);

    }
}
