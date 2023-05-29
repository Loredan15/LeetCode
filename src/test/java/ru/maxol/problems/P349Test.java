package ru.maxol.problems;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class P349Test {

    @Test
    public void case1() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] expectedResult = {2};
        int[] intersection = P349.intersection(nums1, nums2);
        assertEquals(Arrays.toString(intersection), Arrays.toString(expectedResult));
    }

}