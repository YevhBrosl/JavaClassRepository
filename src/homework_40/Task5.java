package homework_40;

//Дан список Person с полями name, age, city. Используйте Stream API для фильтрации людей,
//которые старше определенного возраста и проживают в определенном городе, а затем соберите их в список.

import lesson_40.Cat;

import java.util.List;
import java.util.stream.Collectors;

public class Task5 {

    private static List<Person> getListPersons() {
        return List.of(
                new Person("John", 52, "London"),
                new Person("Steve", 37, "Bath"),
                new Person("Sean", 41, "Edinburgh"),
                new Person("Martin", 42, "London"),
                new Person("Robert", 24, "Manchester"),
                new Person("Richard", 65, "Lester"),
                new Person("Jacob", 17, "London")
        );
    }

    public static void main(String[] args) {
        List<Person> persons = getListPersons();

        List<Person> sorted = persons.stream()
                .filter(person -> person.getAge() > 40)
                .filter(person -> person.getCity().equals("London"))
                .collect(Collectors.toList());

        System.out.println(sorted);


    }
}
