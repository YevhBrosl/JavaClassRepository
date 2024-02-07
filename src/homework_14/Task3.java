package homework_14;

//Task 3
//
//Написать метод по поиску строки в массиве строк.
//На вход метод принимает массив строк, и строку для поиска.

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String[] strings = {"Java", "Python", null, "Orange", "JS", "hello"};
        //System.out.println(findString(strings, "paris"));
        int idx = findString(strings, "Js");
        System.out.println("idx: " + idx);
        if (idx > 0) strings[idx] = "New Value";

        System.out.println(Arrays.toString(strings));

        System.out.println(strings[idx].contains("al"));
        System.out.println(strings[idx].indexOf("al"));

    }

    public static int findString(String[] inputArray, String searchString) {
        if (inputArray == null || searchString == null) return -1;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != null && inputArray[i].equals(searchString))
                return i; // строгое равенство с учетом регистров
            if (inputArray[i] != null && inputArray[i].equalsIgnoreCase(searchString))
                return i; // метод сравнения значений строк без учета регистра
        }
        return -1;
    }
}
