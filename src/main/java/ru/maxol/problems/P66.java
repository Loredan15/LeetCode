package ru.maxol.problems;

/***
 * 66. Plus One
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
 * The digits are ordered from most significant to least significant in left-to-right order.
 * The large integer does not contain any leading 0's.
 * Increment the large integer by one and return the resulting array of digits.
 */

public class P66 {

    public static int[] plusOne(int[] digits) {
//        Long number = Arrays.stream(digits)
//                .mapToObj(String::valueOf)
//                .reduce((x, y) -> x + y)
//                .map(Long::parseLong)
//                .map(el -> el + 1)
//                .get();
//        String strResult = Long.toString(number);
//        char[] chars = strResult.toCharArray();
//        int[] result = new int[chars.length];
//        for (int i = 0; i < chars.length; i++) {
//            result[i] = Character.getNumericValue(chars[i]);
//        }
//
//       return result;
//    }
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
