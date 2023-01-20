package ru.maxol.problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P509Test {
    static int i = 0;
    int[] expectedResult = new int[]{1, 2, 3};

    @ParameterizedTest(name = "Should be return {index} ")
    @ValueSource(ints = {2, 3, 4})
    @DisplayName("Test Fibonacci number")
    void case1(int number) {
        assertEquals(expectedResult[i], P509.fib(number));
        i++;
    }
}
