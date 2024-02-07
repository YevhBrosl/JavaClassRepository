package lesson_16;

public class MainRubberArray {
    public static void main(String[] args) {

        RubberArray ra = new RubberArray();

        System.out.println(ra.toString());

        ra.add(15);
        ra.add(-10);
        ra.add(100);

        for (int i = 0; i < 10; i++) {
            ra.add(i);
            System.out.println(ra.toString());
        }

        ra.add(100, 15, 17, -5, 24);

        System.out.println(ra.toString());

        int findMe = ra.searchValue(150);
        System.out.println(findMe);

        int findMeByIdx = ra.getValueFromIndex(25);
        System.out.println(findMeByIdx);

        int count = ra.numberOfElementsInArray();
        System.out.println(count);

        ra.replaceValueByIndex(10, 250);
        System.out.println(ra.toString());

        ra.replaceValue(3, 300);
        System.out.println(ra.toString());
    }
}
