package homework_37;

//Создайте два списка. Один на реализации ArrayList, второй на LinkedList.
//
//Заполните их 5_000 одинаковыми случайными значениями от 0 до 1_000.
//
//Создайте 4 метода, принимающий реализацию интерфейса List.
//В первом методе - получение всех значений элементов списка по его индексу
//Второй метод - вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка)
//Третий метод - удалить 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции)
//Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)
//
//Все методы должны возвращать время, затраченное на выполнение метода в миллисекундах.
//
//Сравните для каждого из списка время выполнения каждого метода.
//
//И сравните время последовательного выполнения всех методов для каждой реализации List-а.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task2 {

    public static long getByIndex(List<Integer> list) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long addByIndex(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        Random random = new Random();

        for (int i = 0; i < 2000; i++) {
            int index = random.nextInt(list.size() - 1);
            int value = random.nextInt();
            list.add(index, value);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long removeByIndex(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int index = random.nextInt(list.size() -1);
            list.remove(index);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
    public static long removeByValue(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            int value = random.nextInt(10001);
            list.remove(Integer.valueOf(value));
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static void main(String[] args) {

        Random random = new Random();
        int size = 5000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            int value = random.nextInt(1001);
            arrayList.add(value);
            linkedList.add(value);
        }

        long duration = getByIndex(arrayList);
        System.out.println("arrayList: getByIndex -> " + duration);

        long duration1 = getByIndex(linkedList);
        System.out.println("linkedList: getByIndex -> " + duration1);

        long duration2 = addByIndex(arrayList);
        System.out.println("arrayList: addByIndex -> " + duration2);

        long duration3 = addByIndex(linkedList);
        System.out.println("linkedList: addByIndex -> " + duration3);

        long duration4 = removeByIndex(arrayList);
        System.out.println("arrayList: removeByIndex -> " + duration4);

        long duration5 = removeByIndex(linkedList);
        System.out.println("linkedList: removeByIndex -> " + duration5);

        long duration6 = removeByValue(arrayList);
        System.out.println("arrayList: removeByValue -> " + duration6);

        long duration7 = removeByValue(linkedList);
        System.out.println("linkedList: removeByValue -> " + duration7);

    }
}
