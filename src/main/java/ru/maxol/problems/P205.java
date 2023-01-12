package ru.maxol.problems;

import java.util.HashMap;

/***
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character, but a character may map to itself.
 */
public class P205 {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> res = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (res.containsKey(sChar)){
                if (!res.get(sChar).equals(tChar)){
                    return false;
                }
            }else {
                if (!res.containsValue(tChar)) {
                    res.put(sChar, tChar);
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
