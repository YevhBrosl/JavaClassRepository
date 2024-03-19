package homework_42;

import java.util.*;
import java.util.stream.Collectors;

//Дан список Employee. Вычислите среднюю зарплату сотрудников
//в каждом отделе и найдите отдел с максимальной средней зарплатой.
public class Task3 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Petr", 2500, "IT"),
                new Employee("Silvia", 1500,  "IT"),
                new Employee("Stefan", 2500,  "IT"),
                new Employee("Olivia", 2700, "Management"),
                new Employee("Sebastian", 3500, "Management"),
                new Employee("Hanna", 1300, "Cleaning"),
                new Employee("John", 3200, "IT")
        ));

        task3(employees);

    }

    private static void task3(List<Employee> employees) {
        Map<String, Double> averageSalary = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));

         /*
        System.out.println(averageSalaries.keySet());
        System.out.println(averageSalaries.values());

        Set<Map.Entry<String, Double>> entrySet = averageSalaries.entrySet();

        for (Map.Entry<String, Double> entry : entrySet) {
            System.out.println("key: " +  entry.getKey());
            System.out.println("value: " + entry.getValue());
        }
         */

        System.out.println("averageSalary: " + averageSalary);

        Optional<Map.Entry<String, Double>> maxAverageSalary = averageSalary
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
                //.max(Comparator.comparingDouble(Map.Entry::getValue));

        maxAverageSalary.ifPresent(System.out::println);

//        Map.Entry<String, Double> maxAverage = averageSalaries.entrySet()
//                .stream()
//                .max((entry1, entry2) ->  entry1.getValue().compareTo(entry2.getValue()))
//                .orElse(null);
//
//        Map.Entry<String, Double> maxAverage2 = averageSalaries.entrySet()
//                .stream()
//                .max(Map.Entry.comparingByValue())
//                .orElse(null);
//
//        //
//
//        System.out.println("Отдел с максимальной зарплатой:");
//        if (maxAverage != null) {
//            System.out.println(maxAverage.getKey() + " | ср.зп: " + maxAverage.getValue());
//        }
//
//        System.out.println(maxAverage2.getKey() + " | ср.зп: " + maxAverage2.getValue());
    }
}
