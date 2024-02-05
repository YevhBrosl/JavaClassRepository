package homework_10;

//Дано: Два отсортированных массива целых чисел.
// Вам нужно найти элемент, который будет находиться на k-й позиции
// в объединенном отсортированном массиве.
//
//Массив 1 - {100, 112, 256, 349, 770}
//Массив 2 - {72, 86, 113, 119, 265, 445, 892}
//k = 7
//
//Вывод : 256
//
//Можно такой вывод://
//72, 86, 100, 112, 113, 119, 256
//Искомое число: 256
//
//Объединенный отсортированный массив был бы такой (выводить, формировать его не обязательно) -
//
//[72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892]
//
//7-й элемент (по счету) этого массива хранит значение 256.

public class Task3 {
    public static void main(String[] args) {
        int[] array1 = {100, 112, 256, 349, 770};
        int[] array2 = {72, 86, 113, 119, 265, 445, 892};

        int i = 0;
        int j = 0;
        int searchValue = 0;
//        int count = 0;

//        while (i < array1.length && j < array2.length) {
//            if (array1[i] < array2[j]) {
//                searchValue = array1[i];
//                i++;
//            } else {
//                searchValue = array2[j];
//                j++;
//            }
//
//            count++;
//
//            if (count == 7) {
//                break;
//            }
//        }

        for (int count = 0; count < 7; count++) {
//            if (i < array1.length && j < array2.length) {
                if (array1[i] < array2[j]) {
                    searchValue = array1[i];
                    i++;
                } else {
                    searchValue = array2[j];
                    j++;
                }
//            }
        }

//        for (int i = 0; i < 7 ; i++) {
//            if (array1[i] < array[i]) {
//                minValue = array1[i];
//            } minValue = array[i];


            System.out.println(searchValue);


    }
}
