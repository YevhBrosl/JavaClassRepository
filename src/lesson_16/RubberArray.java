package lesson_16;

public class RubberArray {

    int[] array;
    int cursor; // присвоено значение поумолчанию 0

    public RubberArray() {
        array = new int[10];
    }

    void add(int number) {
        //Добавлять значения в массив

        // проверка, есть ли место в нашем внутреннем массиве

        if (cursor > array.length * 0.9) {
            expandArray(); //метод, расширяющий массив
        }
        array[cursor] = number;
        cursor++;
    }

    void add(int... ints) {
        // ints - с ним можно обращаться так же, как со ссылкой на массив

        for (int i = 0; i < ints.length; i++) {
            add(ints[i]);
        }
    }

//    public RubberArray(int[] array){
//        int i;
//        System.out.println("[");
//        for (i = 0; i < array.length; i++) {
//            RubberArray[i] = array[i];
//        }
//        System.out.print(RubberArray[i] + ((i < array.length - 1) ? ", " : "]\n"));
//    }


    void expandArray() {
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

    // Поиск элемента по значению
    public int searchValue(int findMe) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == findMe) return findMe;
        }
        return -1;
    }

    //Возвращение значения по индексу
    public int getValueFromIndex(int idx) {
        for (int i = 0; i < array.length; i++) {
            if (i == idx) return array[i];
        }
        return -1;
    }

    //Текущее количество элементов в массиве
    public int numberOfElementsInArray() {
        int count = 0;
        for (int i = 1; i < array.length - 1; i++) {
            count++;
        }
        return count;
    }

    //Замена значения по индексу (есть индекс и новое значение)
    void replaceValueByIndex(int idx, int newValue){
        for (int i = 0; i < array.length; i++) {
            if (i == idx){
                array[i] = newValue;
            }
        }
    }

    //Замена значения по значению (есть старое и новое значение)
    void replaceValue(int value, int newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
                array[i] = newValue;
            }
        }
    }

}

/*
1. Динамическое изменение размера массива
2. Добавлять в массив элементы
3. Добавлять в массив сразу несколько элементов
4. Вывод в консоль значений массива
 */
