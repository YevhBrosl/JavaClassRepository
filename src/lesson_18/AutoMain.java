package lesson_18;

public class AutoMain {
    public static void main(String[] args) {

        Auto auto = new Auto("test", 100);
        Auto auto2 = new Auto("car", 200);

        auto.info();
        System.out.println(Auto.getCountAuto());

        /*
        1. НЕстатические методы могут обращаться к НЕстатическим полям и методам
        2. НЕстатические методы могут обращаться к статическим полям и методам
        3. Статические методы могут обращаться к статическим полям и методам
        4. Статические методы НЕ могут обращаться к НЕстатическим полям и методам
         */

    }
}
