package homework_43;

public class PasswordValidator {

    public static void validatePassword(String password) throws PasswordValidateException {
        if (password == null || password.isEmpty()) throw new PasswordValidateException("Empty password error");

        if (password.length() < 8) throw new PasswordValidateException("Short password error");

        boolean isLowerCase = false;
        boolean isUpperCase = false;
        boolean isDigit = false;
        boolean isSpecialSymbol = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isDigit(c)) {
                isDigit = true;
                continue;
            }
            if (Character.isLowerCase(c)) {
                isLowerCase = true;
                continue;
            }
            if (Character.isUpperCase(c)) {
                isUpperCase = true;
                continue;
            }
            if ("!@#$%&*()[]".indexOf(c) >= 0) {
                isSpecialSymbol = true;
                continue;
            }
        }
        if (!isLowerCase) throw new PasswordValidateException("Password contains no low case character");
        if (!isUpperCase) throw new PasswordValidateException("Password contains no upper case character");
        if (!isDigit) throw new PasswordValidateException("Password contains no digit");
        if (!isSpecialSymbol) throw new PasswordValidateException("Password contains no special symbol");

    }
}
