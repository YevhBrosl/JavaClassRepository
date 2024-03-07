package homework_36;

//Четные целые числа должны идти перед нечетными числами в порядке возрастания.
//        Нечетные целые числа должны идти после четных в порядке убывания


import java.util.Arrays;
import java.util.Comparator;

public class MyComparator2 implements Comparator<Integer> {
    @Override
    public int compare(Integer int1, Integer int2) {
//        boolean isFirstEven = (int1 % 2) == 0;
//        boolean isSecondEven = (int2 % 2) == 0;

        if (int1 % 2 == 0 && int2 % 2 != 0) {
            return -1;
        } else if (int1 % 2 != 0 && int2 % 2 == 0) {
            return 1;
        } else if (int1 % 2 != 0 && int2 % 2 != 0) {
            return int2 - int1;
        } else {
            return int1 - int2;
        }
    }

    public static void main(String[] args) {

        Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};

        MyComparator2 comparator2 = new MyComparator2();
        Arrays.sort(integers, comparator2);
        System.out.println(Arrays.toString(integers));

        System.out.println("\n=============================");

        Arrays.sort(integers, (int1, int2) -> {
            if (int1 % 2 == 0 && int2 % 2 != 0) {
                return -1;
            } else if (int1 % 2 != 0 && int2 % 2 == 0) {
                return 1;
            } else if (int1 % 2 != 0 && int2 % 2 != 0) {
                return int2 - int1;
            } else {
                return int1 - int2;
            }
        });

        System.out.println(Arrays.toString(integers));

        System.out.println("\n=============================");

        Arrays.sort(integers, new MyComparator2());
        System.out.println(Arrays.toString(integers));

        System.out.println("\n=============================");

        Arrays.sort(integers, Comparator
                .<Integer>comparingInt(n -> n % 2 == 0 ? -1 : 1)
                .thenComparingInt(x -> x % 2 == 0 ? x : -x)
        );
        System.out.println(Arrays.toString(integers));

    }
}
