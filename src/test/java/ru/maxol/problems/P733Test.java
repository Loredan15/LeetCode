package ru.maxol.problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P733Test {

    @Test
    @DisplayName("Flood fill")
    void case1() {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int[][] expectedResult = {{2, 2, 2}, {2, 2, 0}, {2, 0, 1}};

        assertEquals(expectedResult, P733.floodFill(image, 1, 1, 2));
    }

}
