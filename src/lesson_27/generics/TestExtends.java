package lesson_27.generics;

import util.MyArrayList;
import util.MyList;

public class TestExtends {
    public static void main(String[] args) {
        //строгая типизация. На стадии компиляции ошибка
        System.out.println(GenericMethods.sum(Long.valueOf(1500)));

        System.out.println(GenericMethods.sum(Double.valueOf(5.76), 5.43, 6, 8.43));

        //ограничение снизу
        MyList<? super Integer> list = new MyArrayList<Number>();
        list.add(123);

        Integer intq = (Integer) list.get(0);
        System.out.println(intq);





    }
}
