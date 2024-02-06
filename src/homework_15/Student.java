package homework_15;

public class Student {
    String name;
    int age;
    String major;
    int yearOfStudies;

    public Student(String studentName, int studentAge, String studentMajor, int studentYearOfStudies) {
        name = studentName;
        age = studentAge;
        major = studentMajor;
        yearOfStudies = studentYearOfStudies;
    }

    public void whoAmI() {
        System.out.println("Я студент " + name +
                ", мой возраст: " + age + " лет, моя специальность: "
                + major + ", я учусь на " + yearOfStudies + " курсе.");
    }

    void attendClasses() {
        System.out.println("Я хожу на пары");
    }
    void doHomework() {
        System.out.println("Я делаю домашку");
    }
    void writeTermProjects() {
        System.out.println("Я пишу курсовые");
    }
    void takeExams() {
        System.out.println("Я сдаю экзамены");
    }

}
