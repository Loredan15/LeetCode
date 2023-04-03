package ru.maxol.problems;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class P881Test {

  @Test
  void case1() {
    int[] people = {3, 2, 2, 1};
    int limit = 3;

    assertEquals(3, P881.numRescueBoats(people, limit));
  }

}
