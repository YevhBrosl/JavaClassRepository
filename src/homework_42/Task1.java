package homework_42;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Дан список сотрудников (Employee) с полями name, department, salary.
//Используя Stream API, сгруппируйте сотрудников по отделам
public class Task1 {
    public static void main(String[] args) {

        groupByDepartment();

    }

    private static void groupByDepartment() {

    List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Petr", 2500, "IT"),
                new Employee("Silvia", 1500,  "IT"),
                new Employee("Stefan", 2500,  "IT"),
                new Employee("Olivia", 2700, "Management"),
                new Employee("Sebastian", 3500, "Management"),
                new Employee("Hanna", 1300, "Cleaning"),
                new Employee("John", 3200, "IT")
        ));

    Map<String, List<Employee>> map = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println("getDepartment: " + map);
    }

}
