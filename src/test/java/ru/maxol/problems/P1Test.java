package ru.maxol.problems;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class P1Test {

    @Test
    void case1() {
        int[] nums = {2, 7, 11, 15};
        int[] expectedResult = {0, 1};
        assertTrue(Arrays.toString(expectedResult).equals(Arrays.toString(P1.twoSum(nums, 9))));
    }

    @Test
    void case2() {
        int[] nums = {3, 2, 4};
        int[] expectedResult = {1, 2};
        assertTrue(Arrays.toString(expectedResult).equals(Arrays.toString(P1.twoSum(nums, 6))));
    }

}
