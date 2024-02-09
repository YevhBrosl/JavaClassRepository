package homework_17;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Иван Иваныч", 45, 2500);

        employee.setName("Иван Иваныч");
        System.out.println(employee.getName());

        employee.setAge(45);
        System.out.println(employee.getAge());

        employee.setSalary(2500);
        System.out.println(employee.getSalary());



        System.out.println(employee.info());
    }
}
