package homework_07;

//Task 5 Программа просит пользователя слово "hello"
//Если пользователь вводит правильное слово - программа распечатывает
//на экран благодарность и завершает работу Если вводится не верное
//        слово - программа просит ввести слово снова.
//До тех пор, пока не будет введено запрашиваемое слово
//
//*опционально - считать кол-во попыток, которые потребовались пользователю
//для введения правильного слова По окончанию - вывести число попыток на экран

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String inputText = "";
//        int counter = 0;
//        boolean condition = true;
//
//        while (condition) {
//            System.out.println("Введите слово: ");
//            inputText = scanner.nextLine();
//
//            counter ++;
//
//            if (inputText.equals("hello")) {
//                System.out.println("Спасибо за сотрудничество!");
//                condition = false;
//            } else {
//                System.out.println("Упс! Что-то пошло не так! Повторим еще раз.");
//            }
//        }
//        System.out.println("Вам удалось выполнить мою просьбу с " + counter + " раза");
//    }

//        int count = 4;
//
//        while (count < 5) {
//            System.out.println("Тело цикла While Loop");
//            count ++;
//        }
//
//        count = 5;
//
//        do {
//            //тело цикла
//            System.out.println("Тело цикла do-While");
//            count ++;
//        } while (count < 5);
//    }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово hello");

        String hello = scanner.nextLine();

        while (!hello.equalsIgnoreCase("hello")) {

            System.out.println("Введите слово hello (из цикла)");
            hello = scanner.nextLine();
        }

        System.out.println("Спасибо, до свидания!");

        // Option 02
        String helloDo;
        do {
            System.out.println("Введите hello (do-while)");
            helloDo = scanner.nextLine();
       } while (!helloDo.equalsIgnoreCase("hello"));

        System.out.println("Спасибо, до свидания!");
    }

}
