package lesson_43;

public class EmailValidator {
    //ключевое слово throw - используется для явного выброса
    public static void validate(String email) throws EmailValidateException {
        if (email == null || email.isEmpty()) throw new EmailValidateException("Empty email");
        //1.@
        int indexAt = email.indexOf('@');
        if (indexAt <= 0 || indexAt != email.lastIndexOf('@')) throw new EmailValidateException("@ error");

        //2.должна быть точка после @
        // перегрузка метода - начинает поиск с индекса (в данном случае индекса знака @)

        int indexFirstDotAfterAt = email.indexOf('.', indexAt);
        if (indexFirstDotAfterAt == -1 || indexFirstDotAfterAt == indexAt + 1) throw new EmailValidateException(". after @ error");

        //lastDot
        if (email.lastIndexOf('.') >= email.length() - 2) throw new EmailValidateException("last dot error");

        //1st symbol alphabetic
        boolean isCharAlphabetic = Character.isAlphabetic(email.charAt(0));
        if (!isCharAlphabetic) throw new EmailValidateException("illegal first symbol");

        //4. могут использоваться символы алфавита, цифры, "-", "_", ".", "@"
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);

            boolean isCharValid = (Character.isAlphabetic(c)
                    || Character.isDigit(c)
                    || c == '-'
                    || c == '_'
                    || c == '@'
                    || c == '.');
            if (!isCharValid) throw new EmailValidateException("illegal symbol");
        }

    }
}
