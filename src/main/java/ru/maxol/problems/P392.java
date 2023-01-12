package ru.maxol.problems;

/***
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
 * of the characters without disturbing the relative positions of the remaining characters.
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */
public class P392 {
    public static boolean isSubsequence(String s, String t) {
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();
        int res = 0;
        int j = 0;
        for (char c : charsS) {
            for (int i = j; i < charsT.length; i++) {
                char v = charsT[i];
                if (c == v) {
                    res++;
                    j = ++i;
                    i = charsT.length;
                }
            }
        }
        return res == s.length();
    }
}
