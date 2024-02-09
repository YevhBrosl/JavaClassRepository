package lesson_18;

import lesson_15.CatsMain;

//Создайте класс для описание автомобиля у которого
//должны быть следующие характеристики:
//        1) производитель
//2) модель
//3) цвет
//
//Автомобиль должен уметь "заводить двигатель", "сигналить" и "выключать двигатель"
//        (напечатайте соответствующее сообщение как реакцию на действие)
//
//Причем Сигнал должен издавать звук который вы ему передадите
public class Car {

    private String producer;
    private String model;
    private String color;

    // конструктор


    public Car(String producer, String model, String color) {
        this.producer = producer;
        this.model = model;
        this.color = color;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    // Метод для запуска двигателя
    public boolean startEngine(){
        System.out.println("Двигатель " + model + " заведен!");
        return true;
    }

    // Метод для остановки двигателя
    public boolean stopEngine(){
        System.out.println("Двигатель " + model + " остановлен!");
        return false;
    }

    // Метод для сигнала
    public void beep(String sound){
        System.out.println("Автомобиль сигналит: " + sound);
    }

}
