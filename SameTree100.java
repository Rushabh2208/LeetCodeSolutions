package com.rushabh.leetCode;

public class SameTree100 {

	// MyCode
	public boolean isSameTree(TreeNode p, TreeNode q) {

		if (p == null && q == null)
			return true;

		if (p == null || q == null)
			return false;
		

		return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}

	// Liked the coding Style (1st line and 2nd Line)
	public boolean isSameTree1(TreeNode p, TreeNode q) {
		if (p == null || q == null) {
			return p == null && q == null;
		} else if (p.val == q.val) {
			return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		}
		return false;
	}
	
	
}
