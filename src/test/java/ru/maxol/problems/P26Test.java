package ru.maxol.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P26Test {

    @Test
    void case1() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int expectedResult = 5;
        assertEquals(expectedResult, P26.removeDuplicates(nums));
    }
}
