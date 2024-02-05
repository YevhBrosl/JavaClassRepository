package lesson_04;

public class Increment {
    public static void main(String[] args) {
        int x = 3;
        // x += x++;
        //System.out.println("result = " + x);

        // x++; // x = x+1; increment
        int a = 5;
        x = x + 1;
        System.out.println("x: " + x);
        a = x++; // a = x; x = x + 1;
        a = x++ + 5;
        // x++ -> postincrement - first current x value is used then incremented (+1);
        // ++x -> preincrement - first x value is incremented (+1)
        System.out.println("a = " + a);
        System.out.println("x = " +x);

        // x-- postdecrement;
        // --x predecrement

//        x = x + 5;
//        x += 5; x = x + 5
//        x -= 5; x = x - 5
//        x *= 5; x = x * 5
//        x /= 5; x = x / 5




    }
}
