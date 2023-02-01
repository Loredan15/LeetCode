package ru.maxol.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class P20Test {

    @Test
    void case1() {
        String s = "()[]{}";
        assertTrue(P20.isValid(s));
    }

}
