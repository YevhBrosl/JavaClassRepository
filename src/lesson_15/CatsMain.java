package lesson_15;

//Значения по умолчанию для полей
// ссылочные типы ланных - null
// числовые примитивы 0 (0.0)
// boolean - false
public class CatsMain {
    public static void main(String[] args) {
        Cat cat = new Cat(); // создаем объект класса Cat
        // Cat() - вызов конструктора класса (инициализирует
        // поля класса при создании объекта)
        // поля инициализируются значениями по умолчанию
        // конструктор всегда вызываются при создании объекта

        cat.sayMeow();
        cat.run();
        cat.sleep();

        String catNameVar = cat.name;
        System.out.println("Имя кота: " + catNameVar);
        System.out.println("Возраст кота: " + cat.age);
        System.out.println("Цыет кота: " + cat.color);

        //создаем еще один объект класса Cat
        System.out.println("=========================");

        Cat cat1 = new Cat("Max");

        cat1.run();
        cat1.sleep();
        System.out.println("Имя кота: " + cat1.name);
        System.out.println("Возраст кота: " + cat1.age);

        System.out.println("Имя первого кота: " + cat.name);

        System.out.println("===================");
        cat.whoAmI();
        cat1.whoAmI();

    }

}
