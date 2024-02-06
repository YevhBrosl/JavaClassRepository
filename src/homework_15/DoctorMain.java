package homework_15;

public class DoctorMain {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Василий Иванович", 40,
                "терапевт", 15);

        doctor.examinePatients();
        doctor.determineDiagnosis();
        doctor.prescribeTreatment();
        doctor.writeReports();

        System.out.println("Имя врача: " + doctor.name);
        System.out.println("Возраст: " + doctor.age);
        System.out.println("Специальность: " + doctor.specialty);
        System.out.println("Стаж: " + doctor.jobExperience);

        doctor.whoAmI();
    }
}
