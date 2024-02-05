package homework_06;

//Task 1
//
//Запишите в 4 переменные случайные числа от 0 до 100
//Выведите все 4 на экран
//Программа должна определить максимальное из этих четырех чисел
//Результат вывести на экран


import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int rand = random.nextInt(101);
        int rand1 = random.nextInt(101);
        int rand2 = random.nextInt(101);
        int rand3 = random.nextInt(101);
//        System.out.println(rand);
//        System.out.println(rand1);
//        System.out.println(rand2);
//        System.out.println(rand3);

//        int[] numbers = {rand, rand1, rand2, rand3};
//        int max = Arrays.stream(numbers).max().getAsInt();
//        System.out.println("Максимальное число: " + max);

//        if (rand > rand1 & rand > rand2 & rand > rand3) {
//            System.out.println("Максимальное число: " + rand);
//        } else if (rand1 > rand & rand1 > rand2 & rand1 > rand3) {
//            System.out.println("Максимальное число: " + rand1);
//        } else if (rand2 > rand & rand2 > rand1 & rand2 > rand3) {
//            System.out.println("Максимальное число: " + rand2);
//        } else {
//            System.out.println("Максимальное число: " + rand3);
//                    }
        System.out.println(rand + " - " + rand1 + " - " + rand2 + " - " + rand3);

        int max = rand;
        if (max < rand1) max = rand1;
        if (max < rand2) max = rand2;
        if (max < rand3) max = rand3;
        System.out.println("Max: " + max);


    }
}
