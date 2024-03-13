package homework_40;

import java.util.function.BiConsumer;

//Напишите BiConsumer, который принимает ключ и значение, а затем печатает их в формате "ключ=значение
public class Task3 {
    public static void main(String[] args) {

        BiConsumer<String, String> printConsumer = (key, value) -> System.out.println(key + " = " + value);
        printConsumer.accept("Hello", "world");

    }
}
