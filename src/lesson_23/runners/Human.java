package lesson_23.runners;

import java.util.Objects;

public class Human {

    private final int runSpeed;
    private final int restTime;

    private String typeRunner = "Человек";

    public Human() {
        this.runSpeed = 10;
        this.restTime = 15;
    }

    public Human(int runSpeed, int restTime) {
        this.runSpeed = runSpeed;
        this.restTime = restTime;
    }

    public void run() {
        System.out.println(typeRunner + "-Человек бежит со скорость " + runSpeed);
        rest();
    }

    public void rest() {
        System.out.println(typeRunner + " нужно " + restTime + " минут для отдыха");

    }

    public int getRunSpeed() {
        return runSpeed;
    }

//    public void setRunSpeed(int runSpeed) {
//        this.runSpeed = runSpeed;
//    }

    public int getRestTime() {
        return restTime;
    }

//    public void setRestTime(int restTime) {
//        this.restTime = restTime;
//    }

    public String getTypeRunner() {
        return typeRunner;
    }

    public void setTypeRunner(String typeRunner) {
        this.typeRunner = typeRunner;
    }

    @Override
    public String toString() {
        return typeRunner + " {" +
                "runSpeed=" + runSpeed +
                ", restTime=" + restTime +
                '}';
    }


    // переопределяем метод equals, чтобы прописать правила сравнения Human.
    // при равенстве каких свойств мы будем считать два объекта равными между собой
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // сравниваем ссылки.
        if (o == null || getClass() != o.getClass()) return false; // сравниваем классы объектов
        Human human = (Human) o; // кастинг от класса Object к классу Human
        return runSpeed == human.runSpeed && restTime == human.restTime && Objects.equals(typeRunner, human.typeRunner);
        // сравниваем, определенные нами, поля объектов

    }

    @Override
    public int hashCode() {
        return Objects.hash(runSpeed, restTime, typeRunner);
    }
}
