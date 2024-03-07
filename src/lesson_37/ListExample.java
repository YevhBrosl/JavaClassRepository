package lesson_37;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        /*
        Конструкторы класса ArrayList
        ArrayList(); - создает пустой список (размер внутреннего массива равен 10)
        ArrayList(int capacity); - пустой список, но внутренний массив будет иметь размер capacity
        ArrayList(Collection<? extends T> collection); - создает список, содержащий элементы указанной коллекции,
        в том порядке, в каком они возвращаются итератором коллекции
         */

        // Метод of - статический метод, который представлен в нескольких интерфейсах JCF, начиная с JDK9
        // эти методы предназначены для создания неизменяемых коллекций
        // List, Set, Map

        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        System.out.println(integers);

        List<String> strings = new ArrayList<>(List.of("Str1", "Str2", "Str3", "Str4"));
        System.out.println(strings);

        strings.addAll(List.of("String", "Java", "Python"));
        System.out.println(strings);

        // add(E)
        // add(int index, E element)

        // get(int index) - взятие элемента по индексу
        System.out.println(strings.get(3));

        // int indexOf(Object obj)
        // int lastIndexOf(Object obj)

        System.out.println("strings.indexOf(Java) -> " + strings.indexOf("Java"));
        System.out.println("strings.lastIndexOf(Java) -> " + strings.lastIndexOf("Java"));

        // sort(Comparator<? super T> comparator)
        strings.sort(Comparator.comparing(String::length));
        System.out.println(strings);

        // List<T> subList(int from, int to) - возвращает вид на часть списка с индекса from до индекса (to -1)
        List<String> subList = strings.subList(1, 4);
        System.out.println(subList);


    }
}
