package ru.maxol.problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class P27Test {

  @Test
  public void case1() {
    int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
    int val = 2;

    assertEquals(5, P27.removeElement(nums, val));
  }

}
