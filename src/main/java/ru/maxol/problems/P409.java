package ru.maxol.problems;

import java.util.Hashtable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class P409 {
    public static int longestPalindrome(String s) {
        AtomicInteger result = new AtomicInteger();
        if (s.length() == 1) return 1;
        char[] chars = s.toCharArray();
        Hashtable<Character, Integer> charCount = new Hashtable<>();

        for (char aChar : chars) {
            charCount.merge(aChar, 1, Integer::sum);
        }

        AtomicBoolean flag = new AtomicBoolean(false);
        charCount.forEach((k, v) -> {
            if (v % 2 == 0) result.addAndGet(v);
            if (v > 2 && v % 2 != 0) {
                result.addAndGet(v - 1);
                flag.set(true);
            }
        });
        if (charCount.containsValue(1) || flag.get()) result.addAndGet(1);

        return result.get();
    }
}
