package lesson_27.persons.test;

import lesson_28.EnumTest;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    //метод, помеченный этой аннотацией,
    // выполняется перерд каждым тестом (перед каждым методом, помеченным аннотацией @Test)
    @BeforeEach
    public void setUp() {
        System.out.println("Метод @BeforeEach");
    }

    // @BeforeAll - метод запускается один раз перед выполнением первого теста
    // @AfterEach - метод выполняется после каждого тестового метода
    //@AfterAll - метод выполняется один раз после всех тестовых методов
    //@Disabled - указывает, что тестовый метод отключен и выполняться не будет
    //@Nested - позволяет создавать вложенный тестовый класс. Может быть использована для группировки тестовых методов



    @Test // указывает, что метод является тестовым
    public void testAddition() {
        int result = 2 + 2;
        Assertions.assertEquals(4, result);//проверяет, равны ли два значения
        Assertions.assertNotEquals(5, result);//тест будет пройден, если "не ожидаемы результат" не совпадет с фактическим
        assertTrue(4 == result);// проверяет, что условие верно
        assertFalse(5 == result); //проверяет, что условие ложное
        assertNull(null);//проверяет, что объект равен null
        assertNotNull("String");//проверяет, что объект не равен null
    }

    @ParameterizedTest
    @ValueSource(strings = {"apple", "banana", "cherry", "fig"})
    public void testFruit(String fruit) {
        System.out.println("current value: " + fruit);
        Assertions.assertTrue(fruit.length() > 3);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, -1, 4, 5})
    public void testInts(int value) {
        System.out.println("current value: " + value);
        Assertions.assertTrue(value > 0);
    }

    @ParameterizedTest
    @EnumSource(EnumTest.class)// в качестве источника набор констант из перечисления
    void testEnums(EnumTest value) {
        assertNotNull(value);
    }

    // в качестве источника данных может быть статический метод
    @ParameterizedTest
    @MethodSource("stringProvider")
    public void testFruitMethodSource(String argument) {
        System.out.println("current stream arg: " + argument);
        Assertions.assertTrue(argument.length() > 0);
    }

    static Stream<String> stringProvider() {
        return Stream.of("apple", "banana", "fig", "orange");
    }

    @ParameterizedTest
    @CsvSource({"apple, 1, true", "banana, 2, false", "cherry, 3, true"})
    public void testWithCsvSource(String fruit, int rank, boolean flag) {
        System.out.println(fruit + " | " + rank + " | " + flag);
        assertNotNull(fruit);
        assertTrue(rank > 0);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "data.csv")
    public void testWithFileSource(String fruit, int rank, boolean flag) {
        System.out.println(fruit + " | " + rank + " | " + flag);
        assertNotNull(fruit);
    }

    @ParameterizedTest
    @MethodSource("squareTestData")
    public void testSquare(int input, int expected, boolean isEqual) {
        int result = input * input;
        Assertions.assertEquals(expected, result);
        assertEquals(isEqual, result == expected);
    }

    static Stream<Arguments> squareTestData() {
        return Stream.of(
                Arguments.of(2, 4, true),
                Arguments.of(3, 9, true),
                Arguments.of(4, 15, false)
        );
    }

    @Nested
    @Disabled
    class NestedTest {
        @BeforeEach
        public void setStartValue() {
            System.out.println("Nested Before Each");
        }

        @Test
        void testNested() {
            Assertions.assertEquals(5, 5);
        }
    }

    @Disabled
    @Test
    public void testMethod() {
        System.out.println("Test Method");
    }

}