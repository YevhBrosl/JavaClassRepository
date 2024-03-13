package homework_40;

import java.util.List;
import java.util.stream.Collectors;

//Дан список строк. Используя Stream API, отфильтруйте строки,
//которые начинаются на определенную букву (например, "A"),
//удалите дубликаты и отсортируйте их в алфавитном порядке.
public class Task4 {

    public static void main(String[] args) {
        List<String> fruit = List.of("Apple", "Orange", "Avocado", "Apple", "Banana", "Apricot", "Cherry", "Apricot", "Plum");

        List<String> sortedFruit = fruit.stream()
                .filter(String -> String.charAt(0) == 'A')
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedFruit);

    }
}
