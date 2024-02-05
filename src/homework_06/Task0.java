package homework_06;

import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1, 2 или 3:");
        int digit = scanner.nextInt();

        if (digit == 1) {
            System.out.println("Вы ввели число один");
        } else if (digit == 2) {
            System.out.println("Вы ввели число два");
        } else if (digit == 3) {
            System.out.println("Вы ввели число три");
        } else {
            System.out.println("Вы ввели какое-то другое число");
        }


    }
}
