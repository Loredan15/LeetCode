package ru.maxol.problems;

/***
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction.
 * If you cannot achieve any profit, return 0.
 */
public class P121 {
    public static int maxProfit(int[] prices) {
        int maxValue = Integer.MAX_VALUE;
        int profit = 0;
        int priceDelta;
        for (int price : prices) {
            if (price < maxValue) {
                maxValue = price;
            }
            priceDelta = price - maxValue;
            if (profit < priceDelta) {
                profit = priceDelta;
            }
        }
        return profit;
    }
}
