package lesson_09;

public class JavaMethods {
    public static void main(String[] args) {

        // метод - набор инструкций (операторов)
        // у каждого метода есть имя
        // чтобы выполнить этот набор инструкций, мы вызываем (обращаемся) метод по этому имени

        // программа выводит в консоль 5 раз слово "Hello"

        sayHello();
        System.out.println("===========");
        sayHello();
        System.out.println("===========");
        sayHello();

    } // End method main

    public static void sayHello () {
        System.out.println("Hello");
        System.out.println("Friday");
    }
}
