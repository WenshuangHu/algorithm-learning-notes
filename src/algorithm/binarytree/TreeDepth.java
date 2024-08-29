package algorithm.binarytree;

public class TreeDepth {

    public static void main(String[] args) {
        TreeNode treeNode = buildTreeNode();
        System.out.println(calculateDepth(treeNode));
    }

    public static int calculateDepth(TreeNode node) {
        if(node == null) {
            return 0;
        }

        return Math.max(calculateDepth(node.left), calculateDepth(node.right)) + 1;
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
