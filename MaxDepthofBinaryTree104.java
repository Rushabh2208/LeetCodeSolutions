package com.rushabh.leetCode;

public class MaxDepthofBinaryTree104 {
	//MyCode
	public int maxDepth(TreeNode root) {

		if (root == null)
			return 0;

		int lHeight = maxDepth(root.left);
		int rHeight = maxDepth(root.right);

		if (lHeight > rHeight)
			return (lHeight + 1);
		else
			return (rHeight + 1);
		
		//return (1 + Math.max(lheight, rHeight));
	}

	
	//1 Line Code from LeetCode
	public int MaxDepth1(TreeNode root) {
		
		if(root == null) return 0;
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right) );
	}
	
}
