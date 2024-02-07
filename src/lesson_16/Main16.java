package lesson_16;

public class Main16 {
    public static void main(String[] args) {

        Cat catEmpty = new Cat();
        catEmpty.whoAmI();

        System.out.println("============================\n");

        Cat cat = new Cat("Max");
        cat.whoAmI();

        Cat cat1 = new Cat("Bear", "black");
        cat1.whoAmI();

        System.out.println("============================\n");

        Cat cat2 = new Cat("Freddy", "white", 5);
        cat2.whoAmI();
    }

}
