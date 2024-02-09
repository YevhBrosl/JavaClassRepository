package lesson_17;

public class ArrayObjects {
    public static void main(String[] args) {
        Person harry = new Person("Harry", 31, "Photo");

        System.out.println(harry.toString());
        System.out.println(harry.name);
        //harry.name = "Harold";

        harry.age = 18;

        System.out.println(harry.toString());

        Person john = new Person("John", 75, "reading, music");

        Person[] people = new Person[5];

        people[0] = john;
        people[1] = harry;
        people[4] = new Person("Tom", 5, "playing with toys");
        System.out.println("===============");

        System.out.println(people[1].name);
        System.out.println(harry.name);

        people[1].name = "Askold";
        harry.age = 77;

        System.out.println(people[1].toString());
        System.out.println(harry.toString());

        for (int i = 0; i < people.length; i++) {
            if (people[i] != null){
                System.out.println(people[i].name);
                System.out.println(people[i].hobby);
            } else {
                System.out.println("Создаю нового Person");
                people[i] = new Person("Name" + i, 18 + i, "Java");
                System.out.println(people[i].toString());
                //System.out.println("Игнорируем ссылку null");
            }
        }

        System.out.println("=======================");
        Person test = new Person("Test", 50, "test");
        people[3] = test;

        test = null;
        System.out.println(people[3].hobby);

        test = people[1];

    }

}
