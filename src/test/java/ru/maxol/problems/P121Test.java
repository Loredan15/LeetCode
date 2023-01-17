package ru.maxol.problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P121Test {

    @Test
    @DisplayName("Case 1. Should return profit 5")
    void case1(){
        int[] prices = new int[]{7,1,5,3,6,4};
        int classResult = P121.maxProfit(prices);

        assertEquals(5, classResult);
    }

    @Test
    @DisplayName("Case 2. Should return profit 2")
    void case2(){
        int[] prices = new int[]{2,4,1};
        int classResult = P121.maxProfit(prices);

        assertEquals(2, classResult);
    }

    @Test
    @DisplayName("Case 3. Should return profit 0")
    void case3(){
        int[] prices = new int[]{7,6,4,3,1};
        int classResult = P121.maxProfit(prices);

        assertEquals(0, classResult);
    }

}
