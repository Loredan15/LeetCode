package ru.maxol.problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.maxol.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class P102Test {

    @Test
    @DisplayName("Should return true when classResult and referenceResult equals")
    void case1(){
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        List<List<Integer>> classResult = P102.levelOrder(root);
        List<List<Integer>> referenceResult = new ArrayList<>();
        referenceResult.add(List.of(3));
        referenceResult.add(List.of(9,20));
        referenceResult.add(List.of(15,7));
       assertEquals(classResult, referenceResult);
    }

}
