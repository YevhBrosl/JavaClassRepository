package homework_14;

//Task 5
//
//Реализуйте метод sumOfArray (сумма элементов массива),
//который получает на вход массив и определяет сумму его элементов.

public class Task5 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int i = sumOfArray(array);
        System.out.println(i);

    }
    public static int sumOfArray(int[] inputArray){
        int sum  = 0;
        for (int i = 0; i < inputArray.length; i++) {
            int digit = inputArray[i];
            sum += digit;
        } return sum;
    }

}
