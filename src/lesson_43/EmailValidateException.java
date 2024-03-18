package lesson_43;

public class EmailValidateException extends Exception {

    /*
    getMessage() - возвращает строку с коротким описанием исключения
    getCause() - возвращает исключение, которое вызвало текущее исключение
    toString() - возвращает строковое представлние объекта исключения
    printStackTrace() - выводит трассировку стека исключения
     */

    public EmailValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Email validate exception " + super.getMessage();
    }
}
