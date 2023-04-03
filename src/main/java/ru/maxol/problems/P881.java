package ru.maxol.problems;

import java.util.Arrays;

/**
 * 881. Boats to Save People You are given an array people where people[i] is the weight of the ith person, and an infinite number of boats where each
 * boat can carry a maximum weight of limit. Each boat carries at most two people at the same time, provided the sum of the weight of those people is
 * at most limit.
 * <p>
 * Return the minimum number of boats to carry every given person. Constraints: 1 <= people.length <= 5 * 104 1 <= people[i] <= limit <= 3 * 104
 * <p>
 * Example : Input: people = [3,2,2,1], limit = 3 Output: 3 Explanation: 3 boats (1, 2), (2) and (3)
 */
public class P881 {

  public static int numRescueBoats(int[] people, int limit) {
    Arrays.sort(people);
    int left = 0;
    int right = people.length - 1;
    int boatsCount = 0;
    while (left <= right) {
      if (people[left] + people[right] <= limit) {
        left++;
      }
      right--;
      boatsCount++;
    }
    return boatsCount;
  }
}
