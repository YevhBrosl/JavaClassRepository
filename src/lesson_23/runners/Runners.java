package lesson_23.runners;

public class Runners {

    public static void main(String[] args) {
        Human human = new Human();
        AmateurRunner amateur = new AmateurRunner();
        ProfRunner profRunner = new ProfRunner();


//        human.run();
//        System.out.println();
//        amateur.run();
//        System.out.println();
//        profRunner.run();
//
//        System.out.println(human);
//        System.out.println(amateur);

        Human human1 = new Human(5, 13);

        System.out.println(human);
        System.out.println(human1);

        System.out.println("сравниваем ссылки: " + (human == human1)); // сравниваем ссылки
        System.out.println("сравниваем equals: " + (human.equals(human1))); // сравниваем ссылки


    }
}
