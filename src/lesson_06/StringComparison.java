package lesson_06;

public class StringComparison {
    public static void main(String[] args) {

        // String pool // пул строк
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");// игнорируется проверка на наличие такого же объекта в памяти
        String str4 = new String("JAVA");// игнорируется проверка на наличие такого же объекта в памяти

        System.out.println("str1: " + str1);
        System.out.println("str3: " + str3);

        System.out.println(str1 == str2);// сравнение ссылок на объекты (значения переменных), а в переменных хранятся адреса памяти
        System.out.println(str1 == str3);

        System.out.println("str1.equals(str2) -> " + str1.equals(str2)); // сравниввает по значениям объекта
        System.out.println("str1.equals(str3) -> " + str1.equals(str3)); // сравниввает по значениям объекта

        // сравнивание с игнором регистра
        System.out.println("str1.equals(str4) -> " + str1.equalsIgnoreCase(str4));

    }
}
