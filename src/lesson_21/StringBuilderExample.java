package lesson_21;

public class StringBuilderExample {
    public static void main(String[] args) {
        //StringBuilder - класс для работы с последовательностями символов
        // в отличии от String объекты SB можно изменять после их создания
        //это делает его особенно полезным и удобным в ситуациях, когда нужно
        // много операций по изменению строки (конкатенация, вставка, вырезание в / из центра строки)
        // существенно уменьшает нагрузку на память и улучшает производительность

        StringBuilder sb = new StringBuilder();

        // append - добавляет строковое представление любого типа данных
        // (строка, число, символ) к текущему объекту

        sb.append("Hello").append(", ").append("World!");

        //toString - овзвращающий строку-представление

        String result = sb.toString();
        System.out.println(result);

        //insert - ставляет строку в указанную позицию текущего sb
        sb.insert(3, "JAVA");
        System.out.println(sb.toString());

        // delete, deleteCharAt - удаление диапазона по индексам, удаление 1 символа по индексу
        sb.delete(3, 6); //первый включительно, второй не включительно. Удалит 3,4,5 символ
        System.out.println(sb.toString());
        sb.deleteCharAt(3);
        System.out.println(sb.toString());

        //reverse - переворачивает содержимое объекта, делает строку зеркальной
        sb.reverse();
        System.out.println(sb.toString());

        //length - возвращает текущее количество символов в объекте
        sb.reverse();
        System.out.println(sb.length());

        //setLength - устанавливает новую длину последовательности
        sb.setLength(11);
        System.out.println(sb.toString());

        // Брат-близнец, но работает медленнее, т.к. потокобезопасен
        StringBuffer stringBuffer = new StringBuffer();

    }
}
