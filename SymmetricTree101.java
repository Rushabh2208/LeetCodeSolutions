package com.rushabh.leetCode;

public class SymmetricTree101 {

	public boolean isSymmetric(TreeNode root) {

		return isTrue(root, root);
	}

	public boolean isTrue(TreeNode t1, TreeNode t2) {

		if (t1 == null && t2 == null)
			return true;
		if (t1 == null || t2 == null)
			return false;

		return (t1.val == t2.val) && isTrue(t1.left, t2.right) && isTrue(t1.right, t2.left);
	}

	public static void main(String args[]) {

		SymmetricTree101 st = new SymmetricTree101();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(3);

		st.isSymmetric(root);
	}
}
