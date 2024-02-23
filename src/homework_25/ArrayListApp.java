package homework_25;

import util.MyArrayList;
import util.MyList;

import java.util.Arrays;

public class ArrayListApp {
    public static void main(String[] args) {
        MyArrayList<Integer> integerList = new MyArrayList<>();

        MyList<String> stringList = new MyArrayList<>();

        MyList<Number> numberList = new MyArrayList<>();

        integerList.add(100);
        System.out.println(integerList);

        integerList.addAll(200, 300, 400, 500, 20, 30, 40, 99);
        System.out.println(integerList);
        System.out.println("size: " + integerList.size());

        Integer value = integerList.get(5);
        System.out.println(value);

        integerList.set(5, -500);
        System.out.println(integerList);

        System.out.println("integerList.indexOf(1000): " + integerList.indexOf(1000));
        System.out.println("integerList.indexOf(500): " + integerList.indexOf(500));

        integerList.add(500);
        System.out.println(integerList);
        System.out.println("integerList.lastIndexOf(500): " + integerList.lastIndexOf(500));

        System.out.println("\n=====================\n");

        stringList.addAll("Hello", "Java", "Python", "Some String", "Orange");
        System.out.println(stringList);

        System.out.println("stringList.contains(\"hello\"): " + stringList.contains("hello")); // false
        System.out.println("stringList.contains(\"Hello\"): " + stringList.contains("Hello")); // true

        integerList.addAll(1,2,3,4,5,6,7);
        System.out.println(integerList);

        Object [] array = integerList.toArray(); //не работает
        System.out.println(Arrays.toString(array));

        System.out.println(array.length);

        System.out.println("\n=====================\n");

        //удаление по значению
        System.out.println(integerList.remove(Integer.valueOf(30)));
        System.out.println(integerList);

        // удаление по индексу
        System.out.println(integerList.remove(1));
        System.out.println(integerList);

        System.out.println("numberList.isEmpty(): " + numberList.isEmpty());
        System.out.println("stringList.isEmpty(): " + stringList.isEmpty());

        numberList.addAll(15, 5.6, -100000, 0, 5.7, 5.7F);
        System.out.println(numberList);

        Object[] strings = stringList.toArray();
        System.out.println(strings);

//        Integer[] arrayInt = integerList.toArray(Integer.class);
//        System.out.println(Arrays.toString(arrayInt));


    }
}

