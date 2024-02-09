package lesson_18;

public class Test {

    static int counter;
    int x;
    public static void main(String[] args) {
        //x = 10; //ошибка компиляции
        //System.out.println(x);//ошибка компиляции
        test();
        counter = 100000;

        //test2(); у статического контента нет доступа к нестатическому контенту
    }
    public static void test() {
        System.out.println("Test");
    }

    public void test2() {
        System.out.println("Test2");
    }
}
