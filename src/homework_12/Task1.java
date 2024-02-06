package homework_12;

//Task 1
//
//Написать метод, принимающий на вход массив строк.
//Метод должен вернуть массив, состоящий из самой короткой
//и самой длинной строки изначального массива.



public class Task1 {
    public static void main(String[] args) {


        String[] testArray = {null, "London", "Rome", "Paris", "Washington", "Berlin", "Brussels"};
        System.out.println("===========Without null===========");
        String[] newArray = minAndMaxStringArray(testArray);
        printArray(newArray);

        System.out.println(" \n========= testArray = null =============");

        testArray = null;
        newArray = minAndMaxStringArray(testArray);
        printArray(newArray);

        System.out.println(" \n============ null in array ==============");

        testArray = new String[]{ "London", "Rome", "Paris", null, "Washington", "Berlin", "Brussels"};
        newArray = minAndMaxStringArray(testArray);
        printArray(newArray);

        System.out.println(" \n============ first null in array ==============");


        testArray = new String[]{null, null, null, null, null, null, null, "JS"};
        testArray = new String[]{null, "One", "Java", "Python", null, "butterfly", "JS"};
        newArray = minAndMaxStringArray(testArray);
        printArray(newArray);

        System.out.println(" \n============ ALL null in array ==============");
        testArray = new String[]{null, null, null, null, null, null, null};
        newArray = minAndMaxStringArray(testArray);
        printArray(newArray);

    }


    public static String[] minAndMaxStringArray(String[] inputArray) {
        //0. проверить на Null ссылку inputArray (существует ли объукт массива)
        //1. найти строку мин и макс длины
        //2. создать массив из 2ч строк. Записать туда найденный строки и вернуть

        // Проблема null
        /*
        1. Если у нас нет null. Ссылка на массив - ок, все элементы в массиве - не null
        Алгоритм будет корректно работать

        2. Если ссылка на массив = null -> Мы возвращаем новый массив, заполненный значениями по умолчанию (null) {null, null}

        3. Если в массиве присутствуют элементы со значением null - нам надо обработать эту ситуацию.
        Иначе, при попытке получить длину такого элемента мы получим NPE
        Решение - создаем отдельный метод. Перебираем наш массив - как только находим НЕ null значение - присваиваем его в мин и макс строку

        4. Отдельный случай, требующий внимания - null в 0 элементе массива.*/

        if (inputArray == null) {
            return new String[2]; // {null, null}
        }

        String min = findNotNullValue(inputArray);
        String max = min;

        for (int i = 0; i < inputArray.length; i++) {

            if (inputArray[i] != null && min != null && inputArray[i].length() < min.length()) {
                min = inputArray[i];
            }
            if (inputArray[i] != null && max != null && inputArray[i].length() > max.length()) {
                max = inputArray[i];
            }
        }
//        String[] newArray = new String [2];
//        newArray[0] = min;
//        newArray[1] = max;

        return new String[]{min, max};
    }

    private static String findNotNullValue(String[] strings) {

        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) {
                return strings[i];
            }
        }
        return null;
    }

    public static void printArray(String[] inputArray){
        System.out.print("[");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + ((i < inputArray.length - 1) ? ", " : "]\n"));
        }
    }
}
