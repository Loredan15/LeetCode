package ru.maxol.problems;

import ru.maxol.utils.ListNode;

/***
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 */
public class P206 {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.getNext();
            cur.setNext(prev);
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
