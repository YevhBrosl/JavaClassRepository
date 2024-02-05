package lesson_08;

public class DoWhile {
    public static void main(String[] args) {

        int i = 5;
        while (i <= 5) {
            System.out.println("while " + i);
            i++;
        }

        int j = 5;
        do {
            System.out.println("do-while " + j);
            j++;
        } while (j <= 5);

    }
}
