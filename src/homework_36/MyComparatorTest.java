package homework_36;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MyComparatorTest {

    @Test
    public void testMyComparator() {
        MyComparator comparator = new MyComparator();
        Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
        Integer[] expected = {2, 4, 6, 8, 1, 3, 5, 7, 7, 9};
        Arrays.sort(integers, comparator);
        assertArrayEquals(expected, integers);
    }

    @Test
    public void testMyComparator2() {
        MyComparator2 comparator2 = new MyComparator2();
        Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
        Integer[] expected = {2, 4, 6, 8, 9, 7, 7, 5, 3, 1};
        Arrays.sort(integers, comparator2);
        assertArrayEquals(expected, integers);
    }
}
