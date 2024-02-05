package homework_11;

//Task 2
//
//Написать метод, принимающий массив целых чисел.
//Метод должен вернуть количество простых чисел в массиве.
//Для проверки на "простоту" числа рекомендуется использовать метод из Task 1

import static homework_11.Task1.isNumberPrime;

public class Task2 {
    public static void main(String[] args) {

        int[] testArray = {11, 55, 34, 65, 43, 3, 19, 13, 3456, 170};
        System.out.println("Количество простых чисел в массиве: " + countPrimeInArray(testArray));

    }//

    public static int countPrimeInArray(int[] numbers) {
        int countPrime = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (isNumberPrime(numbers[i])) {
                countPrime++;
            }
        }
        return countPrime;
    }
}
