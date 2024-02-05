package homework_14;

//Task 2
//
//Написать метод, принимающий строку и один или два индекса (перегрузка).
//Метод должен возвращать подстроку начиная с первого индекса (включительно)
//и заканчивая вторым индексом (не включительно) Если индекс 1 - начиная с индекса и до конца строки.
//
//Функционал повторяет метод String.substring(), так что этот метод использовать не нужно.
//Оригинальный метод ломает программу, если введены не корректные индексы.
//Наш метод аварийно завершать программу не должен.

public class Task2 {
    public static void main(String[] args) {

        String string = "0123456789";
        returnSubstring(string, 1);

        returnSubstring(string, 1, 5);

    }

    public static void returnSubstring(String string, int startIndex, int endIndex) {
        if (startIndex >= 0 && endIndex < string.length()) {
            for (int i = startIndex; i < endIndex; i++) {
                System.out.print(string.charAt(i));
            }
            System.out.println();
        }
    }

    public static void returnSubstring(String string, int startIndex) {
        if (startIndex >= 0 && startIndex < string.length()) {
            for (int i = startIndex; i < string.length(); i++) {
                System.out.print(string.charAt(i));
            }
            System.out.println();
        }
    }
}
