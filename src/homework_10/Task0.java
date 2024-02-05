package homework_10;
//Написать метод, принимающий массив целых чисел и
//распечатывающий массив в обратной последовательности.
//
//        {1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]

public class Task0 {
    public static void main(String[] args) {

        int[] array = {1, 4, 3, 6, 7};
        printReverseArray(array);

    } // Methods Area

    public static void printReverseArray(int[] ints) {
        System.out.print("[");
        for (int i = ints.length - 1; i >= 0; i--) {
            System.out.print(ints[i] + ((i > 0) ? ", " : "]\n"));
        }
    }






// Перегрузка метода для печати части массива до заданного индекса в обычном порядке,
// а начиная с этого индекса в обратном порядке
public static void printReversePart(int[] array, int index) {
    for (int i = 0; i < index; i++) {
        System.out.print(array[i] + " ");
    }
    for (int i = array.length - 1; i >= index; i--) {
        System.out.print(array[i] + " ");
    }
    System.out.println();
}

// Еще одна перегрузка метода с использованием булевого флага
//public static void printArray(int[] array, boolean reverse) {
//    if (reverse) {
//        printReverse(array);
//    } else {
//        for (int value : array) {
//            System.out.print(value + " ");
//        }
//        System.out.println();
//    }
//}

//public static void main(String[] args) {
//    int[] numbers = {1, 2, 3, 4, 5};
//
//    // Вызов первого метода
//    printReverse(numbers);
//
//    // Вызов второго метода
//    printReversePart(numbers, 2);
//
//    // Вызов третьего метода
//    printArray(numbers, false);
//}




}
