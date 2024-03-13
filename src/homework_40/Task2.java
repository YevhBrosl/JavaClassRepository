package homework_40;
//Создайте цепочку функций, которая сначала удаляет пробелы из строки,
//затем преобразует её в верхний регистр, и в конце считает количество символов в измененной строке

import java.util.function.Function;

public class Task2 {
    public static void main(String[] args) {
        Function<String, String> removeSpaces = str -> str.replaceAll("\\s", "");
        Function<String, String> toUpperCase = String::toUpperCase;
        Function<String, Integer> length = str -> str.length();
        Function<String, String> combinedFunc = removeSpaces.andThen(toUpperCase);

        String result = combinedFunc.apply("Java is a super language");
        System.out.println(result);

        Function<String, Integer> combinedFunc1 = removeSpaces.andThen(toUpperCase).andThen(length);
        Integer stringLength = combinedFunc1.apply("Java is a super language");
        System.out.println(stringLength);
    }
}
