package lesson_42;

import java.util.List;
import java.util.Optional;

public class TerminalMethods {
    public static void main(String[] args) {

        //Терминальные методы

        // методы, которые возвращают одно значение

        /*
        boolean allMatch(Predicate<T> predicate) - возвращает true, если ВСЕ элементы потока соответствуют предикату
        boolean anyMatch(Predicate<T> predicate) - возвращает true, если ХОТЯ БЫ ОДИН элемент потока соответствует предикату
        boolean noneMatch(Predicate<T> predicate) - возвращает true, если НИ ОДИН элемент потока НЕ соответствует предикату

        Optional<T> findFirst() - возвращает первый элемент потока
        Optional<T> findAny() - возвращает произвольный элемент потока (обычно в параллельных потоках)

        long count() - возвращает количество элементов потока
        min()
        max()
         */

        task();
    }

    private static void task() {
        List<Integer> integers = List.of(1, 4, 5, -5, 10, 22, 34, -23);

        //отсеять элементы в потоке, которые меньше 10, и проверить, что в потоке остались только четные числа

        // allMatch()
        boolean allMatch = integers.stream()
                .filter(i -> i >= 10)
                .peek(i -> System.out.println("i: " + i))
                .allMatch(i -> i % 2 == 0);

        System.out.println("allMatch: " + allMatch);

        boolean anyMatch = integers.stream()
                .filter(i -> i >= 10)
                .peek(i -> System.out.println("i: " + i))
                .anyMatch(i -> i % 2 != 0);

        System.out.println("anyMatch: " + anyMatch);

        boolean noneMatch = integers.stream()
                .filter(i -> i >= 10)
                .peek(i -> System.out.println("i: " + i))
                .noneMatch(i -> i % 2 != 0);

        System.out.println("noneMatch: " + noneMatch);

        // findFirst()
        Optional<Integer> number = integers.stream()
                .filter(i -> i > 20)
                .filter(i -> i % 2 == 0)
                .findFirst();

        System.out.println("findFirst(): " + number.orElse(null));

        Optional<Integer> number1 = integers.stream()
                .filter(i -> i > 20)
                .filter(i -> i % 2 == 0)
                .findAny();

        System.out.println("findAny(): " + number1.orElse(null));

        long size = integers.stream().filter(i -> i < 0).count();
        System.out.println("size: " + size);

    }
}
