package homework_15;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("Вася Петров", 19,
                "МЭО", 2);

        student.attendClasses();
        student.doHomework();
        student.writeTermProjects();
        student.takeExams();

        System.out.println("Имя студента: " + student.name);
        System.out.println("Возраст: " + student.age);
        System.out.println("Специальность: " + student.major);
        System.out.println("Курс: " + student.yearOfStudies);

        student.whoAmI();
    }
}
