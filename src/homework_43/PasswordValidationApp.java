package homework_43;

import lesson_43.EmailValidateException;
import lesson_43.EmailValidator;

public class PasswordValidationApp {
    public static void main(String[] args) {

        String password = "Qwerty1#";

        password = "";
        //password = "Qwert1#";
        //password = "qwerty1#";
        //password = "Qwerty11";

        try {
            PasswordValidator.validatePassword(password);
            System.out.println("Validation completed successfully");
        } catch (PasswordValidateException e) {
            System.out.println("Invalid password");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
