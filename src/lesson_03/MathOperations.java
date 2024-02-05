package lesson_03;

public class MathOperations {
    public static void main(String[] args) {
        int var1 = 20;
        int var2 = 7;

        int result;
        result = var1 + var2;
        System.out.println("result " + result);
        result = 15 + 6;
        System.out.println("result " + result);
//        int result = var1 + var2;

        result = var1 - var2;
        System.out.println("result " + result);

        result = var1 * var2;
        System.out.println("MultResult: " + result);

        result = var1 / var2;
        System.out.println("devResult: " + result);

        result = var1 % var2;
        System.out.println("restResult: " + result);

        System.out.println(4 / 2);
        System.out.println(4 % 2);

        System.out.println("Сложение: " + (4 + 2));
        System.out.println("Целочисленное деление 4 / 2 = " + (4 / 2));
        System.out.println("Остаток от деления 4 % 2 = " + (4 % 2));

        System.out.println((4 / 2));
        System.out.println((4 % 2));

        System.out.println("====================\n");

        double doubleVar = 20.0d;
        double doubleSeven = 7.0;

        double doubleResult = doubleVar / doubleSeven;
        System.out.println("doubleResult dev = " + doubleResult);

        int a = 20;
        int b = 7;
        int intResult = a / b;
        System.out.println("Результат деления " + a + "на " + b + "равен = " + intResult);
        System.out.printf("Результат деления %d на %d \n равен = %d\n", a, b, intResult);
       // System.out.println();
        System.out.println("что-нибудь");

        System.out.printf("Округленный вывод результата деления %.2f\n", doubleResult);







    }
}
