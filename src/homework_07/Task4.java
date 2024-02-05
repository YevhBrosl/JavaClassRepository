package homework_07;

//Task 4 Распечатать только 7 чисел от 1 до 100, которые делятся на 5 без остатка. Используем цикл while

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
//        Random random = new Random();
//        int counter = 0;
//
//        while (counter < 7) {
//            int rand = random.nextInt(100) + 1;
//
//            if (rand % 5 == 0) {
//                System.out.println(rand);
//                counter++;
//            }
//        }
//        System.out.println("Конец цикла while");

        int i = 1; // счетчик цикла принято называть i, j, k, etc

        int count = 0;

        while (i <= 100 && count < 7) {
            System.out.println("Текущее число: " + i);

            if (i % 5 == 0) {
                System.out.println("делится на 5 без остатка: " + i);
                count ++;
                i += 5;
            } else {
                i++;
            }
        }
    }
}
