package ru.maxol.problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P704Test {

    @Test
    @DisplayName("Should be return target index")
    void testBinarySearch(){
        int[] nums = new int[]{-1,0,3,5,9,12};
        int searchResult = P704.search(nums, 9);
        assertEquals(4, searchResult);
    }
}
