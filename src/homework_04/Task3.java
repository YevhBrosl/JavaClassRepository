package homework_04;

public class Task3 {
    public static void main(String[] args) {
        String str1 = "string";
        String str2 = "code";
        String str3 = "Practice";
//        int firstCh;
//        firstCh = (str1.length() / 2) - 1;
//        System.out.print(str1.charAt(firstCh));
//        System.out.println(str1.charAt(firstCh+1));
//
//        firstCh = (str2.length() / 2) - 1;
//        System.out.print(str2.charAt(firstCh));
//        System.out.println(str2.charAt(firstCh+1));
//
//        firstCh = (str3.length() / 2) - 1;
//        System.out.print(str3.charAt(firstCh));
//        System.out.println(str3.charAt(firstCh+1));

        String substring;
        substring = str1.substring((str1.length() / 2) -1, (str1.length() / 2) +1);
        System.out.println("substring String: " + substring);

        substring = str2.substring((str2.length() / 2) -1, (str2.length() / 2) +1);
        System.out.println("substring code: " + substring);

        substring = str3.substring((str3.length() / 2) -1, (str3.length() / 2) +1);
        System.out.println("substring Practice: " + substring);


    }
}
