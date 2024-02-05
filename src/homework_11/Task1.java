package homework_11;

//Task 1
//Написать метод принимающий целое число и проверяющий является ли число простым.
//Если является, метод должен вернуть true, не является - false

public class Task1 {
    public static void main(String[] args) {

        boolean isPrime = isNumberPrime(381);
        System.out.println("Является ли число простым? -> " + isPrime);


    } //

    public static boolean isNumberPrime(int number) {

        if (number <= 1) return false;

        if (number == 2 || number == 3) return true;

        if (number % 2 == 0 || number % 3 == 0) return false;

        for (int i = 5; i <= Math.sqrt(number); i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }  return true;

    }
}

