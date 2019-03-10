package com.rushabh.leetCode;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree226 {

	public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        
         if(root != null)
             q.add(root);
        while(!q.isEmpty()){
            
            TreeNode current = q.poll();
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;
                
            if(current.left != null) 
                q.add(current.left);
            
            if(current.right != null)
                q.add(current.right);
            
        }
        
        return root;
    }
}
