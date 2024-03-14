package lesson_40;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        // Stream API

        // Stream

        // промежуточные методы
        /*
        filter(Predicate<T>) - отфильтровывает элементы, соответствующие данному предикату
        sorted() - сортирует элементы
        map(Function <T, R> mapper) - преобразует элементы потока с использованием функции маппера
        peek(Consumer<T> action) - выполняет действия для каждого элемента потока

        Терминальные методы
        R collect(Collector<T, A, R> collector) - преобразует поток в какую-то структуру данных (например, в Коллекцию)
        void forEach(Consumer<T> action) - выполняет заданное действия для каждого элемента потока
        min(Comparator<T> comparator) - возвращает минимальное значение
        max(Comparator<T> comparator) - возвращает максимальное значение
         */

        //task1();

        //task2();

        //task3();

        //task4();

        //task5();

        //task6();

        //task7();

        //task8();

        //taskOptional();

        //task9();

        //task10();

        //task11();

        task12();


    }// main

    private static void task12() {

        // проверка на null

        Cat[] arrayCats = {
                new Cat("Bear", 5, "braun"),
                new Cat("Python", 7, "white"),
                new Cat(null, 3, "grey"),
                new Cat("Panda", 4, "black"),
                null
        };

        //Получить список котов, вес которых больше 4

        List<Cat> catList = Arrays.stream(arrayCats)
                .filter(cat -> Objects.nonNull(cat)) //отфильтровать null из потока
                .filter(cat -> cat.getWeight() > 4)
                .collect(Collectors.toList());

        System.out.println(catList);

        // убрать котов с именем null

        List<Cat> notNullNameCats = Arrays.stream(arrayCats)
                .filter(Objects::nonNull)
                .filter(cat -> Objects.nonNull(cat.getName()))
                .collect(Collectors.toList());

        System.out.println(notNullNameCats);
    }

    private static void task11() {
        List<Integer> integers = List.of(5, 4, 12, 17, 3, 99, 10, -1, -2, -4);
        // Список всех положительных, четных чисел

        List<Integer> intList = integers
                .stream()
                .filter(i -> i > 0)
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(intList);
    }

    private static void task10() {
        //найти и вывести в консоль самое длинное имя кота из списка
        // 1. Преобразовать поток в поток имен
        // 2. Максимум (компаратор, который будет сравнивать имена)

        List<Cat> cats = getListCats();
        Optional<String> longestName = cats
                .stream()
                .map(Cat::getName)
                .max((name1, name2) -> name1.length() - name2.length());
        if (longestName.isPresent()) {
            System.out.println(longestName.get());
        } else {
            System.out.println("Котов с именами не найдено");
        }

    }

    private static void task9() {
        //распечатать min и max списка чисел
        List<Integer> integers = List.of(5, 4, 12, 17, 3, 99, 10, -1);

        Optional<Integer> optMax = integers.stream().max(Integer::compareTo);
        Optional<Integer> optMin = integers.stream().min(Integer::compareTo);

        if (optMax.isPresent()) {
            System.out.println("max: " + optMax.get());
        } else {
            System.out.println("Max not found");
        }
        System.out.println("min: " + optMin.orElseGet(() -> getDefaultValue()));

        System.out.println("Null Optional");

        List<Integer> integerList = new ArrayList<>();
        Optional<Integer> optMax1 = integers.stream().max(Integer::compareTo);
        Optional<Integer> optMin1 = integers.stream().min(Integer::compareTo);

        if (optMax.isPresent()) {
            System.out.println("max: " + optMax1.get());
        } else {
            System.out.println("Max not found");
        }
        System.out.println("min: " + optMin1.orElseGet(() -> getDefaultValue()));

    }

    private static Integer getDefaultValue() {
        return null;
    }

    private static void taskOptional() {
        //найти минимальное значение в списе чисел
        List<Integer> integers = List.of(5, 4, 12, 17, 3, 99, 10, -1);

        Optional<Integer> minOptional = integers.stream().min(Integer::compareTo);

        minOptional = Optional.ofNullable(null);

        System.out.println("minOptional.isEmpty(): " + minOptional.isEmpty());
        System.out.println("minOptional.isPresent(): " + minOptional.isPresent());

        Integer min;
        if (minOptional.isPresent()) {
            min = minOptional.get();
        } else {
            //возвращает значение, если оно присутствует, иначе возвращает значение по умолчанию
            min = minOptional.orElse(-100);
        }

        System.out.println(min);

        /*

         */

        // создание Optional
        Optional.empty(); // возвращает пустой Optional
        Optional.of(100); // возвращает Optional со значением
        Optional.ofNullable(null); // возвращает Optional со значением или пустой

    }

    private static Integer getMax(List<Integer> integers) {
        if (integers == null || integers.isEmpty()) return null;

        Integer max = integers.get(0);
        for (Integer i : integers) {
            if (i > max) max = i;
        }
        return max;
    }

    private static void task8() {
        // изменить имя котов, если их вес меньше 5
        // распечатать элементы потока
        List<Cat> cats = getListCats();

        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() < 5) // фильтруем поток
                .peek(cat -> cat.setName("Slim " + cat.getName()));// промежуточный метод, который совершает какое-то действие с каждым элементом потока

        catStream.forEach(cat -> System.out.println(cat));// терминальный метод, который совершает какое-то действие с каждым элементом потока

        System.out.println("cats: " + cats);

    }

    private static void task7() {

        // Stream API и исключения
        // если в каком-либо промежуточном методе возникает исключительная ситуация,
        // то обработать ее (словить) мы можем только в терминальном методе этого потока,
        // а не в методе, который вызвал исключение
        Cat[] arrayCats = {
                new Cat("Bear", 5, "braun"),
                new Cat("Python", 7, "white"),
                new Cat(null, 3, "grey"),
                new Cat("Panda", 4, "black")
        };

        //создание потока из массива
        Stream<Cat> stream = Arrays.stream(arrayCats);

        stream = stream.filter(cat -> cat.getName().length() > 4);

        try {
            List<Cat> catList = stream.collect(Collectors.toList());
            System.out.println("Method try");
        } catch (NullPointerException exception) {
            exception.printStackTrace();
        }
        System.out.println("End method");

    }

    private static void task6() {
        //Получить список имен, которые короче 5 символов
        List<Cat> cats = getListCats();

        List<String> catNames = cats.stream()
                .map(Cat::getName)
                .filter(name -> name.length() < 5)
                .collect(Collectors.toList());

        System.out.println(catNames);
    }

    private static void task5() {
        // Получить список имен кошек, чей вес больше 4
        List<Cat> cats = getListCats();

        List<String> catNames = cats.stream()
                .filter(cat -> cat.getWeight() > 4)
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println(catNames);

    }

    private static void task4() {
        // получить список имен всех кошек
        List<Cat> cats = getListCats();

        Stream<String> stringStream = cats.stream()
                .map(cat -> cat.getName());

        List<String> catNames = cats.stream() // создаем поток
                .map(Cat::getName) // преобразуем Stream<Cat> -> Stream<String>
                .collect(Collectors.toList()); // собираем в список

        System.out.println(catNames);
    }

    private static void task3() {
        List<Cat> cats = getListCats();

        //фильтрация по длине имени
        // список котов с именем длиннее 4-х символов

        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getName().length() > 4);

        catStream = catStream.filter(cat -> cat.getWeight() < 4);

        // промежуточные методы выполняются только при вызове терминального метода
        // Lazy Evaluation

        List<Cat> catList = catStream.collect(Collectors.toList());
        System.out.println(catList);

        System.out.println("End task3 method");

    }

    private static void task2() {
        List<Cat> cats = getListCats();

        //списко кошек с весом больше 4 кг

        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);

        // терминальный метод "закрывает" поток, повторно использовать закрытый поток нельзя
        List<Cat> fatCats = catStream.collect(Collectors.toList());
        System.out.println(fatCats);
    }

    private static List<Cat> getListCats() {
        return List.of(
                new Cat("Bear", 5, "braun"),
                new Cat("Python", 7, "white"),
                new Cat("Tiger", 3, "grey"),
                new Cat("Panda", 4, "black")
        );
    }

    private void task1() {
        List<Integer> integers = List.of(-1, 12, 0, 4, 1, -15, 24, 0);
        // список положительных чисел
        // список отсортирован в порядке возрастания

//        List<Integer> result = new ArrayList<>();
//        for (Integer intq : integers) {
//            if (intq > 0) result.add(intq);
//        }
//        Collections.sort(result);
//        System.out.println(result);


        // у всех коллекций есть метод stream() - создающий поток на основе элементов коллекции

        List<Integer> resultStream = integers.stream()
                .filter(integer -> integer > 0) // фильтрация элементов
                .sorted() //сортировка в естественном порядке
                .collect(Collectors.toList()); //преобразует элементы потока в список (в коллекцию)

        System.out.println(resultStream);
    }

}
