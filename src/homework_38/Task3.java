package homework_38;
//Написать метод, возвращающий первый неповторяющийся символ в строке
//Output:
//e

import java.util.*;

public class Task3 {
    public static Character getFirstUniqueChar(String string) {
        Set<Character> uniqueChars = new LinkedHashSet<>();
        Set<Character> repeatedChars = new HashSet<>();
        for (char ch : string.toCharArray()) {
            if (repeatedChars.contains(ch)) {
                continue;
            }
            if (uniqueChars.contains(ch)) {
                uniqueChars.remove(ch);
                repeatedChars.add(ch);
            } else {
                uniqueChars.add(ch);
            }
        }
        return uniqueChars.isEmpty() ? null : uniqueChars.iterator().next();

//        List<Character> charList = new ArrayList<>();
//        for (char ch : string.toCharArray()) {
//            charList.add(ch);
//        }
//        for (char ch : charList) {
//            if (charList.indexOf(ch) == charList.lastIndexOf(ch)) {
//                return ch;
//            }
//        } return 0;
    }

    public static void main(String[] args) {
        String string = "abcdefj ab,cdf,";
        System.out.println(getFirstUniqueChar(string));
    }

}
