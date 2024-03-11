package homework_38;
//Написать метод, возвращающий первый неповторяющийся символ в строке
//Output:
//e

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static char getFirstUniqueChar(String string) {
        List<Character> charList = new ArrayList<>();
        for (char ch : string.toCharArray()) {
            charList.add(ch);
        }
        for (char ch : charList) {
            if (charList.indexOf(ch) == charList.lastIndexOf(ch)) {
                return ch;
            }
        } return 0;
    }

    public static void main(String[] args) {
        String string = "abcdefj ab,cdf,";
        System.out.println(getFirstUniqueChar(string));
    }

}
