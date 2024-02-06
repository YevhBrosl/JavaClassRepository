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

        String string = "qwertyuiop";// 2, 5 --> char[3]; 0 .. 2
        System.out.println(returnSubstring(string, 2, 5));
        System.out.println(returnSubstring(string, 2));
        System.out.println(returnSubstring(string, 5, 3));

    }

//    public static String returnSubstring(String string, int startIndex, int endIndex) {
//        String result = "";
//        if (string == null) return null;
//        if (startIndex >= 0 && endIndex < string.length()) {
//            for (int i = startIndex; i < endIndex; i++) {
//                result += string.charAt(i);
//            }
//            System.out.println(result);
//        }
//        return result;
//    }

    public static String returnSubstring(String string, int startIndex) {
        return returnSubstring(string, startIndex, string.length());
    }

    public static String returnSubstring(String string, int startIndex, int endIndex) {
        if (string == null || startIndex < 0
                || startIndex > string.length()
                || endIndex > string.length()
                || endIndex <= startIndex) return "";

        // Option 1
        char[] chars = new char[endIndex - startIndex];

        for (int i = 0; i < chars.length; i++) {
            chars[i] = string.charAt(i + startIndex);
        }


        String result = "";

        //Option 2
        for (int i = startIndex; i < endIndex; i++) {
            result += "" + string.charAt(i);
        }

//        return result;
        return String.valueOf(chars);
    }


//    public static String returnSubstring(String string, int startIndex) {
//        String result = "";
//        if (startIndex >= 0 && startIndex < string.length()) {
//            for (int i = startIndex; i < string.length(); i++) {
//                result += string.charAt(i);
//            }
//            System.out.println(result);
//        }
//        return result;
//    }

}
