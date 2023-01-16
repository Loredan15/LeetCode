package ru.maxol.problems;

import ru.maxol.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class P102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        TreeNode temp = root;
        List<List<Integer>> result = new ArrayList<>();
        List<TreeNode> notUsed = new ArrayList<>();
        List<Integer> gopa = new ArrayList<>();
        gopa.add(temp.val);
        notUsed.add(temp);
        result.add(gopa);
        List<TreeNode> tempTree = new ArrayList<>();
        while (!notUsed.isEmpty()) {
            TreeNode treeNode = notUsed.get(0);

            notUsed.remove(0);
            List<Integer> element = new ArrayList<>();
            if (treeNode.left != null) {
                TreeNode left = treeNode.left;
                notUsed.add(left);
                tempTree.add(left);
                element.add(left.val);
            }
            if (treeNode.right != null) {
                TreeNode right = treeNode.right;
                notUsed.add(right);
                tempTree.add(right);
                element.add(right.val);
            }

            if (notUsed.isEmpty()) {
                notUsed = tempTree;
                result.add(element);
            }
        }
        return result;
    }
}
