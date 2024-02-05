package homework_09;
//1
//12
//123
//1234
//12345
//123456
public class Task3 {
    public static void main(String[] args) {
        int number = 1;
        System.out.println(number);
        for (int i = 1; i <= 5; i++) {
            number = number * 10 + (i+1);
            System.out.println(number);
        }
    }
//    public static void main(String[] args) {
//        for (int i = 1; i <= 6; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
}
