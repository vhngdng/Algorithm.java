package com.example.demo_112;

import org.junit.jupiter.api.Test;



class Demo112ApplicationTests {

	static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(-2);
        TreeNode node3 = new TreeNode(-3);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(3);
        TreeNode node6 = new TreeNode(-2);
        TreeNode node7 = new TreeNode(-1);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node4;
        node3.left = node6;
        node5.left = node7;
        System.out.println(hasPathSum(node1, -1));

    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        boolean isValid = false;
        if (root == null )
            return false;
        int sum = targetSum - root.val;
        if (root.left == null && root.right == null && sum == 0) {
            return true;
        }else {
            TreeNode temp = root;
            TreeNode tempRight = root;
            if (temp.left != null) {
                temp = temp.left;
                isValid = hasPathSum(temp, sum);
                if (isValid) return true;
            }
            if (tempRight.right != null) {
                tempRight = tempRight.right;
                isValid = hasPathSum(tempRight, sum);
                if (isValid) return true;
            }
        }
        return isValid;

    }
}



