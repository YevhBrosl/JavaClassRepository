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
        String string = "Hello";
        toUpperCaseSubstring(string);


    }

    public static void toUpperCaseSubstring(String string) {

        String result = "";
        for (int i = 1; i < Math.min(string.length(), 3); i++) {
            char symbol = string.charAt(i);

            if ((int) symbol >= 97 && (int) symbol <= 122) {
                symbol = (char) (symbol - 32);
            }
            result += String.valueOf(symbol);
        }
        System.out.println(result);
    }
}

