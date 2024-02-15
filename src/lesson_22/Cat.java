package lesson_22;

public class Cat extends Animal {

    //переопределение родительсокго мтеода voice
    @Override
    public void voice() {
        System.out.println("Cat says MEOW!!!");
    }

    public void eat() {
        System.out.println("Cat is eating");
    }
}
