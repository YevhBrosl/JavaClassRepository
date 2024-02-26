package util;

import java.lang.reflect.Array;

public class MyArrayList<T> implements MyList<T> {

    private T[] array;
    private int cursor; // присвоено значение поумолчанию 0
    private static final int MULTIPLIER = 2;

    @SuppressWarnings("unchecked") //подавляем предупреждение компилятора о непроверенном
    public MyArrayList() {
        array = (T[]) new Object[10];
    }

    //конструктор, принимающий в себя обычный массив и создающий RubberArray
    @SuppressWarnings("unchecked")
    public MyArrayList(T[] values) {
        array = (T[]) new Object[values.length * MULTIPLIER];

        for (int i = 0; i < values.length; i++) {
            add(values[i]);
        }
    }

    //добавить в массив элемент
    @Override
    public void add(T value) {
        //Добавлять значения в массив

        // проверка, есть ли место в нашем внутреннем массиве
        if (cursor > array.length * 0.9) {
            expandArray(); //метод, расширяющий массив
        }
        array[cursor++] = value;
    }

    @SuppressWarnings("unchecked")
    //добавить в массив сразу несколько значений
    @Override
    public void addAll(T... values) {
        // ints - с ним можно обращаться так же, как со ссылкой на массив

        for (int i = 0; i < values.length; i++) {
            add(values[i]);
        }
    }


    private void expandArray() {

        //1. создать новый массив большего размера
        // 2. переписать значения из старого массива в новый
        //3. перебросить ссылку

        T[] newArray = (T[]) new Object[array.length * MULTIPLIER]; // создать новый массив, в 2 раза больше предыдущего

        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }

        array = newArray; //3. Перебросить ссылку. Переменная array теперь хранит ссылку на новый массив

    }

    //Текущее количество элементов в массиве
    @Override
    public int size() {
        return cursor;
    }

    //вывод в консоль значений массива
    @Override
    public String toString() {
        if (cursor == 0) return "[]";

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < cursor; i++) {
            sb.append(array[i] + ((i < cursor - 1) ? ", " : "]"));

        }
        return sb.toString();
    }

    // Поиск элемента по значению (вернуть индекс)
    @Override
    public int indexOf(T value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i].equals(value)) return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T value) {
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i].equals(value)) return i;
        }
        return -1;
    }

    @Override
    public boolean contains(T value) {
        return indexOf(value) >= 0; // если элемент есть - indexOf вернет какое-то положительное число
    }

    @SuppressWarnings("unchecked")
    @Override
    public T[] toArray() {
       // 1. Создать массив нужной длинны и типа
        // 2. Переписать значения в новый массив
        // 3. Вернуть новый массив из метода

        if (cursor == 0) return (T[]) new Object[0];
        Class<T> clazz = (Class<T>) array[0].getClass();


        T[] res1 = (T[]) Array.newInstance(clazz, cursor);
        for (int i = 0; i < cursor; i++) {
            res1[i] = array[i];
        }

        return res1;
//
//        T[] result = (T[]) new Object[cursor]; // 1. Создаем массив длинной cursor(кол-во элементов во внутреннем массиве)
//        for (int i = 0; i < cursor; i++) {
//            result[i] = array[i];
//        }
//
//        System.arraycopy(array, 0, result, 0, cursor); // // - альтернативный вариант
//        return Arrays.copyOf(array, cursor); // - альтернативный вариант
//
    }
    public T[] toArray(Class<T> clazz) {

        // Рефлексия
        // 1. Создаем массив длинной cursor(кол-во элементов во внутреннем массиве)
        @SuppressWarnings("unchecked")
        T[] result = (T[]) Array.newInstance(clazz, cursor);
        for (int i = 0; i < cursor; i++) {
            result[i] = array[i];
        }

        System.out.println("========== instanceof: " + (result[0] instanceof Integer));
        return result; // Integer[]
    }

        //Удаление элемента по индексу (возвращается значение из
// удаленного индекса, или null, если не найдено)
        @Override
        public T remove (int index){
            System.out.println("Remove by index");
            if (index < 0 && index >= cursor) {
                return null;
            }
            T value = array[index];

            //перезаписываем все значения, начиная с удаляемого индекса, значениями из соседней ячейки справа
            for (int i = index; i < cursor - 1; i++) {
                array[i] = array[i + 1];
            }
            cursor--;
            return value;
        }

        @Override
        public boolean remove (T value){
            //понять, есть ли такой элемент в массиве
            //если нет - вернуть false и закончить работу метода
            //если есть - получить его индекс
            //переиспользовать метод, удаляющий по индексу

            System.out.println("Remove by value");

            int index = indexOf(value);
            if (index == -1) return false;
            remove(index);
            return true;
        }

        @Override
        public boolean isEmpty () {
            return cursor == 0;
        }

        //Возвращение значения по индексу
        @Override
        public T get (int index){
            if (index >= 0 && index < cursor) {
                return array[index];
            } else {
                return null;
            }
        }

        @Override
        public void set (int index, T value){
            //1.проверка индекса
            if (index < 0 || index > cursor - 1) return;
            array[index] = value;
        }

        //Замена значения по индексу (есть индекс и новое значение)
        public void replaceValueByIndex ( int idx, T newValue){
            if (idx >= 0 && idx < cursor) {
                array[idx] = newValue;
            }
        }

        //Замена значения по значению (есть старое и новое значение)
        public void replaceValue (T value, T newValue){
            for (int i = 0; i < cursor; i++) {
                if (array[i] == value) {
                    array[i] = newValue;
                }
            }
        }
    }



