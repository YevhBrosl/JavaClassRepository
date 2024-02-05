package lesson_06;

public class IfStatement {
    public static void main(String[] args) {

//        int x = 10;
//
//        // оператор блок - определяет область видимости переменных
//        {
//           int y = 5;
//           x = x + y;
//        }
//
//        int y = 25; // разные зоны видимости
//        System.out.println("x: " + x);
//
//       // if (condition) оператор, выполняющийся, если условие верно (true)
//
        int number = 11;

        //if ( number > 10 ) System.out.println("X больше 10");

        if ( number > 10 ) {
            System.out.println("TRUE");
            System.out.println("Всем привет");
            System.out.println("Сейчас x больше 10");
        } else if (number > 7) {
            System.out.println("Else-IF");
            System.out.println("x > 7");
        }
        else {
            System.out.println("FALSE");
            System.out.println("Я ушел");
            System.out.println("Сейчас x НЕ больше 10 и даже не больше 7");
        }

        System.out.println("Конец программы");
    }
}
