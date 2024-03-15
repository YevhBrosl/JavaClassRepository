package lesson_42;

import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class ReduceExample {
    public static void main(String[] args) {
        // Терминальные аккумулирующие методы - выдают на выходе одно значение, полученное в результате каких-либоопераций со всеми элементами потока

        // Optional<T> reduce(BinaryOperator<T> accumulator) - выполняет свертку элементов в одно результирующее значение
        // T reduce(T identity, BinaryOperator<T> accumulator) - выполняет свертку элементов в одно результирующее значение

        // BinaryOperator<T> -> BiFunction<T, U, R> у которого все аргументы одного типа данных

        reduce1();
        reduce2();

    }

    private static void reduce2() {
        List<String> strings = List.of("Java",  "Python", "JS", "Hello");

        Optional<String> optionalString = strings.stream()
                .reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2);

        System.out.println(optionalString.get());
    }

    private static void reduce1() {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        Optional<Integer> reduce = integers.stream()
                .filter(i -> i % 2 == 0)
                .reduce((i1, i2) -> i1 + i2);

        System.out.println(reduce.orElse(null));

        Integer reduceWithIdentity = integers.stream()
                .filter(i -> i % 2 == 0)
                .reduce(100, (i1, i2) -> i1 + i2);

        System.out.println("reduceWithIdentity: " + reduceWithIdentity);

    }
}
