package ru.maxol.problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P392Test {

    @Test
    @DisplayName("Case 1. Return true")
    void isSubsequenceReturnTrue(){
        String s = "abc";
        String t = "ahbgdc";
        assertTrue(P392.isSubsequence(s,t));
    }

    @Test
    @DisplayName("Case 2. Return false")
    void isSubsequenceReturnFalse(){
        String s = "bb";
        String t = "ahbgdc";
        assertFalse(P392.isSubsequence(s,t));
    }
}
