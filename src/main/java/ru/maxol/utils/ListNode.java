package ru.maxol.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode getNext() {
        return next;
    }

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode createNodeList(int... val) {
        List<Integer> collect = Arrays.stream(val).boxed().toList();
         ListNode result = new ListNode(val[0]);
        int i = 1;
        gogo(result, new ListNode(), collect, i);

        return result;
    }


    private void gogo(ListNode result, ListNode listNode, List<Integer> collect, int i) {
        if (i == collect.size()) {
            return;
        }
        listNode.setVal(collect.get(i));
        result.setNext(listNode);
        i++;
        gogo(listNode, new ListNode(), collect, i);
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public void setVal(int val) {
        this.val = val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListNode listNode = (ListNode) o;

        if (val != listNode.val) return false;
        return Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        int result = val;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        return result;
    }
}
