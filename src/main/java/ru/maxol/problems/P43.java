package ru.maxol.problems;

/***
 * 43. Multiply Strings
 * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
 * Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */

public class P43 {
    public static String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();

        if (m == 0 || n == 0 || "0".equals(num1) || "0".equals(num2)) return "0";
        if ("1".equals(num1)) return num2;
        if ("1".equals(num2)) return num1;

        int[] result = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int temp = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                temp += result[i + j + 1];
                result[i + j + 1] = temp % 10;
                result[i + j] += temp / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i : result) {
            if (sb.length() == 0 && i == 0) continue;
            sb.append(i);
        }
        return sb.toString();
    }
}
