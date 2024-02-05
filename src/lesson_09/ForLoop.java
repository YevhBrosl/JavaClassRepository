package lesson_09;

import java.util.Random;

public class ForLoop {
    public static void main(String[] args) {

//        for (<инициализация>; <блок проверок> ; <изменения счетчиков>) {
//            // тело цикла
//        }
        // распечатать числа от 0 до 10

        int k = 0;
        while (k < 10) {
            //тело цикла
            // что-то делать
            k++;
        }

        System.out.println("k -> " + k);

        for (int i = 0; i < 10; i++) {
            //тело цикла
            System.out.println(i);
        }
//        System.out.println(i);  область видимости i - только внутри тела и блока цикла i

        // 1. выполняется блок инициализации 1 раз в самом начале
        // 2. делается проверка / проверки в блоке условий
        // 3. если проверка дала true - выполняется тело цикла (если false - выход из цикла, тело НЕ выполняется)
        // 4. по окончании выполнения тела цикла переходим в блок изменений
        // 5. проверка условий. Если true - выполняем тело. И так по круга, пока не выдаст false

        // ни один из блоков не является обязательным

//        for ( ;; ) { //бесконечный цикл
//            System.out.println("Hello");
//        }

        int j = 15;
        for (j = 0; j < 20; j++) {
            System.out.println(j + " ");
        }
        System.out.println();
        System.out.println("j за циклом: " + j);

        for (int i = j - 5; i < 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

//        for (int i = 0; i >= 0; i += 10000) { // выполняется до переполнения типа int (получаем отричательнео значение)
//            System.out.println(i);
//        }

        for (String str = "Hello"; str.length() < 10; str += "$") { // в блоках инициализации и проверок могут быть не числа
            System.out.println(str);
        }

        // можно инициализировать несколько переменных,
        // проверять составные условия,
        // изменять несколько переменных в блоке изменений

        int k1 = 0;
        // какие-то строки кода
        k1 = 15;

        for (int a = 0, f = 1; k1 >= 0 || f < 10; k1--, a = ++a + k1, f++) {
            System.out.println(k1 + " : " + a + " : " + f);
        }

        System.out.println();

        // создать массив случайной длины (от 5 до 15) целых случайных чисел
        // заполнить массив случайными числами (-50 - 50)

        Random random = new Random();
        int size = random.nextInt(11) + 5; //random.nextInt(11) (0...10) + 5
        int[] digitsArray = new int[size]; // int[] ints = new int[random.nextInt(11) + 5]; - можно одной строкой объявить массив и указать размер
        System.out.println("size: " + size);

        // LT - fori + tab - создается заготовка цикла

        for (int i = 0; i < digitsArray.length; i++) {
            digitsArray[i] = random.nextInt(101) - 50; // (0...100) - 50 -> -50...50
        System.out.print(digitsArray[i] + ((i < digitsArray.length -1) ? ", " : "]\n"));
        }



    }

}
