package ru.maxol.problems;

/**
 * 9. Palindrome Number Given an integer x, return true if x is a palindrome, and false otherwise.
 */

public class P9 {

  public static boolean isPalindrome(int x) {
    String input = String.valueOf(x);
    int i = 0;
    int j = input.length() - 1;

    while (i <= j) {
      if (input.charAt(i) != input.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }


}
