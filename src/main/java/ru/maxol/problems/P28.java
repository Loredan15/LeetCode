package ru.maxol.problems;

/**
 * 28. Find the Index of the First Occurrence in a String Given two strings needle and haystack, return the index of the first occurrence of needle in
 * haystack, or -1 if needle is not part of haystack.
 * <p>
 * Example 1: Input: haystack = "sadbutsad", needle = "sad" Output: 0 Explanation: "sad" occurs at index 0 and 6. The first occurrence is at index 0,
 * so we return 0.
 */
public class P28 {

  public static int strStr(String haystack, String needle) {
    if (haystack.contains(needle)) {
      return haystack.indexOf(needle);
    }
    return -1;
  }
}
