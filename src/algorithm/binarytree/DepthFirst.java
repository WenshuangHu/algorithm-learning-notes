package algorithm.binarytree;

public class DepthFirst {
    public static void main(String[] args) {
        TreeNode head = buildTreeNode();
        System.out.println(minDepth(head));
    }

    private static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int min = Integer.MAX_VALUE;
        if (root.left != null) {
            min = Math.min(minDepth(root.left), min);
        }
        if (root.right != null) {
            min = Math.min(minDepth(root.right), min);
        }
        return min + 1;
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
