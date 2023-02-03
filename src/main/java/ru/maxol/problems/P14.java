package ru.maxol.problems;

/***
 * 14. Longest Common Prefix
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 */

public class P14 {
    public static String longestCommonPrefix(String[] strs) {
        int length = strs.length;
        if (length == 0) return "";
        String str = strs[0];
        for (int i = 1; i < length; i++) {
            while (strs[i].indexOf(str) != 0) {
                str = str.substring(0, str.length() - 1);
            }
        }
        return str;
    }
}
