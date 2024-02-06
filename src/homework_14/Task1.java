package homework_14;

//Task 1
//
//Написать метод swap, принимающий на вход массив целых чисел, и два индекса.
//Метод должен поменять местами значения, хранящихся в этих индексах
//
//{0, 1, 2, 3, 4, 5, 6} -> swap(arr, 1, 5} -> {0, 5, 2, 3, 4, 1, 6}
//
//Если индексы за пределами массива?
//
//Перегрузка метода для работы с массивами строк.


import static lesson_12.ArrayUnits.printArr;

public class Task1 {
    public static void main(String[] args) {

        int[] testArr = {0, 1, 2, 3, 4, 5, 6};
        printArr(testArr);
        swap(testArr, 1, 5);
        printArr(testArr);

//        test();


        String[] strings = {null, "London", "Rome", "Paris", null, "Washington", "Berlin", "Brussels"};
        swapString(strings, 1, 5);

    }

    public static void swap(int[] numbers, int index1, int index2) {
        if (numbers == null || index1 < 0 || index1 >= numbers.length ||
                index2 < 0 || index2 >= numbers.length) return;
            // оператор return мгновенно прекращает работу метода.
            // после его вызова в void методе - дальнейший код не выполняется

            int temp = numbers[index1];
            numbers[index1] = numbers[index2];
            numbers[index2] = temp;

    }

//            System.out.print("[");
//            for (int i = 0; i < numbers.length; i++) {
//                System.out.print(numbers[i] + ((i < numbers.length - 1) ? "; " : "]\n"));


//        public static void test() {
//            if (true) return;
//            System.out.println("Test");
//        }

        public static void printArr(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + ", ");
            }
            System.out.println();
        }



    public static void swapString(String[] strings, int index1, int index2) {
        if (index1 >= 0 && index2 < strings.length) {
            String temp = strings[index1];
            strings[index1] = strings[index2];
            strings[index2] = temp;
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }

    }


}
