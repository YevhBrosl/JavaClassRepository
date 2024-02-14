package homework_21;

//Компьютер и компоненты
//
//Создайте базовый класс Component с полями brand (бренд) и model (модель).
//Создайте производные классы: Processor, Memory, Storage от класса Component.
//Создайте класс Computer который будет содержать компоненты: процессор, память и накопитель.
//Реализуйте отношение композиции между Computer и компонентами. Компонент не может существовать без компьютера.

public class Component {
    private String brand;
    private String model;

    public Component(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
