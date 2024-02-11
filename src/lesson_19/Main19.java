package lesson_19;

public class Main19 {
    public static void main(String[] args) {
        FinalDemo finalDemo = new FinalDemo(15);
        FinalDemo finalDemo1 = new FinalDemo(25);

        finalDemo.printArray();

        String s;

        finalDemo.setNewValue();
        finalDemo.printArray();

        System.out.println(FinalDemo.PI);
        //FinalDemo.PI = 55; значение константы неизменно

         //finalDemo.setNewSize();
    }
}
