package com.rushabh.leetCode;

import java.util.Stack;

public class MinimumDistanceBetweenBSTNode783 {

	int min = Integer.MAX_VALUE;
	Stack<TreeNode> stack = new Stack<TreeNode>();
	TreeNode previous = null;
	
	//Iteratively (Not Recursion)
	public int minDiffInBST(TreeNode root) {
		
		TreeNode current = root;
		while (current != null || stack.size() > 0) {
			while (current != null) {
				stack.push(current);
				current = current.left;
			}

			current = stack.pop();
			if (previous != null)
				min = Math.min(Math.abs(previous.val - current.val), min);

			previous = current;
			current = current.right;
		}
		return min;
	}
	
	//Using Recursion
	public int minDiffInBST2(TreeNode root) {
		 if(root.left != null)
	            minDiffInBST(root.left);
	        
	        if(previous != null)
	            min = Math.min(Math.abs(previous.val - root.val), min);
	        previous = root;
	        
	        if(root.right != null)
	            minDiffInBST(root.right);
	        
	        return min;
	}

}
