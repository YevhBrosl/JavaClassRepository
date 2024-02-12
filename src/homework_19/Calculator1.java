package homework_19;

public class Calculator1 {
    private double result; // поле для хранения результата вычислений

    public Calculator1() {
        result = 0; // инициализация поля по умолчанию
    }

    public void add(double x) {
        result += x;
    }

    public void subtract(double x) {
        result -= x;
    }

    public void multiply(double x) {
        result *= x;
    }

    public void divide(double x) {
        if (x != 0) {
            result /= x;
        }
    }

    public double getResult() {
        return result;
    }

    public static void main(String[] args) {
        // Создаем экземпляр класса калькулятор
        Calculator1 calc = new Calculator1();

        // Выполняем операции над его полями (результатом)
        calc.add(5);
        calc.subtract(3);
        calc.multiply(4);
        calc.divide(2);

        // Выводим результат
        System.out.println("Результат: " + calc.getResult()); // Результат: 8.0
    }
}
