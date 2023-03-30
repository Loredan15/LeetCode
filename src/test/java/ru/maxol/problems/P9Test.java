package ru.maxol.problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class P9Test {

  @ParameterizedTest
  @DisplayName("Check if a number is a palindrome")
  @CsvSource({
      "121, true",
      "123, false",
      "4567654, true"
  })
  public void case1(int number, boolean expectedResult) {
    boolean palindrome = P9.isPalindrome(number);
    assertEquals(palindrome, expectedResult);

  }
}
