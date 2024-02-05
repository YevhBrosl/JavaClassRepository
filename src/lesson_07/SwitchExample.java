package lesson_07;

public class SwitchExample {
    public static void main(String[] args) {
        int x = 7;

        if (x == 5) {
            System.out.println("if x == 5");
        } else if (x == 7) {
            System.out.println("if x == 7");
        } else {
            System.out.println("else x имеет другое значение");
        }

        switch (x) {
            case 5:
                System.out.println("switch x == 5");
                break;
            case 7:
            case 8:
                System.out.println("switch x == 7 or 8");
                break;
            default:
                System.out.println("switch x имеет другое значение");

        }
    }
}
