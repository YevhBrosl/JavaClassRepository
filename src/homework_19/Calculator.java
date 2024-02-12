package homework_19;

public class Calculator {
//    private static double x;
//    private static double y;


    public static double addition(double x, double y) {
        return x + y;
    }

    public static double subtraction(double x, double y) {
        return x - y;
    }

    public static double multiplication(double x, double y) {
       return x * y;
    }

    public static double division(double x, double y) {
        return x / y;
    }

    public static void main(String[] args) {

        System.out.println(Calculator.addition(2.5, 3.3));
        System.out.println(Calculator.subtraction(23, 15));
        System.out.println(Calculator.multiplication(5, 7));
        System.out.println(Calculator.division(10, 0));

    }
}
