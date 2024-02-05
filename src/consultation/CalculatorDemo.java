package consultation;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        myCalc.sum();

        int x = 55;
        int y = 77;

        myCalc.sumWithParameters(x, y);

        int resultFromMethod = myCalc.sumWithParametersReturnResult(100, 400);
        System.out.println(resultFromMethod);
    }

}
