package homework_04;

public class Task2 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "is";
        String str3 = "a";
        String str4 = "powerful";
        String str5 = "language";

        String message = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;
        System.out.println("message: " + message);

        String message1 = str1.concat(" ").concat(str2).concat(" ").concat(str3).concat(" ").concat(str4).concat(" ").concat(str5);
        System.out.println("message1: " + message1);

        String delimiter = " ";
        String message2 = String.join(delimiter, str1, str2, str3, str4, str5);
        System.out.println("message2: " + message2);
        System.out.println("Длина строки: " + message2.length());

        //String originalStr = message2;
        //String regex = "powerful";
        //String replacement = "super";
        //String result = originalStr.replaceFirst(regex, replacement);
        //System.out.println(result);

        String originalStr = message2;
        String result = originalStr.replace("powerful", "super");
        System.out.println("result: " + result);

        String mainStr = result;
        String subStr = "age";
        boolean contains = mainStr.contains(subStr);
        System.out.println(contains);


    }
}
