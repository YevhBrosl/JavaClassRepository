package lesson_06;

import java.util.Locale;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // говорим что нам нужен сканер для чтения из консоли
        scanner.useLocale(Locale.US); // меняем локализацию сканера. Разделитель - "."
        scanner.useLocale(Locale.GERMANY); // меняем локализацию сканера. Разделитель - ","

        System.out.println("Введите ваше имя:"); // приглашение к вводу данных

        String name = scanner.nextLine(); // читает строку ввода включая пробелы до символа перевода каретки (до нажатой enter)

        System.out.println("Получили имя: " + name);

        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt();//считывает введенное число из консоли
        scanner.nextLine();

        System.out.println("Введите число с запятой");
        double dbl = scanner.nextDouble(); // число с плавающей точкой

        System.out.println("Получили имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Дабл: " + dbl);

    }
}
