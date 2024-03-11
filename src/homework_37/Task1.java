package homework_37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Напишите метод, который принимает на вход две реализации интерфейса List.
//
//Метод должен возвращать список состоящий из элементов, которые присутствуют в обоих коллекциях.
public class Task1 {

    public static<T> List<T> intersection(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>();
        for (T element : list1) {
            if (list2.contains(element) && !result.contains(element)) {
                result.add(element);
            }
        } return result;
//        List<T> result = new ArrayList<>(list1);
//        result.retainAll(list2);
//        return result;
    }

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        List<Integer> result = intersection(list1, list2);
        System.out.println(result);
    }
}
