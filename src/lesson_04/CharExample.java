package lesson_04;

public class CharExample {
    public static void main(String[] args) {
        char a = 'A'; // переменная хранит букву А латинского алфавита
        char a1 = 65; // переменная хранит букву А латинского алфавита
        char a2 = 0x0041; // число в 16-системе счисления (плюс ведущие нули)
        a2 = 0x41; // можно без ведущих нулей
        char a3 = '\u0041'; //число в 16-системе счисления, переменная хранит букву А латинского алфавит

        System.out.println("a: " + a);
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("a3: " + a3);

        /*
        48...57 -> 10-коды цифр от 0 до 9
        65...90 -> большие буквы латинского алфавита
        97...122 -> маленькие буквы латинского алфавита
         */

        char digit0 = 48;
        System.out.println("digit0: " + digit0);
        digit0++;
        digit0 += 4;
        System.out.println("digit0: " + digit0);

        char symbolZ = 90;
        System.out.println("symbolZ: " + --symbolZ);

        char smallA = 97;
        System.out.println("smallA: " + smallA);
        smallA = (char) (smallA + 10);
        System.out.println("smallA: " + smallA);

        char ch = 65535; // int в диапазоне от 0 до 65535 кастируются в тип char не явно
        // (не нужно явно указывать приведение)
        System.out.println(ch);

        // Переполнение типа данных

        // byte -128... 127

        byte bt = 127;
        System.out.println("bt: " + bt);
        bt += 10; // -128 + 9 -> -119
        System.out.println("bt: " + bt); // результат -119, т.к. происходит переполнение типа
        // -> результат идет по кругу от max к min

        short sh = 32767;
        sh++; // переполнение типа данных
        System.out.println("sh: " + sh);




    }
}
