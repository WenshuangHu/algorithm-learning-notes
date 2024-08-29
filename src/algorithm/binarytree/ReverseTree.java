package algorithm.binarytree;

public class ReverseTree {

    public static void main(String[] args) {
        TreeNode treeNode = buildTreeNode();
        reverse(treeNode);
        System.out.println(treeNode);
    }

    public static void reverse(TreeNode node) {
        if (node == null) {
            return;
        }

        reverse(node.left);
        reverse(node.right);

        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;
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
}
