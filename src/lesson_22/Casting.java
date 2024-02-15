package lesson_22;

public class Casting {
    // Восходящее (Upcasting)и нисходящее (Down-casting) преобразование
    public static void main(String[] args) {

        Animal animal = new Hamster();// здесь тип Hamster автоматически преобразуется к типу Animal
        Animal animal1 = new Dog();// Upcasting обычно происходит неявно
        Animal animal2 = new Cat();

        Cat cat = new Cat();
        cat.eat();

        System.out.println("============ sayHello ===============");
        sayHello(animal);
        sayHello(cat);
        System.out.println("============ sayHello ===============");


        Object catObj = new Cat();


        Animal[] animals = new Animal[3];
        animals[0] = animal;
        animals[1] = animal1;
        animals[2] = animal2;

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Cat) {//проверяем тип объекта
                System.out.println(animals[i] + " can be downcast to Cat");
                Cat catTest = (Cat) animals[i];
                catTest.eat();
            } else {
                System.out.println(animals[i] + " cannot be downcast to Cat");
            }

            if (animals[i] instanceof Dog) {
                System.out.println(animals[i] + " casting to Dog");
                Dog dog = (Dog) animals[i];
                dog.voice();
            } else {
                System.out.println(animals[i] + " cannot be downcast to Dog");
            }

            System.out.println(animals[i]);
            animals[i].voice();

            System.out.println("==================");
        }

        System.out.println("\n============= Down-casting =================");
        Cat cat1 = (Cat) animal2;
        cat1.voice();
        cat1.eat();

        System.out.println("\n============== SuperCat ===================\n");

        Animal animalSuper = new SuperCat();

        if (animalSuper instanceof SuperCat) {
            Cat cat2 = (Cat) animalSuper;
            cat2.eat();
        }

        if (animalSuper instanceof SuperCat) {
            SuperCat superCat = (SuperCat) animalSuper;
            superCat.superVoice();
        }


    }

    public static void sayHello(Animal animal) {
        animal.voice();
    }
}
