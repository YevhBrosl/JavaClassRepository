package lesson_08;

import java.util.Random;

public class ArrayExample {
    public static void main(String[] args) {

        // объявление массива
        int[] array;
        int numbers[]; // альтернативный способо объявления массива (НЕ рекомендуется)

        // инициалиазия массива
        array = new int[5]; // массив как объект создается в памяти.
        // При инициализации обязательно указать размер массива в квадратных скобках
        // 5 - размер массива (количество ячеек)

        String[] strings = new String[7]; // объявление и инициализация массива в одной строке
        // мы создали переменную, которая будет хранить ссылку на массив строк (в Stack)
        // мы создали объект в памяти (в Heap)
        // каждую ячейку массива мы заполняем значениями "по умочанию"

        // Значения по умолчанию:
        // для всех числовых типов (в том числе char) это будет 0 (0.0)
        // для boolean - false
        // для всех ссылочных типов - значение null (null - ничего)

        // явная инициализация массива:
        int[] digits = new int[] {56, -98, 14, 1004, 1443};
        String[] strings1 = {"Str", "hello", "Java", "JS", "Orange"};

        int bum = 15;

        // доступ к ячейкам массива осуществляется по индексам

        int value = digits[0]; // в переменную value было записано значение ячейки с индексом (номером) 0;
        System.out.println("value: " + value);

        System.out.println("В ячейке под номером 2 в массиве strings1 хранится: " + strings1[2].toUpperCase());
        System.out.println("В ячейке под номером 3 в массиве digits хранится: " + (digits[3]));
        System.out.println("мы можем производить с полученным значением допустимые типом данных операции " + (digits[3] / 2 - 15));

        System.out.println(digits);

        // размер массива
        int arrayLength = digits.length;
        int i = 0;
        while (i < arrayLength) {
            System.out.print(digits[i] + ", ");
            i++;
        }
        System.out.println();

        // изменение значения в ячейке массива
        digits[2] = 5000;
        i = 0;
        while (i < digits.length) {
            System.out.print(digits[i] + ", ");
            i++;
        }
        System.out.println();

        System.out.println("array[2]: " + array[2]); // проверяем значения в ячейках массивов, заполненных значениями по умолчанию
        System.out.println("strings[5]: " + strings[5]);// попытка вызова у null каких-либо методов вызовет исключение (аварийное завершение программы)

        strings[5] = "Pascal"; // изменяем значение в ячейке с индексом 5
        System.out.println("strings[5]: " + strings[5]);

        Random random = new Random();

        int[] nums = new int[10];

        int k = 0;
        System.out.println("|");
        while (k < nums.length) {
            nums[k] = random.nextInt(101);
            System.out.print(nums[k] + ", ");
            k++;
        }
        System.out.println("|");

        k = 0;
        int min = nums[0];
        while (k < nums.length) {
            if (nums[k] < min) {
                min = nums[k];
            }
            k++;
        }
        System.out.println("min: " + min);






    }
}
