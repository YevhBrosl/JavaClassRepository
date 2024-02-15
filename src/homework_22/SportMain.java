package homework_22;

public class SportMain {
    public static void main(String[] args) {
        Person person = new Person(10,15);
        AmateurAthlete amateur = new AmateurAthlete(15, 10);
        ProfessionalAthlete profi = new ProfessionalAthlete(25, 5);

        person.run();
        amateur.run();
        profi.run();
    }
}
