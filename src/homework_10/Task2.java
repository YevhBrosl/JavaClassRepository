package homework_10;

//Написать свой метод copyOfArray,
//дублирующий функционал метода Arrays.copyOf()
//
//на вход принимает массив целых чисел и число -
//длинну нового массива. Метод должен создать и распечатать
//массив заданной в параметрах длинны. В начало массива должны быть скопированы элементы из входящего массива:
//
//        {0, 1, 2, 3, 4 , 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
//
//Arrays.copyOf() использовать нельзя. Суть задачи - написать
//собственную реализацию этого метода

public class Task2 {
    public static void main(String[] args) {


        int[] digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        copyOfArray(digits, 15);

    }//

    public static void copyOfArray(int[] inputArray, int len) {
        int[] newArray = new int[len];

        System.out.print("[");
        for (int i = 0; i < newArray.length && i < inputArray.length; i++) {
            newArray[i] = inputArray[i];
            System.out.print(newArray[i] + ((i < newArray.length - 1) ? "; " : "]\n"));
        }



    }
//    public static void copyOfArray(int[] inputArray, int len) {
//        int[] newArray = new int[len];
//
//        System.out.print("[");
//        for (int i = 0; i < inputArray.length; i++) {
//            newArray[i] = inputArray[i];
//        }
//        for (int i = 0; i < len; i++) {
//            System.out.print(newArray[i] + ((i < len - 1) ? "; " : "]\n"));
//        }
//    }
}

