package homework_39;
//Пересечение двух карт: Реализуйте метод, который принимает две карты Map<String, Integer>
//и возвращает новую карту, содержащую только те записи, ключи которых присутствуют в обеих исходных картах.
//Для совпадающих ключей значение можно брать из любой карты
////Output
//banana: 20
//cherry: 30

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task3 {

    public static Map<String, Integer> intersection(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> intersectionMap = new HashMap<>();
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                intersectionMap.put(key, map2.get(key));
            }
        }
        return intersectionMap;
    }
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 50);
        map1.put("banana", 25);
        map1.put("cherry", 30);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("banana", 20);
        map2.put("cherry", 30);
        map2.put("date", 40);

        Map<String, Integer> intersectionMap = intersection(map1, map2);
        intersectionMap.forEach((key, value) -> System.out.println(key + ": " + value));

    }
}
