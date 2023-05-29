package ru.maxol.problems;

import java.util.Arrays;

/***
 * 349. Intersection of Two Arrays
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must be unique and you may return the result in any order.
 */


public class P349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        int[] count = new int[1001];

        Arrays.stream(nums2)
                .forEach(num -> count[num]++);

        return Arrays.stream(nums1)
                .sorted()
                .filter(num -> count[num]-- > 0)
                .distinct()
                .toArray();
    }
}
