package homework_38;

import java.util.*;

//Напишите метод, принимающий строку и возвращающий Список ее слов без повторений,
//отсортированный в порядке увеличения длин слов.
//Если строки имеют одинаковую длину - сортировать в естественном порядке
// Output:
//[для, слов, строка, которые, Тестовая, удаления, повторяются]
public class Task1 {

    public static List<String> getUniqueSortedWords(String string) {
        String result = string.replaceAll("[\\p{Punct} ]", " ");
        String[] words = result.split("\\s+");
        Set<String> set = new TreeSet<String>(Comparator.comparing(String::length).thenComparing(String::compareToIgnoreCase));
        Collections.addAll(set, words);
        return new ArrayList<>(set);
    }



    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(getUniqueSortedWords(testString));

    }
}
