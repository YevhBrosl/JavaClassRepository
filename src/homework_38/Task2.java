package homework_38;


import java.util.*;

//Создайте два множества строк (Set<String>), каждое из которых будет
//заполнено различными словами. Некоторые слова должны повторяться в обоих множествах.
//
//Реализуйте метод union(Set<String> set1, Set<String> set2), который
//возвращает множество, содержащее все уникальные элементы из
//обоих множеств (объединение множеств).
//
//Реализуйте метод intersection(Set<String> set1, Set<String> set2), который
//возвращает множество, содержащее только элементы, которые
//присутствуют в обоих исходных множествах (пересечение множеств).
//
//Реализуйте метод difference(Set<String> set1, Set<String> set2),
//который возвращает множество элементов, которые есть в первом множестве,
//но отсутствуют во втором (разность множеств).
//
//Результат каждого метода необходимо выводить в консоль для наглядности.
//Следует обеспечить, чтобы в исходных множествах были как уникальные,
//так и общие элементы для наглядности результатов операций.

// Output:
//[A, B, C, D, E, F]
//        [C, D]
//        [A, B]
public class Task2 {

    public static Set<String> union(Set<String> set1, Set<String> set2) {
        Set<String> result = new LinkedHashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static Set<String> intersection(Set<String> set1, Set<String> set2) {
        Set<String> result = new LinkedHashSet<>();
        for (String string : set1) {
            if (set2.contains(string) && !result.contains(string)) {
                result.add(string);
            }
        }
        return result;
    }

    public static Set<String> difference(Set<String> set1, Set<String> set2) {
        Set<String> result = new LinkedHashSet<>();
        for (String string : set1) {
            if (!set2.contains(string) && !result.contains(string)) {
                result.add(string);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(List.of("A", "B", "C", "D"));
        Set<String> set2 = new HashSet<>(List.of("C", "D", "E", "F"));

        System.out.println(union(set1, set2));
        System.out.println(intersection(set1, set2));
        System.out.println(difference(set1, set2));
    }


}