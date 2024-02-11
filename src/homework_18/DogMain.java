package homework_18;



public class DogMain {
    public static void main(String[] args) {

        Dog dog = new Dog("Шарик", 50);
        dog.info();

        System.out.println("dog.takeBarrier(30): " + dog.takeBarrier(30));

        System.out.println("\n=================================");

        System.out.println("dog.takeBarrier(30): " + dog.takeBarrier(70));

        System.out.println("\n=================================");

        System.out.println("dog.takeBarrier(30): " + dog.takeBarrier(120));

        Dog dog1 = new Dog("Bim", 44);
        System.out.println(dog1.takeBarrier(85));

        System.out.println("Собаки совершили всего " + Dog.numberOfJumps() + " прыжков");


    }

}
