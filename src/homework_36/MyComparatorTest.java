package homework_36;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MyComparatorTest {

    Integer[] array;

    @BeforeEach
    void setUp() {
        array = new Integer[]{1, 6, 5, 4, 7, 8, 9, 2, 7, 3};
    }

    @Test
    void testTask1Comparator() {
        Arrays.sort(array, new MyComparator());
        assertArrayEquals(new Integer[]{2, 4, 6, 8, 1, 3, 5, 7, 7, 9}, array);
    }

    @ParameterizedTest
    @MethodSource("getTwoArrays")
    void testTask2Comparator(Integer[] integers, Integer[] expected) {
        Arrays.sort(integers, Comparator
                .<Integer>comparingInt(n -> n % 2 == 0 ? -1 : 1)
                .thenComparingInt(x -> x % 2 == 0 ? x : -x)
        );
        System.out.println(Arrays.toString(integers));
        assertArrayEquals(expected, integers);
    }

    static Stream<Arguments> getTwoArrays() {
        return Stream.of(
                Arguments.of(
                        new Integer[]{1, 6, 5, 4, 7, 8, 9, 2, 7, 3},
                        new Integer[]{2, 4, 6, 8, 9, 7, 7, 5, 3, 1}
                ),
                Arguments.of(
                        new Integer[]{2, 3, 1, 8, 6, 12, 11, 9, 6, 3},
                        new Integer[]{2, 6, 6, 8, 12, 11, 9, 3, 3, 1}
                )
        );
    }


    @Test
    public void testMyComparator() {
        MyComparator comparator = new MyComparator();
        Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};
        Integer[] expected = {2, 4, 6, 8, 1, 3, 5, 7, 7, 9};
        Arrays.sort(integers, comparator);
        assertArrayEquals(expected, integers);
    }

    @Test
    public void testMyComparator2() {
        MyComparator2 comparator2 = new MyComparator2();
        Integer[] integers = {1, 6, 5, 4, 7, 8, 9, 2, 7, 3};
        Integer[] expected = {2, 4, 6, 8, 9, 7, 7, 5, 3, 1};
        Arrays.sort(integers, comparator2);
        assertArrayEquals(expected, integers);
    }
}
