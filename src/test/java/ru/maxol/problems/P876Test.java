package ru.maxol.problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.maxol.utils.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class P876Test {

    @Test
    @DisplayName("Case 1. Odd size listNode")
    void case1(){
        ListNode head = new ListNode().createNodeList(1,2,3,4,5);
        ListNode testMiddle = new ListNode().createNodeList(3,4,5);
        ListNode middle = P876.middleNode(head);
        assertEquals(middle, testMiddle);
    }

    @Test
    @DisplayName("Case 2. Even size listNode")
    void case2(){
        ListNode head = new ListNode().createNodeList(1,2,3,4,5,6);
        ListNode testMiddle = new ListNode().createNodeList(4,5,6);
        ListNode middle = P876.middleNode(head);
        assertEquals(middle, testMiddle);
    }

    @Test
    @DisplayName("Case 3. Failed")
    void case3(){
        ListNode head = new ListNode().createNodeList(1,2,3,4,5,6,7);
        ListNode testMiddle = new ListNode().createNodeList(4,5,6);
        ListNode middle = P876.middleNode(head);
        assertNotEquals(middle, testMiddle);
    }
}
