package ru.maxol.problems;

/***
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums.
 * If target exists, then return its index. Otherwise, return -1.
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class P704 {
    public static int search(int[] nums, int target) {
        int min = 0;
        int max = nums.length - 1;

        while (min <= max) {
            int mid = (min + (max - min) / 2);
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                min = mid + 1;
            } else max = mid - 1;
        }
        return -1;
    }
}
