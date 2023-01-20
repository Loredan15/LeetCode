package ru.maxol.problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.maxol.utils.Node;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P589Test {

    @Test
    @DisplayName("Should be return the preorder traversal of its nodes' values.")
    void case1() {
        P589 testP589 = new P589();
        ArrayList<Node> childrens = new ArrayList<>();
        childrens.add(null);
        childrens.add(new Node(3));
        childrens.add(new Node(2));
        childrens.add(new Node(4));
        childrens.add(null);
        childrens.add(new Node(5));
        childrens.add(new Node(6));
        Node root = new Node(1, childrens);
        List<Integer> preorder = testP589.preorder(root);
        List<Integer> expectedResult = List.of(1, 3, 5, 6, 2, 4);

        assertEquals(expectedResult, preorder);
    }

}
