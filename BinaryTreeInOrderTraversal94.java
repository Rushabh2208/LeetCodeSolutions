package com.rushabh.leetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInOrderTraversal94 {

	public List<Integer> inOrderTraversal(TreeNode node){
		
		List<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode current = node;
		
		while(current != null || stack.size() > 0) {
		while(current != null) {
			stack.push(current);
			current = current.left;
		}
		
		current = stack.pop();
		list.add(current.val);
		current = current.right;
		}
		return list;
	}
	
	public static void main(String args[]) {
		BinaryTreeInOrderTraversal94 obj = new BinaryTreeInOrderTraversal94();
		//obj.inOrderTraversal(node);
		
	}
}
