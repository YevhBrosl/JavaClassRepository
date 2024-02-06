package homework_15;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Иван Петрович", 45,
                "английский язык", 20);

        teacher.runClasses();
        teacher.explainNewTopics();
        teacher.checkHomeworkAndTests();
        teacher.drawUpSyllabi();
        teacher.assessProgress();
        teacher.writeReports();

        System.out.println("Имя преподавателя: " + teacher.name);
        System.out.println("Возраст: " + teacher.age);
        System.out.println("Предмет: " + teacher.subject);
        System.out.println("Стаж: " + teacher.jobExperience);

        teacher.whoAmI();
    }
}
