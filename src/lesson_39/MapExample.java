package lesson_39;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> oldTable = new Hashtable<>(); // out-of-date version, NOT recommended
        Map<Integer, String> map = new HashMap<>();

        //Map<K, V>
        // V put(K key, V value)
        // add a 'key - value' pair
        //returns an "old value", that used to match the key before
        System.out.println(map.put(1, "Hello"));
        map.put(2, "Java");
        map.put(3, "World");
        String oldValue = map.put(1, "Python");
        System.out.println("oldValue: " + oldValue);
        map.put(17, "orange");

        System.out.println(map);

        //V get(Object key) - returns value, associated with the key. If the key is not found, returns null
        String value = map.get(17);
        System.out.println("value: " + value);

        System.out.println("\n===================");

        String value1 = map.get(17);
        String defaultValue = "Dafault";
        if (value1 == null) value1 = defaultValue;
        System.out.println(value1);

        //V getOrDefault(Object key, V defaultValue)
        String valueWithCheckNull = map.getOrDefault(1, "NotNullValue");
        System.out.println("valueWithCheckNull: " + valueWithCheckNull);

        // boolean containsKey(Object key) - returns "true" if the key is found in the map
        // boolean containsValue(V value) - returns "true" if the map contains one or more examples of this value

        System.out.println("map.containsKey(100): " + map.containsKey(100));
        System.out.println("map.containsValue(Java): " + map.containsValue("Java"));

        System.out.println("\n===================");

        map.isEmpty();

        // int size() - returns the number of "key - value" pairs
        int size = map.size();
        System.out.println(size + " | " + map.isEmpty());

        // void clear() - clears the map

        // V remove(Object key) - removes the "key - value" pair by key. Returns the value of the removed pair
        System.out.println(map.remove(100));

        // boolean remove(Object key, Object value) - removes the "key - value" pair. Returns "true" if the "key - value" pair has been removed successfully
        System.out.println("map.remove(1, \"Java\") -> " + map.remove(1, "Java"));
        System.out.println(map);

        System.out.println("map.remove(1, \"Python\") -> " + map.remove(1, "Python"));
        System.out.println(map);

        System.out.println("\n===================");

        // put vs replace
        // V replace(K key, V value)
        map.put(99, "Banana"); // if the key does not exist, the new pair WILL be created. If the key does exist - the value will be replaced with the new value
        System.out.println("map.replace(2, \"Value\") -> " + map.replace(2, "Value"));// if the key does not exist, the new pair WILL NOT be created. If the key does exist - the value will be replaced with the new value
        System.out.println(map.replace(100, "New Value"));

        // boolean replace(K key, V oldValue, V newValue)
        System.out.println(map.replace(99, "Banana", "Kiwi"));//searches the key and the correlation of key=oldValue. If the correlation is found, replaces the value with newValue
        System.out.println(map.replace(99, "Banana", "Avocado"));
        System.out.println(map);

        System.out.println("\n===================");

        // Set<K> keySet() - returns Set of all the keys in the map
        Set<Integer> keySet = map.keySet();
        System.out.println("keySet: " + keySet);

        for (Integer key : map.keySet()) {
            System.out.println("Current value: " + map.get(key));
        }

        System.out.println("\n===================");

        //Collection<V> map.values() - returns the collection of all the values in the map
        Collection<String> collection = map.values();
        System.out.println(collection);

        // Map.Entry<K, V>

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("entry.getKey(): " + entry.getKey());
            if (entry.getValue().equals("Value")) {
                entry.setValue("Banana");
            }
            System.out.println("entry.getValue() -> " + entry.getValue());
            System.out.println("===================");
        }
        System.out.println(map);

        System.out.println("\n===================");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String val = entry.getValue();
        }

        map.forEach((key, val) -> System.out.println("Key: " + key + " | value: " + val));

        System.out.println("\n===================");

        Map<Integer, String> newMap = new LinkedHashMap<>();
        newMap.put(77, "Kotlin");
        newMap.put(0, "Tree");
        newMap.put(87, "JS");
        System.out.println("newMap: " + newMap);

        map.put(87, "DuplicatedValue");
        System.out.println("map: " + map);

        newMap.putAll(map);
        System.out.println(newMap);
        newMap.put(87, "Hero");
        newMap.put(1000, "Hello");
        System.out.println(newMap);



    }
}
