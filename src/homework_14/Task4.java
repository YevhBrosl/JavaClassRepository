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
        toUpperCaseSubstring(string, 1, 2);


    }

    public static void toUpperCaseSubstring(String string, int startIndex, int endIndex) {

        if (startIndex >= 0 && startIndex <= string.length() && endIndex <= string.length()) {
            char[] result = string.toCharArray();
            //  for (int i = startIndex; i <= endIndex; i++) {
            //                char symbol = string.charAt(i);
            //                if ((int) symbol >= 97 && (int) symbol <= 122) {
            //                    result[i] = (char) (symbol - 32);
            //                }
            //            }
            //
                char symbol1 = string.charAt(startIndex);
                char symbol2 = string.charAt(endIndex);



            System.out.println(new String(result));
        }

    }
}

