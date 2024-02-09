package lesson_16;

public class RubberArray {

    private int[] array;
    private int cursor; // присвоено значение поумолчанию 0


    public RubberArray() {
        array = new int[10];
    }
//Конструктор, принимающий в себя обычный массив и создающий RubberArray с такими де значениями
    public RubberArray(int[] ints) {
        array = new int[ints.length * 2];
        for (int i = 0; i < ints.length; i++) {
            add(ints[i]);
        }
    }

    public void add(int number) {
        //Добавлять значения в массив

        // проверка, есть ли место в нашем внутреннем массиве

        if (cursor > array.length * 0.9) {
            expandArray(); //метод, расширяющий массив
        }
        array[cursor] = number;
        cursor++;
    }

    public void add(int... ints) {
        // ints - с ним можно обращаться так же, как со ссылкой на массив

        for (int i = 0; i < ints.length; i++) {
            add(ints[i]);
        }
    }


    private void expandArray() {
        System.out.println("Расширяем массив!============ " + cursor);
        //1. создать новый массив большего размера
        // 2. переписать значения из старого массива в новый
        //3. перебросить ссылку

        int[] newArray = new int[array.length * 2]; // создать новый массив, в 2 раза больше предыдущего

        for (int i = 0; i < cursor; i++) {
            newArray[i] = array[i];
        }

        array = newArray; //3. Перебросить ссылку. Переменная array теперь хранит ссылку на новый массив
        System.out.println("Расширение массива завершено ==========\n");
    }

    public String toString() {
        if (cursor == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result += array[i] + ((i < cursor - 1) ? ", " : "]");
        }
        return result;
    }

    // Поиск элемента по значению (вернуть индекс)
    public int indexOf(int findMe) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == findMe) return i;
        }
        return -1;
    }

    //Возвращение значения по индексу
    public int getValue(int idx) {
        if (idx >= 0 && idx < cursor) {
            return array[idx];
        } else {
            return Integer.MAX_VALUE;// хорошего решения на этой стадии нет
            //TODO поправить
        }
    }

    //Текущее количество элементов в массиве
    public int size() {
        return cursor;
    }

    //Замена значения по индексу (есть индекс и новое значение)
    public void replaceValueByIndex(int idx, int newValue) {
        if (idx >= 0 && idx < cursor) {
            array[idx] = newValue;
        }
    }

    //Замена значения по значению (есть старое и новое значение)
    public void replaceValue(int value, int newValue) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                array[i] = newValue;
            }
        }
    }

    //Удаление элемента по индексу (возвращается значение из
    // удаленного индекса, или null, если не найдено)
    public int remove(int index) {
        if (index < 0 && index >= cursor) {
            return Integer.MAX_VALUE; //TODO correct
        }
        int value = array[index];

        for (int i = index; i < cursor - 1; i++) {
            array[i] = array[i + 1];
        }
        cursor--;
        return value;
    }
    public boolean removeByValue(int value) {
        int index = indexOf(value);
        if (index == -1) return false;
        remove(index);
        return true;
    }

}

/*
1. Динамическое изменение размера массива
2. Добавлять в массив элементы
3. Добавлять в массив сразу несколько элементов
4. Вывод в консоль значений массива
 */
