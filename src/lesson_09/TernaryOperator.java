package lesson_09;

public class TernaryOperator {
    public static void main(String[] args) {
        int number = -15;
        String result;

        if (number >= 0) {
            result = "Положительное";
        } else {
            result = "Отрицательное";
        }

        result = (number >= 0)? "Положительное" : "Отрицательное";// ternary operator
        System.out.println("Число: " + result);
    }
}
