package homework_08;

//Task 4 Дан массив целых чисел.
//Поменять местами элемент с максимальным и минимальным значением
//
//Пример:{ 5, 6, -25, 0, 31, -15 }  ->  { 5, 6, 31, 0, -25, -15}

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] digitsArray = new int[5];

        int i = 0;
        while (i < digitsArray.length) {
            digitsArray[i] = random.nextInt(101);
            System.out.print(digitsArray[i] + ", ");
            i++;
        }
        System.out.println();

        i = 0;
        int min = digitsArray[0];
        int max = digitsArray[0];

        while (i < digitsArray.length) {
            if (digitsArray[i] < min) {
                min = digitsArray[i];
            } else if (max < digitsArray[i]) {
                max = digitsArray[i];
            }
            i++;
        }
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);

        int indexOfMin = 0;
        int indexOfMax = 0;

        while (digitsArray[indexOfMin] != min) {
            indexOfMin++;
        }

        while (digitsArray[indexOfMax] != max) {
            indexOfMax++;
        }

        digitsArray[indexOfMin] = max;
        digitsArray[indexOfMax] = min;

        i = 0;
        while (i < digitsArray.length) {
            System.out.print(digitsArray[i] + " ");
            i++;
        }
    }


}
