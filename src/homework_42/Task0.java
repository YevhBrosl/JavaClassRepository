package homework_42;

import java.util.Arrays;
import java.util.Objects;
import java.util.OptionalInt;

//Разбейте строку на слова, используя в качестве разделителя пробел.
//Используя функцию reduce верните суммарное количество букв в словах, которые длиннее 4 символов
// Output:
//countLetters: 19
public class Task0 {
    public static void main(String[] args) {
        String text = "Hello, world and good afternoon";
        int countLetters = countLetters(text);
        System.out.println("countLetters: " + countLetters);

    }

    private static int countLetters(String text) {
        String[] words = text.replaceAll("[^a-zA-Z0-9а-яА-Я]", " ")
                .split("\\s+");

        OptionalInt reduce = Arrays.stream(words)
                .filter(Objects::nonNull)
                .filter(str -> str.length() > 4)
                .mapToInt(String::length)
                .reduce((i1, i2) -> i1 + i2);

        return reduce.orElse(0);
    }
}
