package homework_09;

//Заполните массив 50 случайными числами от 1 до 100.
//        Программа должна найти, и вывести на экран все простые числа.
//        Посчитайте сколько получилось таких чисел в массиве.
//        Простое число - число, которое делится на цело только на 1 и само себя.
//
//        Пример простых чисел: 3, 5, 7, 11, 13 и т.д.

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int arrayLength = 50;
        int[] digitsArray = new int[arrayLength];

        digitsArray[0] = random.nextInt(100) + 1;
        System.out.print("Исходный массив: " + digitsArray[0]);

        for (int i = 1; i < digitsArray.length; i++) {
            digitsArray[i] = random.nextInt(100) + 1;
            System.out.print(", " + digitsArray[i]);
        }

        System.out.println();
        int count = 0;


        for (int i = 0; i < digitsArray.length; i++) {
            int x = digitsArray[i];
            boolean isPrime = true;
            if (x == 1) {
                isPrime = false;
            } else {
                if (x == 2) {
                    isPrime = true;
                } else {
                    if (x % 2 == 0) {
                        isPrime = false;
                    } else {
                        for (int j = 3; j <= Math.sqrt(x); j += 2) {
                            if (x % j == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }
                }
            }
            if (isPrime) {
                System.out.println(x + " - простое число");
                count++;
            }

        }
        System.out.println("Количество простых чисел: " + count);
    }
}

//2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,