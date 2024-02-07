package homework_14;

//Task 4
//
//Написать метод, принимающий строку и возвращающий новую строку,
//состоящую из 2го и 3го символа входящей строки, переведенных в верхний регистр.
//Распечатать полученный результат в методе main
//
//"Hello" -> "EL"
//"He" -> "E"
//"H" -> ???


public class Task4 {
    public static void main(String[] args) {
        String string = "H";
        String str = toUpperCaseSubstring(string);
        System.out.println(str);

    }

    public static String toUpperCaseSubstring(String string) {
        if (string == null) return ""; // null

        String result = "";

        if (string.length() > 1) {
            char char2 = string.charAt(1);
            result += char2;
        }


        if (string.length() > 2) {
            char char3 = string.charAt(2);
            result += char3;
        }

//        for (int i = 1; i < Math.min(string.length(), 3); i++) {
//            char symbol = string.charAt(i);
//
//            if ((int) symbol >= 97 && (int) symbol <= 122) {
//                symbol = (char) (symbol - 32);
//            }
//            result += String.valueOf(symbol);
//        }
        return result.toUpperCase(); // null или пустая строка в случае, если не удалось найти символы

    }
}

