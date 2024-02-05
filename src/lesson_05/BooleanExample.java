package lesson_05;

public class BooleanExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        boolean bol1;
        bol1 = true;
        bol1 = false;

        // сравнение на равенство ==
        bol1 = x == y; // x eqauls y -> false
        System.out.println("x == y -> " + bol1);

        bol1 = x == 10; // x equals 10 -> true
        System.out.println("x == 10 -> " + bol1);

        // сравнение на НЕравенство
        boolean bol2 = x != y; // x doesn't equal y -> true
        System.out.println("x != y -> " + bol2);

        bol2 = 10 != x; // 10 doesn't equal x -> 10 doesn't equal 10 -> false
        System.out.println("x != 10 -> " + bol2);

        // больше чем >
        boolean bol3 = x > y; // x is bigger than y -> 10>5 -> true
        System.out.println("x > y -> " + bol3);
        bol3 = x > 10; // x is bigger than 10 -> 10>10 -> false
        System.out.println("x > 10 -> " + bol3);

        // Больше или равно >=
        boolean bol4 = x >= y; // x is bigger than or equals y
        System.out.println("x >= y -> " + bol4);

        bol4 = x >= 10;
        System.out.println("x >= 10 -> " + bol4);

        // меньше чем <
        boolean bol5 = x < y; //
        System.out.println("x < y -> " + bol5);

        // меньше или равно <=
        bol5 = x <= 10; // x is smaller or equals 10 -> 10<=10 -> true
        System.out.println("x <= 10 -> " + bol5);

        // логическое отрицание - меняет значение на противоположное
        boolean bol6 = true;
        System.out.println("true: " + bol6);
        bol6 = !true;
        System.out.println("!true: " + bol6);
        System.out.println("!false: " + !false);

        System.out.println("!(4==5) -> " + !(4 == 5)); // 4 равно 5 -> false -> инвертируем !false -> true

        // & логическое И (AND) -> возвращает true только если все части выражения true
        // Рим столица Италии и Барлин столица Англии -> true и false -> false
        // Рим столица Италии и Лондон столица Англии -> true и true -> true

        boolean bol7 = (2 < 5) & (11 == 10); //true & false -> false
        System.out.println("(2 < 5) & (11 == 10) -> " + bol7);
        bol7 = (2 < 5) & (11 != 10); // true & true -> true
        System.out.println("(2 < 5) & (11 != 10) -> " + bol7);

        // | - логическое ИЛИ (OR) - возвращает true если хотя бы одна часть выражения true
        // Рим столица Италии ИЛИ Барлин столица Англии -> true ИЛИ true -> false
        // Рим столица Италии ИЛИ Лондон столица Англии -> true ИЛИ true -> true
        // Рим столица Англии ИЛИ Лондон столица Италии -> false ИЛИ false -> false

        boolean bol8 = (2 < 5) | (11 == 10);
        System.out.println("(2 < 5) | (11 != 10) -> " + bol8);
        bol8 = (2 > 5) | (11 == 10);
        System.out.println("(2 > 5) | (11 == 10) -> " + bol8);

        // XOR -  логическое исключающее ИЛИ
        // только если две части выражения разные - выдает true
        boolean bl = true ^ false;
        System.out.println("true ^ false -> " + bl);
        System.out.println("true ^ true -> " + (true ^ true));
        System.out.println("false ^ true -> " + (false ^ true));
        System.out.println("false ^ false -> " + (false ^ false));

        // Логическое сокращенное И (AND) - && - по выдаваемому результату работает ананлогично &
        // но не считает правую часть, если в левой false
        int a = 5;
        int b = 10;

        a = 0;

        boolean b2 = (a != 0) && (b / a > 5); // a=0: false && (???) -> false | a=1: true && (true/false) -?
        System.out.println("(b / a > 5) -> " + b2);

        // Логическое сокращенное ИЛИ (OR) || - по выдаваемому результату работает ананлогично |

        boolean b3 = (a == 0) || (b / a > 5); // a=0: true || (???)
        System.out.println("(a != 0) || (b / a > 5) -> " + b3);


        System.out.println(true ^ true & false);

        // порядок выполнения логических операций:
        // 1 - !; 2 - &; 3 - ^; 4 - |; 5 - &&; 6 - ||
        // математические операции выполняются перед логическими
        // скобки меняют приоритет

        System.out.println(true ^ true && false);

        boolean aa = true;
        boolean bb = false;
        int cc = 25;
        int qq = 2;

        System.out.println(aa | bb | cc < 100 & !aa ^ qq == 5);
        System.out.println(true | false | 25 < 100 & !true ^ 2 == 5);
        System.out.println(true | false | true & !true ^ false);
        System.out.println(true | false | true & false ^ false);
        System.out.println(true | false | false ^ false);
        System.out.println(true | false | false);
        System.out.println(true | false);
        System.out.println(true);






    }
}
