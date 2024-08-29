package algorithm.binarytree;

public class SymmetryTree {

    public static void main(String[] args) {
        TreeNode treeNode = buildTreeNode();
        System.out.println(isSymmetry(treeNode.left, treeNode.right));
    }

    public static boolean isSymmetry(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }

        return isSymmetry(left.left, right.right) && isSymmetry(left.right, right.left);
    }

    private static TreeNode buildTreeNode() {
        TreeNode root = new TreeNode(0);
        TreeNode leftRoot = new TreeNode(1);
        TreeNode leftRoot1 = new TreeNode(2);
        TreeNode leftRoot2 = new TreeNode(3);
        TreeNode rightRoot = new TreeNode(1);
        TreeNode rightRoot1 = new TreeNode(3);
        TreeNode rightRoot2 = new TreeNode(2);
        root.left = leftRoot;
        root.right = rightRoot;
        leftRoot.left = leftRoot1;
        leftRoot.right = leftRoot2;
        rightRoot.left = rightRoot1;
        rightRoot.right = rightRoot2;
        return root;
    }
}
