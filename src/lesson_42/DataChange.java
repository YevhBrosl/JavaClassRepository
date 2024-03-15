package lesson_42;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DataChange {
    public static void main(String[] args) {

        //Промежуточные методы для изменения типов данных потока

        /*
        map(Function mapper) - преобразует элементы потока с использованием функции маппера

        flatMap(Function<T, R> mapper) - преобразует каждый элемент потока в поток других объектов и затем все эти потоки "склеивает" в один поток

        mapToObj(IntFunction mapper) - преобразует примитивный тип данных в ссылочный тип данных при помощи заданной функции

        .boxed() - используется для преобразования примитивных данных в соответствующий оберточный класс
        int -> Integer
        char -> Character
        double -> Double

        mapToInt - получаем поток примитивов
        mapToLong
        mapToDouble

         */

        task1();
        task2();

        task3();

        task4();
    }

    private static void task3() {
        //получить список всех символов из строк списка
        String[] strings = {"Abcd", "bbbbb", "string", "hello world"};

        // String.chars() -> IntStream - поток примитивов (int), содержащий целочисленные значения кода символа
        List<Character> characterList = Arrays.stream(strings)
                .flatMapToInt(str -> str.chars())
                .peek(e -> System.out.println("e: " + e))
                .mapToObj(i -> (char) i)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(characterList);
    }

    private static void task4() {
        String[] strings = {"Abcd", "bbbbb", "string", "hello world"};
        int[] lengths = Arrays.stream(strings)
                .map(String::length)
                .mapToInt(i -> i)
                .toArray();

        System.out.println(Arrays.toString(lengths));

    }

    private static void task2() {
        //примитивы в Stream API
        int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7};
        //преобразовать массив примитивов int в список Integer

        List<Integer> integerList = Arrays.stream(ints)
                //.mapToObj(i -> i)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("list: " + integerList);

        // получить из списка Integer массив примитивов

        int[] ints1 = integerList
                .stream()
                .mapToInt(i -> i)
                .toArray();

        System.out.println("array: " + Arrays.toString(ints1));


    }

    private static void task1() {
        //получить список всех продуктов во всех магазинах
        Shop shop = new Shop("shop1", List.of("Orange", "Banana", "Apple"));
        Shop shop1 = new Shop("shop2", List.of("Lime", "Cherry", "Pineapple"));
        Shop shop2 = new Shop("shop3", List.of("Grapes", "Lemon", "Apple"));

        Shop[] shops = {shop, shop1, shop2};

        List<String> products = Arrays.stream(shops)
                .flatMap(currentShop -> currentShop.getProducts().stream())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(products);
    }
}
