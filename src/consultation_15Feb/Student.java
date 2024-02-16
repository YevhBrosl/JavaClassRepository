package consultation_15Feb;

public class Student extends Person{
    private String collegeName;

    public Student(String name, int age, String collegeName) {
        super(name, age);
        this.collegeName = collegeName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    @Override
    public void speak() {
        System.out.println("Добрый день. Меня зовут " + getName()
                + ". Я учусь в " + getCollegeName());
    }
}
