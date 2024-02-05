package homework_04;

public class Task1 {
    public static void main(String[] args) {
        String name = "Евгения";
        System.out.println("Евгения: " + name.length() + " букв");

        // int nameLength = name.length();
        //System.out.println("name length: " + namelength);

       char firstChar = name.charAt(0);
       char lastChar = name.charAt(name.length() -1);
       System.out.println("FirstChar: " + (int) firstChar);
       System.out.println("LastChar: " + (int) lastChar);





    }
}
