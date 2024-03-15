package homework_42;

import java.util.*;
import java.util.stream.Collectors;

//Дан список Employee. Вычислите среднюю зарплату сотрудников
//в каждом отделе и найдите отдел с максимальной средней зарплатой.
public class Task3 {
    public static void main(String[] args) {

        task3();

    }

    private static void task3() {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Petr", 2500, "IT"),
                new Employee("Silvia", 1500,  "IT"),
                new Employee("Stefan", 2500,  "IT"),
                new Employee("Olivia", 2700, "Management"),
                new Employee("Sebastian", 3500, "Management"),
                new Employee("Hanna", 1300, "Cleaning"),
                new Employee("John", 3200, "IT")
        ));

        Map<String, Double> averageSalary = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));


        System.out.println("averageSalary: " + averageSalary);

        Optional<Map.Entry<String, Double>> maxAverageSalary = averageSalary
                .entrySet()
                .stream()
                .max(Comparator.comparingDouble(Map.Entry::getValue));

        maxAverageSalary.ifPresent(System.out::println);
    }
}
