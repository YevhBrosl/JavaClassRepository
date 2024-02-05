package homework_12;

//Task 1
//
//Написать метод, принимающий на вход массив строк.
//Метод должен вернуть массив, состоящий из самой короткой
//и самой длинной строки изначального массива.



public class Task1 {
    public static void main(String[] args) {


        String[] testArray = {null, "London", "Rome", "Paris", "Washington", "Berlin", "Brussels"};
        String[] newArray = minAndMaxStringArray(testArray);
        printArray(newArray);

        String[] strings = null;
        newArray = minAndMaxStringArray(strings);
        printArray(newArray);

        testArray = new String[]{ "London", "Rome", "Paris", null, "Washington", "Berlin", "Brussels"};
        newArray = minAndMaxStringArray(testArray);
        printArray(newArray);





    }


    public static String[] minAndMaxStringArray(String[] inputArray) {
        //0. проверить на Null ссылку inputArray (существует ли объукт массива)
        //1. найти строку мин и макс длины
        //2. создать массив из 2ч строк. Записать туда найденный строки и вернуть

        if (inputArray == null) {
            return new String[2]; // {null, null}
        }

        String min = inputArray[0];
        String max = inputArray[0];

        for (int i = 0; i < inputArray.length; i++) {

            if (inputArray[i] != null && min != null && inputArray[i].length() < min.length()) {
                min = inputArray[i];
            }
            if (inputArray[i] != null && max != null &&inputArray[i].length() > max.length()) {
                max = inputArray[i];
            }
        }
//        String[] newArray = new String [2];
//        newArray[0] = min;
//        newArray[1] = max;

        return new String[]{min, max};
    }

    public static void printArray(String[] inputArray){
        System.out.print("[");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + ((i < inputArray.length - 1) ? ", " : "]\n"));
        }
    }
}
