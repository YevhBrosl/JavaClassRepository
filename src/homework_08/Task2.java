package homework_08;

//Программа просит пользователя ввести произвольное число
//Вывести сумму цифр этого числа 567432 -> 5+6+7+4+3+2 -> 27

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите произвольное число");
        String inputNumber = scanner.nextLine();
        int length = inputNumber.length();
        int sum = 0;
        int i = 0;

        do {
            char ch = inputNumber.charAt(i);
            int num = Character.getNumericValue(ch);
            sum += num;
            i++;
        } while (i < length);
            System.out.println("Сумма цифр числа: " + sum);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите произвольное число:");
//        int inputNumber = scanner.nextInt();

//        if (inputNumber < 0) {
//            inputNumber *= -1;
//        }
//        int sum = 0;
//        while (inputNumber > 0) {

//            sum += inputNumber % 10;
//            inputNumber /= 10;
//        }
//        System.out.println("Сумма цифр числа: " + sum);
//        scanner.close();

    }
}
