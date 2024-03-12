package homework_39;

import javax.print.attribute.IntegerSyntax;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//Частотный словарь слов: Напишите метод, который принимает строку текста и возвращает
//Map<String, Integer>, где каждому слову соответствует количество его вхождений в текст.
//Напишите метод, возвращающий частотный словарь вхождения символов в строку
//Output:
//Строка: 2
//для: 3
//проверки: 3
//количества: 2
//вхождений: 1
//слов: 2
//и: 2
//теста: 1
//
//Вхождение символов:
//        '
//        ': 1; ' ': 15; '.': 2; 'С': 2; 'а': 5; 'в': 8; 'д': 4; 'е': 7; 'ж': 1; 'и': 8; 'й': 1;
//        'к': 7; 'л': 7; 'н': 1; 'о': 10; 'п': 3; 'р': 8; 'с': 5; 'т': 6; 'х': 1; 'ч': 2; 'я': 3;
public class FrequencyDictionary {

    public static Map<String, Integer> frequencyDictionary(String text) {
        String result = text.replaceAll("[^a-zA-Z0-9а-яА-Я]", " ");
        String[] words = result.split("\\s+");
        Map<String, Integer> frequencyMap = new LinkedHashMap<>();
        for (String word : words) {
            Integer count = frequencyMap.getOrDefault(word, 0);
            count++;
            frequencyMap.put(word, count);
        }
        return frequencyMap;
    }

        private static Map<Character, Integer> frequencyCharsDictionary(String text) {
            char[] chars = text.toCharArray();
            Map<Character, Integer> charFrequencyMap = new LinkedHashMap<>();
            for (char character : chars) {
                Integer count = charFrequencyMap.getOrDefault(character, 0);
                count++;
                charFrequencyMap.put(character, count);
            }
            return charFrequencyMap;
    }
    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста. и количества слов для проверки";

        Map<String, Integer> frequencyMap = frequencyDictionary(text);
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));

        Map<Character, Integer> frequencyCharsMap = frequencyCharsDictionary(text);

        System.out.println("\nВхождение символов: ");
        frequencyCharsMap.forEach((k, v) -> System.out.print("'" + k + "': " + v+ "; "));
        System.out.println();

    }

}
