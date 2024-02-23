package lesson_25;

public class Wrappers {
    /*
    Byte - обертка для примитива byte
    Short - обертка для short
    Integer - обертка для int
    Long - обертка для long
    Float - обертка для float
    Double - обертка для double
    Character - обертка для char
    Boolean - обертка для boolean
     */
    public static void main(String[] args) {
        Integer integer;

        int maxValue = Integer.MAX_VALUE;
        System.out.println("max: " + maxValue);
        System.out.println("min: " + Integer.MIN_VALUE);

        integer = null; //поддержка null

        //Автоматическое приведение типов
        //авто-упаковка и авто-распаковка

        Integer wrappedInt = 5; //автоупаковка примитива int в ссылочный тип Integer
        System.out.println(wrappedInt);

        int primitiveInt = wrappedInt; //автораспаковка. Из типа Integer автоматически преобразовало в примитив int

        // Сравнение объектов. == сравнение по ссылке
        // -128....127 - сравнение по ссылкам может работать не так, как мы ожидаем

        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b); //true

        Integer c = 128;
        Integer d = 128;
        System.out.println(c == d); // false
        System.out.println(c.equals(d));//true

//        Integer g = new Integer(127);
//        Integer h = new Integer(127);
//        System.out.println(g == h); //false

        //Схожие методы для всехоберточных типов
        // 1. valueOf() - преобразует явным образом примитив или строку в соответствующую обертку

        Integer e = Integer.valueOf(127);
        Integer f = Integer.valueOf(127);
        System.out.println("valueOf ==: " + (e == f));

        Integer intStr = Integer.valueOf("123");
        System.out.println(intStr * 100);

        //2. parseXXX() - преобразует строку в соотвутствующий примитив
        System.out.println(Integer.parseInt("456") + 100);
        System.out.println(Double.parseDouble("344.56") + 2.0);

        //System.out.println(Integer.parseInt("RRRR"));//выбросит исключение (ошибку)

        // toString - возвращает строковое представление числа
        System.out.println(intStr.toString() + ", hello");

        // 3.equals - сравнивает два объекта по значению

        //4. compareTo() - сравнивает текущий объект с другим объектом

        System.out.println(e.compareTo(f)); // 127 vs 127 -> 0
        System.out.println(e.compareTo(d)); // 127 vs 128 -> -1 (отрицательное значение)

        // 5. xxxValue() - возвращает объект как соответствующий примитив

        Double d1 = Double.valueOf(125.67); //явная (принудительная) запаковка
        double dPrimitive = d1.doubleValue(); // явная (принудительная) распаковка

        // ================================
        // все числовые обертки над примитивами наследуются от абстрактного класса Number

        Number number = Integer.valueOf(125);

        /* Методы для приведения любого числового оберточного типа к примитиву
        byteValue()
        shortValue()
        intValue()
        longValue()
        doubleValue()
        floatValue()
         */

        Integer integer1 = 31844;
        Double dblVal = 365.78;

        System.out.println(integer1.doubleValue());
        short sh = integer1.shortValue();

        int intFromDouble = dblVal.intValue();
        System.out.println(intFromDouble);




    }
}
