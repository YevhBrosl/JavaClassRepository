package homework_18;

public class DogMain {
    public static void main(String[] args) {
        Dog dog = new homework_18.Dog("Шарик", 50);
        Dog dog1 = new homework_18.Dog("Тузик", 70);
        Dog dog2 = new homework_18.Dog("Барбос", 20);

        String dogName = dog.getName();
        int dogJumpHeight = dog.getJumpHeight();

        dog.setName = ("Шарик");
        dog.setJumpHeight = (50);

        dog.jump();
        dog.exercise();
        dog.takeBarrier(90);

        String dog1Name = dog1.getName();
        int dog1JumpHeight = dog1.getJumpHeight();

        dog1.setName = ("Тузик");
        dog1.setJumpHeight = (70);

        dog1.jump();
        dog1.exercise();
        dog1.takeBarrier(90);

        String dog2Name = dog2.getName();
        int dog2JumpHeight = dog2.getJumpHeight();

        dog2.setName = ("Барбос");
        dog2.setJumpHeight = (20);

        dog2.jump();
        dog2.exercise();
        dog2.takeBarrier(90);
    }
}
