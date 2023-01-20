package ru.maxol.utils;

import java.util.List;

public class Node {
    private int val;
    private List<Node> children;

    public int getVal() {
        return val;
    }

    public List<Node> getChildren() {
        return children;
    }

    public Node() {
    }

    public Node(int value) {
        val = value;
    }

    public Node(int value, List<Node> childrens) {
        val = value;
        children = childrens;
    }
}
