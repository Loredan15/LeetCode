package ru.maxol.problems;

import ru.maxol.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class P102 {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        List<TreeNode> notUsed = new ArrayList<>();
        notUsed.add(root);
        result.add(List.of(root.val));
        List<TreeNode> tempTree = new ArrayList<>();
        List<Integer> elementsAll = new ArrayList<>();
        while (!notUsed.isEmpty()) {
            List<Integer> element = new ArrayList<>();
            TreeNode treeNode = notUsed.get(0);
            notUsed.remove(0);
            if (treeNode.left != null) {
                TreeNode left = treeNode.left;
                tempTree.add(left);
                element.add(left.val);
            }
            if (treeNode.right != null) {
                TreeNode right = treeNode.right;
                tempTree.add(right);
                element.add(right.val);
            }

            elementsAll.addAll(element);
            if (notUsed.isEmpty()) {
                notUsed.addAll(tempTree);
                tempTree.clear();
                if (!elementsAll.isEmpty()) {
                    result.add(new ArrayList<>(elementsAll));
                    elementsAll.clear();
                }
            }
        }
        return result;
    }
}
