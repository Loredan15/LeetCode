package ru.maxol.problems;


import ru.maxol.utils.Node;

import java.util.ArrayList;
import java.util.List;

/***
 * 589. N-ary Tree Preorder Traversal
 * Given the root of an n-ary tree, return the preorder traversal of its nodes' values.
 * Nary-Tree input serialization is represented in their level order traversal.
 * Each group of children is separated by the null value (See examples)
 */
public class P589 {
    List<Integer> result = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        if (root == null) return result;
        result.add(root.getVal());

        for (Node children : root.getChildren()) {
            preorder(children);
        }
        return result;
    }
}

