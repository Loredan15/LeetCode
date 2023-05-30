package ru.maxol.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P43Test {

    @Test
    void case1() {
        String num1 = "123";
        String num2 = "456";
        String expectedResutl = "56088";
        assertEquals(expectedResutl, P43.multiply(num1, num2));
    }
}