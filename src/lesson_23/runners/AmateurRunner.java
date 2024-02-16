package lesson_23.runners;

public class AmateurRunner extends Human {

    public AmateurRunner() {
        super(15, 10);
        this.setTypeRunner("Любитель");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void run() {
        System.out.println("Сейчас побежит человек-стрела!");
        super.run();

    }
}
