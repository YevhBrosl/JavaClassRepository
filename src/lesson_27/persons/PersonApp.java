package lesson_27.persons;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("email", "password");
        System.out.println(person);

        System.out.println(person.isEmailValid("a@1.dd"));
        System.out.println(person.isPasswordValid("12345Wa%"));


        //JUnit Jupiter / TestNG

    }
}
