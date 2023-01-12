package ru.maxol.problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class P205Test {

    @Test
    @DisplayName("Should return false when s and t are not isomorphic")
    void isIsomorphicWhenSAndTAreNotIsomorphicThenReturnFalse() {
        String s = "foo";
        String t = "bar";
        assertFalse(P205.isIsomorphic(s, t));
    }

    @Test
    @DisplayName("Should return true when s and t are isomorphic")
    void isIsomorphicWhenSAndTAreIsomorphicThenReturnTrue() {
        String s = "egg";
        String t = "add";
        assertTrue(P205.isIsomorphic(s, t));
    }
}
