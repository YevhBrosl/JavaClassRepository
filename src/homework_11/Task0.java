package homework_11;

//Task 0
//Написать метод, принимающий массив целых чисел и распечатывающий массив
//в обратной последовательности.
//
//        {1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
//
// Перегрузить метод, если в него приходит индекс, то часть массива
//слева до этого индекса распечатывается
//в обычном порядке, а начиная с этого индекса в обратном:
//
//        {1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
//
//Еще одна перегрузка: метод принимает массив и булевый флаг.
//Если флаг == true -> печатает массив в обратном порядке
//Если флаг == false -> печатает массив в прямом порядке
public class Task0 {
    public static void main(String[] args) {

        int[] digits = {1, 4, 3, 6, 7, 13, 25, 9, 17};
        printReverseArray(digits);

        printReverseArray(digits, 4);

        printReverseArray(digits, false);


    }//

    public static void printReverseArray(int[] digits) {
        System.out.print("[");
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.print(digits[i] + ((i > 0) ? "; " : "]\n"));
        }
    }

    public static void printReverseArray(int[] digits, int index) {
        System.out.print("[");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + "; ");
        }
        for (int i = digits.length - 1; i >= index; i--) {
            System.out.print(digits[i] + ((i > index) ? "; " : "]\n"));
        }
    }

    public static void printReverseArray(int[] digits, boolean flag) {
        System.out.print("[");
        if (flag) {
            for (int i = digits.length - 1; i >= 0; i--) {
                System.out.print(digits[i] + ((i > 0) ? "; " : "]\n"));
            }
        } else {
            for (int i = 0; i < digits.length; i++) {
                System.out.print(digits[i] + ((i < digits.length - 1) ? "; " : "]\n"));
            }
        }

    }
}

