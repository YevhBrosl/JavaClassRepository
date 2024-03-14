package homework_41;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
//Task1
//Из списка целых чисел выделите те значения, которые больше 10;
//отсортируйте эти значения по значению последней цифры в числе и выведите результат на экране

//Task 2
//Имеется список строк. Используя Stream API, найдите строку с максимальной длиной.

//Task 3
//
//Имеется список целых чисел.
//
//Необходимо отфильтровать этот список, оставив только чётные числа,
//затем каждое число умножить на 2, и собрать результат в новый список
public class Task1 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task3() {
        List<Integer> integers = List.of(-1, 12, 0, 4, 1, -15, 24, 30, -45, 53, 9, 76, 31, 11, -123, 78, 165);

        List<Integer> result = integers.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * 2)
                .collect(Collectors.toList());

        System.out.println(result);
//        integers.stream()
//                .filter(i -> i % 2 == 0)
//                .forEach(i -> System.out.print(i * 2 + ", "));
    }

    private static void task2() {
        List<String> strings = List.of("Apple", "Orange", "Avocado", "Pineapple", "Banana", "Apricot", "Cherry", "Watermelon", "Plum");
        Optional<String> longestString = strings.stream()
                .max((str1, str2) -> str1.length() - str2.length());
        if (longestString.isPresent()) {
            System.out.println(longestString.get());
        } else {
            System.out.println("longestString not found");
        }
    }

    private static void task1() {
        List<Integer> integers = List.of(-1, 12, 0, 4, 1, -15, 24, 30, -45, 53, 9, 76, 31, 11, -123, 78, 165);

        List<Integer> result = integers.stream()
                .filter(i -> i > 10)
                .sorted(Comparator.comparingInt(i -> i % 10))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
