package ru.maxol.problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.maxol.utils.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class P206Test {

    @Test
    @DisplayName("Reverse list")
    void reverse(){
        ListNode nodeList = new ListNode().createNodeList(1, 2, 3, 4, 5);
        ListNode testNodeListReverse = new ListNode().createNodeList(5,4,3,2,1);
        ListNode reverseList = P206.reverseList(nodeList);

        assertEquals(testNodeListReverse, reverseList);

    }

}
