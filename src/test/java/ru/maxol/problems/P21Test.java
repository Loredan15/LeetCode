package ru.maxol.problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.maxol.utils.ListNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static ru.maxol.problems.P21.mergeTwoLists;

class P21Test {

    @Test
    @DisplayName("Case 1. Both list")
    void mergeTwoListTest(){

        ListNode test = new ListNode().createNodeList(1,2,4);
        ListNode test2 = new ListNode().createNodeList(1,3,4);
        ListNode testRes = new ListNode().createNodeList(1,1,2,3,4,4);

        ListNode res = mergeTwoLists(test, test2);

        assertEquals(res, testRes);
    }
}
