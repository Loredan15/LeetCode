package ru.maxol.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P14Test {

    @Test
    void case1() {
        String[] strs = {"flower", "flow", "flight"};
        String expectedResult = "fl";

        assertEquals(expectedResult, P14.longestCommonPrefix(strs));
    }

}
