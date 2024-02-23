package lesson_28;

import org.junit.jupiter.api.BeforeEach;

public class Member {
    private String email;
    private String password;

    public Member(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)) {
            this.email = email;
        }
    }

    //john@test.net
    /*
    1. @ должна присутствовать и должна быть только одна
    2. точка должна быть после @, не меньше чем через один символ после @
    3. после точки должно быть не меньше 2х символов
    4. могут использоваться символы алфавита, цифры, "-", "_", ".", "@"
    5. перед @ должен быть хотя бы один символ
    6. первый символ должен быть алфавитный
     */
    public boolean isEmailValid(String email) {
        if (email == null || email.isEmpty()) return false;
        //1.@
        int indexAt = email.indexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) return false;

        //2.должна быть точка после @
        // перегрузка метода - начинает поиск с индекса (в данном случае индекса знака @)

        int indexFirstDotAfterAt = email.indexOf('.', indexAt);

        if (indexFirstDotAfterAt == -1 || indexFirstDotAfterAt == indexAt + 1) return false;

        //lastDot
        if (email.lastIndexOf('.') >= email.length() - 2) return false;

        //1st symbol alphabetic
        boolean isCharAlphabetic = Character.isAlphabetic(email.charAt(0))
                && Character.isAlphabetic(email.charAt(email.length() - 1))
                && Character.isAlphabetic(email.charAt(email.length() - 2));
        if (!isCharAlphabetic) return false;

        //4. могут использоваться символы алфавита, цифры, "-", "_", ".", "@"
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);

            boolean isCharValid = (Character.isAlphabetic(c)
                    || Character.isDigit(c)
                    || c == '-'
                    || c == '_'
                    || c == '@'
                    || c == '.');
            if (!isCharValid) return false;
        }
        return true;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        if (isPasswordValid(password)) {
            this.password = password;
        }

    }

    public boolean isPasswordValid(String password) {
        /*требования к валидности пароля
    1.длина пароля (не меньше 8 символов)
    2. мин 1 маленькая буква
    3. мин 1 большая буква
    4. мин 1 цифра
    5. мин 1 спец символ ("!@$%&*"()[])
     */
        if (password == null || password.isEmpty()) return false;

        if (password.length() < 8) return false;

        boolean isLowerCase = false;
        boolean isUpperCase = false;
        boolean isDigit = false;
        boolean isSpecialSymbol = false;

        //альтернативный вариант запоминания
        boolean[] res = new boolean[4]; // false, false, false, false

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isDigit(c)) {
                isDigit = true;
                //res[0] = true;
                continue;
            }
            if (Character.isLowerCase(c)) {
                isLowerCase = true;
                //res[1] = true;
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
        return isLowerCase && isUpperCase && isDigit && isSpecialSymbol;
    }

    @Override
    public String toString() {
        return "Person {" +
                "email='" + email + '\'' +
                '}';
    }



}
