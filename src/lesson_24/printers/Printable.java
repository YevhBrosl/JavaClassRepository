package lesson_24.printers;

public interface Printable {

    int POWER = 220;// по умолчанию это константа (public static final), полей в интерфейсах нет

    // Интерфейс абстрактный по умолчанию (объект создать нельзя).
    // Каждый метод в интерфейсе по умолчанию абстрактный и публичный
    // Нам не нужно указывать модификаторы public abstract, они уже есть по умолчанию
    void print();
    void print(int number);

    //методы по умолчанию (c JDK 8)
    default void sayHello(String string) {
        System.out.println("Hello, " + string + "; " + POWER);
        privateMethod();
    }

    // c JDK 8 доступны статические методы
    static void staticMethod() {
        System.out.println("I'm static");
        // доступен только статический контент
        staticPrivateMethod();
    }

    private static void staticPrivateMethod() {
        System.out.println("I'm staticPrivate");
    }

    //c JDK 9 мы можем определять private методы

    private void privateMethod() {
        System.out.println("I'm private");
        staticPrivateMethod();
    }

}
