package lesson_43;

public class ValidationEmailApp {
    public static void main(String[] args) {

        String email = "john@email.com";

        email = "john.email.com";
        email = "4john@email.com";
        email = "john@email.co.m";

        try {
            EmailValidator.validate(email);
            System.out.println("Validation completed successfully");
        } catch (EmailValidateException e) {
            System.out.println("Invalid email");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
