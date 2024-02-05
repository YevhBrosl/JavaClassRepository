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

        System.out.print("[");
        for (int i = 0; i < primeArray.length; i++) {
            System.out.print(primeArray[i] + ((i < primeArray.length - 1) ? ", " : "]\n"));

    }


    }

    public static int[] onlyPrimeArray(int[] ints) {

        int countPrimes = 0;

        for (int i = 0; i < ints.length; i++) {
            if (isNumberPrime(ints[i])) {
                countPrimes++;
            }
        }

        int newArray[] = new int[countPrimes];

        for (int i = 0, j = 0; i < ints.length; i++) {
            if (isNumberPrime(ints[i])) {
                newArray[j] = ints[i];
                j++;
            }
        }
        return newArray;
    }

}
