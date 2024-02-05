package homework_14;

//Task 3
//
//Написать метод по поиску строки в массиве строк.
//На вход метод принимает массив строк, и строку для поиска.

public class Task3 {
    public static void main(String[] args) {
        String[] strings = {null, "London", "Rome", null, "Paris", "Washington", "Berlin", "Brussels"};
        System.out.println(findString(strings, "paris"));

    }

    public static String findString(String[] inputArray, String searchString) {
        if (inputArray == null) return null;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == null) return null;

            if (inputArray[i].equalsIgnoreCase(searchString)) return inputArray[i];
        }
        System.out.print("Элемент отсутствует: ");
        return null;
    }
}
