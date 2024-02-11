package homework_17;

//Написать класс Employee (Работник)
//
//У него должны быть поля имя, возраст, зарплата
//
//Инкапсулировать класс.
//
//Написать метод info() выводящий информацию о работнике.

public class Employee {

    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age < 16 || age > 100) {
            System.out.println("Некорректное значение возраста");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setSalary(int salary) {
        if (salary <= 0) {
            System.out.println("Некорректный размер зарплаты");
        } else {
            this.salary = salary;
        }
    }

    public int getSalary() {
        return salary;
    }

    public String info() {return "Работник: " + getName() + ", Возраст: " + getAge() + ", Зарплата: " + getSalary();}


}
