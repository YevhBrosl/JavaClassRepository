package homework_08;

//Task 5 Дан массив строк. Вывести на экран все символы
//из самой длинной строки массива
//
//{ “One”, “Two”, “Twenty” } -->
//
//T
//w
//e
//n
//t
//y

public class Task5 {
    public static void main(String[] args) {

        String[] strings = {"Berlin", "Rome", "London", "Paris", "Washington"};
        System.out.println(strings[0] + " " + strings[1] + " " + strings[2] + " " + strings[3] + " " + strings[4]);

        int i = 0;
        int maxLength = 0;
        int maxLengthIndex = 0;

        while (i < 5) {
            if (strings[i].length() > maxLength) {
                maxLength = strings[i].length();
                maxLengthIndex = i;
            }
            i++;
        }

        int index = 0;
        while (index < maxLength) {
            System.out.println(strings[maxLengthIndex].charAt(index));
            index++;
        }

    }
}

