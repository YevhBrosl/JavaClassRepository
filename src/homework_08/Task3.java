package homework_08;

//Task 3 Дан массив целых чисел. *Выберите произвольную длину.
//Заполните случайными значениями.
//
//Вывести на экран: минимальное значение, хранящееся в массиве
//максимальное
//среднее арифметическое всех значений в массиве

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(15) + 1;
        System.out.println("size: " + size);

        int[] digitsArray = new int[size];

        int i = 0;
        System.out.print("[ ");
        while (i < digitsArray.length) {
            digitsArray[i] = random.nextInt(101);
            System.out.print(digitsArray[i] + ((i < digitsArray.length - 1) ? "; " : ""));
            i++;
        }
       System.out.println(" ]");

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

       i = 0;
        int sum = 0;
        double average;
        while (i < digitsArray.length) {
            sum += digitsArray[i];
            i++;
            }
        average = (double) sum / digitsArray.length;
        System.out.println("Среднее арифметическое: " + average);
        }
    }

