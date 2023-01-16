package ru.maxol.problems;

import ru.maxol.utils.ListNode;

/***
 * Given the head of a singly linked list, return the middle node of the linked list.
 * If there are two middle nodes, return the second middle node.
 */

public class P876 {

    public static ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int i = 0;
        if (head.next == null) {
            return head;
        }
        while (temp.next != null) {
            temp = temp.next;
            i++;
        }
        ListNode temp1 = head;
        int j = 0;
        if (i % 2 != 0) {
            j = -1;
        }
        do {
            temp1 = temp1.next;
            j++;
        } while (j != i / 2);
        return temp1;
    }

/*
 from the Internet
    public static ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
*/

}

