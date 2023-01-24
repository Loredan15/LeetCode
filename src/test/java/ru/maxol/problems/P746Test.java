package ru.maxol.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P746Test {

    @Test
    void case1() {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        assertEquals(6, P746.minCostClimbingStairs(cost));
    }
}
