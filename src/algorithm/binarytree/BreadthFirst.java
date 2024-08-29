package algorithm.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirst {

    public static void main(String[] args) {
        TreeNode node = buildTreeNode();
        System.out.println(minDepth(node));
    }

    private static int minDepth(TreeNode head) {
        if (head == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        head.deep = 1;
        queue.offer(head);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left == null && node.right == null) {
                return node.deep;
            }
            if (node.left != null) {
                node.left.deep = node.deep + 1;
                queue.offer(node.left);
            }
            if (node.right != null) {
                node.right.deep = node.deep + 1;
                queue.offer(node.right);
            }
        }
        return -1;
    }

    private static TreeNode buildTreeNode() {
        TreeNode root = new TreeNode(0);
        TreeNode leftRoot = new TreeNode(1);
        TreeNode leftRoot1 = new TreeNode(2);
        TreeNode leftRoot2 = new TreeNode(3);
        TreeNode rightRoot = new TreeNode(10);
        TreeNode rightRoot1 = new TreeNode(11);
        TreeNode rightRoot2 = new TreeNode(12);
        root.left = leftRoot;
        root.right = rightRoot;
        leftRoot.left = leftRoot1;
        leftRoot.right = leftRoot2;
        rightRoot.left = rightRoot1;
        rightRoot.right = rightRoot2;
        return root;
    }
}
