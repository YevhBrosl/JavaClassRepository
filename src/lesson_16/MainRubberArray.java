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

        int findMe = ra.indexOf(100);
        System.out.println(findMe);

        int findMeByIdx = ra.getValue(15);
        System.out.println(findMeByIdx);

        int count = ra.size();
        System.out.println(count);

        ra.replaceValueByIndex(10, 250);
        System.out.println(ra.toString());

        ra.replaceValue(3, 300);
        System.out.println(ra.toString());

        int[] ints = {10, 56, -53, 0, 1, 77, 43};
        RubberArray rubberArray = new RubberArray(ints);

        System.out.println("arrayArray from array: " + rubberArray.toString());

        System.out.println("remove: " + rubberArray.remove(2));
        System.out.println(rubberArray.toString());

        rubberArray.removeByValue(10);
        rubberArray.add(55, 55, 55, 18, 55);
        System.out.println(rubberArray.toString());
        System.out.println(rubberArray.removeByValue(1000));
    }
}
