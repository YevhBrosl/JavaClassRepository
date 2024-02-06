package homework_12;

//Task 2
//
//Написать метод, принимающий на вход массив целых чисел.
//Метод должен вернуть массив, состоящий только из простых чисел,
//присутствующих в изначальном массиве
//
//вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}

import static homework_11.Task1.isNumberPrime;

public class Task2 {
    public static void main(String[] args) {

        int[] testArray = {0, 13, -25, 11, 31, 55, 98, 17, 5};
        int[] primeArray = onlyPrimeArray(testArray);

//        printArray(primeValues);
//
//        primeValues = arrayOnlyPrimeValuesV2(ints);
//        printArray(primeValues);


        System.out.print("[");
        for (int i = 0; i < primeArray.length; i++) {
            System.out.print(primeArray[i] + ((i < primeArray.length - 1) ? ", " : "]\n"));

    }


    }

    public static int[] onlyPrimeArray(int[] ints) {

        if (ints == null) return new int[0];

        // Чтобы объявить массив, нам надо указать его размер.
        // Но мы не знаем сколько у нас будет простых чисел. Создать массив - проблематично.

        // 1. Перебрать все значения в массиве и посчитать кол-во простых -> мы сможем создать массив для хранения простых чисел
        // 2. Перебрать опять весь массив и записать простые числа в результирующий массив

        int countPrimes = 0;

        for (int i = 0; i < ints.length; i++) {
            if (isNumberPrime(ints[i])) {
                countPrimes++;
            }
        }
        // Посчитали числа - можем создать массив
        int newArray[] = new int[countPrimes];

        // заполнить наш резалт массив
        for (int i = 0, j = 0; i < ints.length; i++) {
            if (isNumberPrime(ints[i])) {
                newArray[j] = ints[i];
                j++;
            }
        }
        return newArray;
    }

    public static int[] arrayOnlyPrimeValuesV2 (int[] ints) {
        if (ints == null) return new int[0];


        // Чтобы объявить массив, нам надо указать его размер.
        // Но мы не знаем сколько у нас будет простых чисел. Создать массив - проблематично.


        int[] temp = new int[ints.length];

        int counter = 0;
        for (int i = 0; i < ints.length; i++) {
            if (isPrime(ints[i])) {
                temp[counter] = ints[i];
                counter++;
            }
        }

        int[] result = new int[counter];

        // заполнить наш резалт массив
        for (int i = 0; i < counter; i++) {
            result[i] = temp[i];
        }

        return result;

    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2 || number == 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;

        for (int i = 5; i <= Math.sqrt(number); i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }


    public static void printArray(int[] ints) {
        System.out.print("[");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + ((i < ints.length - 1) ? "; " : "]\n"));

        }
    }
}


