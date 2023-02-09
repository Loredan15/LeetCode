package ru.maxol.problems;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class P66Test {

    @Test
    void case1() {
        int[] digits = {4, 3, 2, 1};
        int[] expectedResult = {4, 3, 2, 2};
        int[] result = P66.plusOne(digits);
        assertTrue(Arrays.equals(expectedResult, result));
    }

    @Test
    void case2() {
        int[] digits = {9, 8, 7, 6, 5, 4, 3, 2, 9, 9};
        int[] expectedResult = {9, 8, 7, 6, 5, 4, 3, 3, 0, 0};
        int[] result = P66.plusOne(digits);
        assertTrue(Arrays.equals(expectedResult, result));
    }

}
