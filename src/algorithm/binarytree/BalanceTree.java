package algorithm.binarytree;

import java.util.Optional;

public class BalanceTree {
    public static void main(String[] args) {
        System.out.println(isBalanced(buildTreeNode()));
    }
    private static TreeNode buildTreeNode() {
        TreeNode root = new TreeNode(0);
        TreeNode leftRoot = new TreeNode(1);
        TreeNode leftRoot1 = new TreeNode(2);
        TreeNode leftRoot2 = new TreeNode(3);
        TreeNode rightRoot = new TreeNode(11);
        TreeNode rightRoot1 = new TreeNode(22);
        TreeNode rightRoot2 = new TreeNode(33);
        root.left = leftRoot;
        root.right = rightRoot;
        leftRoot.left = leftRoot1;
        leftRoot.right = leftRoot2;
        rightRoot.left = rightRoot1;
        rightRoot.right = rightRoot2;
        return root;
    }
    private static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return helper(root) != -1;
    }

    private static int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = helper(root.left);
        System.out.println("left: " + (root.left == null ? "" : root.left.val));
        int right = helper(root.right);
        System.out.println("right: " + (root.right == null ? "" : root.right.val));
        System.out.println("------------");
        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1;
        }

        return Math.max(left, right) + 1;
    }
}
