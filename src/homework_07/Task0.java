package homework_07;

//Перепишите решение задачи с использованием switch вместо if-else:
//
//Необходимо написать программу, где бы пользователю предлагалось
//ввести число на выбор: 1, 2 или 3, а программа должна сказать,
//какое число ввёл пользователь: 1, 2, или 3

import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1, 2 или 3: ");
        int input = scanner.nextInt();
        scanner.close();

        switch (input) {
            case 1:
            System.out.println("Вы ввели число один");
            break;
            case 2:
            System.out.println("Вы ввели число два");
            break;
            case 3:
            System.out.println("Вы ввели число три");
            break;
            default:
            System.out.println("Вы ввели какое-то другое число");

        }
    }
}
