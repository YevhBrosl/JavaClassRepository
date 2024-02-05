package homework_06;

//Построчно сократить логическое выражения (соблюдая приоритетность операций)
//
//System.out.println((true | false) | (45 < 70) & !(true) ^ (6 == 5));
//
//Пример выполнения:
//
//System.out.println(true || false ^ true && !true);
//System.out.println(true || false ^ true && false);
//System.out.println(true || true && false);
//System.out.println(true || false);
//System.out.println(true);
//
//Убедиться, что во всех выведенных строчках выводится одинаковое значение типа boolean

// порядок выполнения логических операций:
// 1 - !; 2 - &; 3 - ^; 4 - |; 5 - &&; 6 - ||
// математические операции выполняются перед логическими
// скобки меняют приоритет

public class Task3 {
    public static void main(String[] args) {
        System.out.println((true | false) | (45 < 70) & !(true) ^ (6 == 5));
        System.out.println(true | true & !(true) ^ false);
        System.out.println(true | true & false ^ false);
        System.out.println(true | false ^ false);
        System.out.println(true | false);
        System.out.println(true);


    }
}
