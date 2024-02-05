package lesson_05;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";
        String str4 = "string4";

        //различные варианты конкатенации
        //1.
        String concatStr = str1 + str2 + str3; // конкатенация - склеивание строк
        System.out.println(concatStr);
        concatStr = str1 + " " + str3 + " " + "String";
        System.out.println(concatStr);

        //2. concat method
        String concatStr2 = str1.concat(str3);
        System.out.println(concatStr2);
        concatStr2 = str1.concat(str3).toUpperCase();
        System.out.println(concatStr2);
        concatStr2 = str1.concat(str3);
        concatStr2 = concatStr2.toUpperCase();
        System.out.println(concatStr2);

        String concatStr3 = str1.concat(str2).concat(str3).concat(" ").concat(str4);
        //str1.concat(str2 + str3 + str4); - комбинирование способов конкатенации
        System.out.println("concatStr3: " + concatStr3);

        // 3. метод join (статический)
        String concatStrJoin = String.join(" ", str1, str3, str4);
        System.out.println("concatStrJoin: " + concatStrJoin);
        concatStrJoin = String.join("-", str1, str3, str4);
        System.out.println("concatStrJoin: " + concatStrJoin);

        int int1 = 1;
        int int2 = 2;
        double db1 = 20.5;
        System.out.println(int1 + int2 + " - это сумма" + db1 + int1 + int2);

        String digits = "0123456789";
        int len = digits.length();
        System.out.println("String length: " + len);
        // взятие символа по его индексу (порядковому номеру)
        char firstChar = digits.charAt(0);
        digits = "qewrttfgkiuhoijjkhghjgfG";
        digits = "0123456789";
        System.out.println("firstChar: " + firstChar);
        // последний символ в строке всегда имеет индекс (length -1)
        char lastChar = digits.charAt(digits.length() - 1);
        System.out.println("lastChar: " + lastChar);

        //System.out.println(digits.charAt(-1)); //ошибка, аварийное завершение программы при обращении к несуществующему индексу
        System.out.println("End of program");

        //выделение подстроки из строки
        String substring = digits.substring(5);// выделяется подстрока с 5го индекса до конца строки
        System.out.println("substring: " + substring);
        System.out.println(digits); // строка digits остается неизмененной
        substring = digits.substring(5, 8);// (5...8) -- до 8го индекса. 8й индекс не включается (не берется в подстроку)
        System.out.println("substring 5-8: " + substring);
        substring = digits.substring(5, digits.length() - 2);
        System.out.println("substring 5-8: " + substring);

        digits = "012345-01-6789-101";
        int index = digits.indexOf('4');// ищет индекс начала вхождения подстроки в строке
        System.out.println("index: " + index);
        index = digits.indexOf("79");// если строка не найдена, всегда выдает -1
        System.out.println("index: " + index);
        index = digits.indexOf("1");
        System.out.println("indexOf1: " + index);
        index = digits.lastIndexOf("1");
        System.out.println("lastIndexOf1: " + index);
        System.out.println(digits.indexOf("01"));
        System.out.println(digits.lastIndexOf("01"));

        //boolean isContains = digits.contains("01");

        String target = "abcabeabd";
        // замена подстроки на другую
        String output = target.replace("ab","");// если не находит, строка не меняется, ошибку не выдает
        System.out.println("output: " + output);

        output = target.replaceFirst("ab", "AB");// заменяет ТОЛЬКО первое вхождение
        System.out.println("output: " + output);

        output= target.replaceAll("ab", "AB");
        System.out.println("output: " + output);





    }
}
