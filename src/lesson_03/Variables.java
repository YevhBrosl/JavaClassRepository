package lesson_03;

public class Variables {
    public static void main(String[] args) {
        int myFirstVariable = 25;
        System.out.println("Значение переменной:" + myFirstVariable);
        short shortVar;
        shortVar = 31000;

        long longVar;
        longVar = 2_100_000_000_000_000_000L;
        System.out.println("longVar:" + longVar);
        double doubleVar = 10.5421;
        System.out.println("doubleVar=" + doubleVar);

        float floatVar = 10.542F;
        System.out.println("floatVar=" + floatVar);

    }
}
