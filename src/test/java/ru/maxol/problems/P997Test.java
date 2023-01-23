package ru.maxol.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P997Test {

    @Test
    void case1() {
        int[][] trust = {{1, 3}, {2, 3}};
        assertEquals(3, P997.findJudge(3, trust));
    }

}
