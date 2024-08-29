package algorithm.binarytree;

import java.util.ArrayList;
import java.util.List;

public class PostorderTraversal {

	public static void main(String[] args) {		
		System.out.println(postorderTraversal(buildTreeNode()));
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

	public static List<Integer> postorderTraversal(TreeNode root) {
        if (root == null)
        	throw new IllegalArgumentException();
        List<Integer> result = new ArrayList<>();
        traversal(result, root);
        
        
        return result;
    }

	private static void traversal(List<Integer> result, TreeNode root) {		
        if (root.left != null) 
        	traversal(result, root.left);      
        if (root.right != null)
        	traversal(result, root.right);
        result.add(root.val);
	}

}
