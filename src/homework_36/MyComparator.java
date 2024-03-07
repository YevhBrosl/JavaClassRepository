package homework_36;
//Напишите MyComparator, реализующий Comparator с методом сравнения для сортировки
//        массива целых чисел в следующем порядке:
//        Четные целые числа должны идти перед нечетными числами



import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer int1, Integer int2) {
//        boolean isFirstEven = (int1 % 2) == 0;
//        boolean isSecondEven = (int2 % 2) == 0;

        if (int1 % 2 == 0 && int2 % 2 != 0) {
            return -1;
        } else if (int1 % 2 != 0 && int2 % 2 == 0) {
            return 1;
        } else {
            return int1 - int2; //Integer.compare(int1, int2)
        }
    }

    public static void main(String[] args) {

        Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};

        MyComparator comparator = new MyComparator();
        Arrays.sort(integers, comparator);
        System.out.println(Arrays.toString(integers));

        System.out.println("\n=============================");

        Arrays.sort(integers, (int1, int2) -> {
            if (int1 % 2 == 0 && int2 % 2 != 0) {
                return -1;
            } else if (int1 % 2 != 0 && int2 % 2 == 0) {
                return 1;
            } else {
                return int1 - int2;
            }
        });

        System.out.println(Arrays.toString(integers));

        System.out.println("\n=============================");

        Arrays.sort(integers, new MyComparator());
        System.out.println(Arrays.toString(integers));

        System.out.println("\n=============================");

        Arrays.sort(integers, Comparator
                .<Integer>comparingInt(n -> n % 2 == 0 ? -1 : 1)
                .thenComparingInt(n -> n)
        );
        System.out.println(Arrays.toString(integers));

    }


}

