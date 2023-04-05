package ru.maxol.problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class P28Test {

  @Test
  public void case1() {
    String haystack = "sadbutsad";
    String needle = "sad";
    assertEquals(0, P28.strStr(haystack, needle));
  }
}
