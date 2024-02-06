package homework_15;

public class Teacher {

    String name;
    int age;
    String subject;
    int jobExperience;

    public Teacher(String teacherName, int teacherAge, String teacherSubject, int teacherJobExperience) {
        name = teacherName;
        age = teacherAge;
        subject = teacherSubject;
        jobExperience = teacherJobExperience;
    }

    public void whoAmI() {
        System.out.println("Я учитель " + name +
                ", мой возраст: " + age + " лет, я преподаю "
                + subject + ", мой стаж: " + jobExperience + " лет.");
    }

    void runClasses() {
        System.out.println("Я провожу занятия");
    }
    void explainNewTopics() {
        System.out.println("Я объясняю новые темы");
    }
    void checkHomeworkAndTests() {
        System.out.println("Я проверяю дз и кр");
    }
    void drawUpSyllabi() {
        System.out.println("Я составляю учебные программы");
    }
    void assessProgress() {
        System.out.println("Я оцениваю успеваемость");
    }
    void writeReports() {
        System.out.println("Я пишу отчеты");
    }
}
