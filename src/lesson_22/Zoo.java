package lesson_22;

public class Zoo {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.voice();

        Cat cat = new Cat();
        cat.voice();

        Hamster hamster = new Hamster();
        hamster.voice();

        Dog dog = new Dog();
        dog.voice();

        //Переопределение методов (в классе-потомке переопределяется метод ролительского класса)
        // Method Overriding - динамический полиморфизм - времени выполнения (Runtime)

        // Статический полиморфизм (компиляционный) - перегрузка метода внутри одного класса (не используется при наследовании)

        String test = "Test " + animal + " " + hamster;
        System.out.println(test);

        System.out.println(animal);
        System.out.println(hamster);
    }
}
