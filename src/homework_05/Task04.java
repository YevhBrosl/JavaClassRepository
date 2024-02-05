package homework_05;

import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
        //Random random = new Random();
       // int rand = random.nextInt(11); // [0.. 11) -> [0..10]
//
//        //rand = 0;
//
//        // четное -> число, которое делится на 2 без остатка. Т.е. остаток равен 0
//        boolean isEven = (rand != 0) & (rand % 2 == 0);
//        boolean isDevByThree = rand != 0 & rand % 3 == 0; // при делении числа на 3 остаток равен 0
//        boolean isTwice = isEven & isDevByThree;
//
//        System.out.printf("Число: %d четное: %s; кратно 3: %s; четное и кратное 3: %s\n", rand, isEven, isDevByThree, isTwice);

        int x;
        x = 27;
        System.out.println("Число 27 четное -> " + (x % 2 == 0) + ", кратно 3 -> " + (x % 3 == 0) +
                ", четное и кратно 3 -> " + ((x % 2 == 0) && (x % 3 == 0)));

        x = 42;
        boolean bool1 = x % 2 == 0;
        boolean bool2 = x % 3 == 0;
        boolean bool3 = bool1 && bool2;
        System.out.println("Число 42 четное -> " + bool1 + ", кратно 3 -> " + bool2 +
                ", четное и кратно 3 -> " + bool3);
    }
}
