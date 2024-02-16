package consultation_15Feb;

public class PeopleApp {
    public static void main(String[] args) {

        Person[] people = new Person[10];


        Schoolchild petya = new Schoolchild("Petya", 12, 6, 4.5);

        Student ruslan = new Student("Ruslan", 21, "college #12");

        Employee roman = new Employee("Roman", 35, "Apple");


        people[0] = petya;
        people[1] = ruslan;
        people[2] = roman;

        for (int i = 0; i < people.length; i++) {
            people[i].speak();
        }

        //? задача - мы хотим чтобы ВСЕ эти люди могли разговаривать, НО каждый по своему
    }
}
