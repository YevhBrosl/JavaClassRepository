package consultation;

public class Calculator {
    public static void sum() {
        int x = 10;
        int y = 20;
        int result = x + y;
        System.out.println("Результат сложения: " + result);
    }

    public void sumWithParameters(int x, int y) {
        int result = x + y;
        System.out.println("Результат сложения: " + result);
    }

    public void divWithParameters(int x, int y) {
        double result = (double) x / y;
        System.out.println("Результат деления: " + result);
    }

    public int sumWithParametersReturnResult(int x, int y){
        int result = x + y;
        return result;
    }


}
