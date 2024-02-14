package homework_19;

public class Calculator {


    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
       return x * y;
    }

    public static double divide(double x, double y) {
        return x / y;
    }

    public static void main(String[] args) {

        System.out.println(Calculator.add(2.5, 3.3));
        System.out.println(Calculator.subtract(23, 15));
        System.out.println(Calculator.multiply(-5, 0));
        System.out.println(Calculator.divide(10, 0));
    }
}
