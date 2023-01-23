package ru.maxol.problems;

/***
 * 70. Climbing Stairs
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps.
 * In how many distinct ways can you climb to the top?
 */
public class P70 {
    public static int climbStairs(int n) {
        if (n < 3) return n;
        int firstStep = 1;
        int secondStep = 2;
        for (int i = 3; i <= n; i++) {
            int temp = firstStep;
            firstStep = secondStep;
            secondStep += temp;
        }
        return secondStep;
    }
}
