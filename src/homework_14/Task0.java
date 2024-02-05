package homework_14;

//Task 0
//
//Написать метод переводящие все маленькие буквы латинского алфавита в строке в верхний регистр.

public class Task0 {
    public static void main(String[] args) {
        String hello = "Hello, 123 world!";
        latinToUpperCase(hello);


    }

    public static void latinToUpperCase(String string) {
        char[] result = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            char symbol = string.charAt(i);
            if ((int) symbol >= 97 && (int) symbol <= 122) {
                result[i] = (char) (symbol - 32);
            }
        }
        System.out.println(new String(result));
    }
}
