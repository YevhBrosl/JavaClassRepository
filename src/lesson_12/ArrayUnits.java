package lesson_12;

public class ArrayUnits {
    public static void main(String[] args) {

        int[] ints = {11, 0, 77, 33, 24, 56, 83, 99, 105, 45, -8, -15};

        int minIndex = minIndexSearch(ints);
        System.out.println(minIndex + " | " + ints[minIndex]);

        printArr(ints);

        sortArray(ints);

        printArr(ints);

        System.out.println(linearSearch(ints, 100));
        System.out.println(binarySearch(ints, 100));

    }

//    Делим массив пополам
//    Если значение равно искомому - возвращаем индекс.
//    Если значение в середине массива больше, чем искомое, значит, если искомое и присутствует в массиве, то оно будет в левой части массива. Значения в правой части можно не проверять
//    Если наоборот, значение в середине больше, то искомое может быть только в правой части
//    Если оставшуюся часть массива еще можно разделить пополам - возвращаемся в шан номер 1. Делим пополам оставшуюся часть массива
//    Если оставшуюся часть уже невозможно разделить - возвращаем -1 - элемент не найден


    // найти элемент в массиве по значению
    // линейный поиск. Индекс элемента на выходе

    public static int linearSearch(int[] ints, int value) {
        // перебираем все элдементы, сравниваем с искомым значением
        // если найдено совпадение, возвращаем индекс

        //чтобы подтвердить, что число отсутствует в массиве,
        // нам надо совершить N операций. Сложность / скорость этого алгоритма будет o(n)

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == value) return i;
        }

        return -1;


    }

    public static int binarySearch(int[] array, int searchValue) {

        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;

        int counter = 0; // счетчик шагов


        //проверяем, можно ли разделить массив пополам

        while (startIndex <= endIndex) {
            counter++;

            //вычислить индекс середины
            // 0, 12 -> (12-0) / 2 -> 6 ||| 7...12 -> 7 + (12-7) / 2 -> 9

            middleIndex = startIndex + (endIndex - startIndex) / 2;

            // сравниваем на равенство значения "в середине" с искомым

            if (array[middleIndex] == searchValue) {
                System.out.println("Элемент найден. Шагов затрачено: " + counter);
                return middleIndex;
            }

            // надо понять, в какой части массива может быть искомое значение
            // отбросить ненужную половину массива
            // сместить индекс (указатель)

            if (array[middleIndex] > searchValue) {
                // отбрасываем правую часть
                endIndex = middleIndex - 1;
            } else {
                //отбрасывает левую часть
                startIndex = middleIndex + 1;
            }
        }
        System.out.println("Элемент отсутствует. Шагов затрачено: " + counter);
        return -1;
    }

    // Сортировка

    public static void sortArray(int[] array) {
        // мы запускаем цикл, ищем минимальный элемент, меняем местами с самым левым
        // уменьшаем зону поиска (смещаем вправо левую границу)

        for (int i = 0; i < array.length; i++) {

            // находим минимум в текущей части массива

            int minIndex = minIndexSearch(array, i);

            // мне нужно поменять местами значения самого левого и минимального элемента
            // есть индексы. Индекс самого левого элемента i

            int temp = array[i];
            array[i] = array[minIndex]; // одна операция - константная сложность о(1)
            array[minIndex] = temp;

        }
    }

    // ищем минимальное значение в части массива, начиная с индекса startIndex

    public static int minIndexSearch(int[] arr, int startIndex) {
        int min = arr[startIndex];
        int minIndex = startIndex;

        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    // метод поиска минимального значения в массиве
    // будем возвращать индекс минимлаьного элемента

    public static int minIndexSearch(int[] arr) {
        int min = arr[0];
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ((i < arr.length -1) ? ", " : "]\n"));
        }

    }
}
