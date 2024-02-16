package lesson_23;

public class SuperAbstract extends TestAbstract {

    public static void main(String[] args) {
        TestAbstract testAbstract = new SuperAbstract();

        SuperAbstract superAbstract = new SuperAbstract();

        testAbstract.test();
        superAbstract.test();

    }
}
