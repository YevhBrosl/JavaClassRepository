package homework_15;

public class Doctor {
    String name;
    int age;
    String specialty;
    int jobExperience;

    public Doctor(String doctorName, int doctorAge, String doctorSpecialty, int doctorJobExperience) {
        name = doctorName;
        age = doctorAge;
        specialty = doctorSpecialty;
        jobExperience = doctorJobExperience;
    }

    public void whoAmI() {
        System.out.println("Я врач " + name +
                ", мой возраст: " + age + " лет, я по специальности "
                + specialty + ", мой стаж: " + jobExperience + " лет.");
    }

    void examinePatients() {System.out.println("Я провожу осмотр пациентов");}
    void determineDiagnosis() {
        System.out.println("Я ставлю диагноз");
    }
    void prescribeTreatment() {
        System.out.println("Я назначаю лечение");
    }
    void writeReports() {
        System.out.println("Я пишу отчеты");
    }
}
