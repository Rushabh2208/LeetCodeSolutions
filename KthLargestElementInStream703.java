package com.rushabh.leetCode;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElementInStream703 {

	Queue<Integer> pQueue;
    int k;
	public KthLargestElementInStream703(int k, int[] nums) {
        this.pQueue = new PriorityQueue<>();
        this.k = k;
        
        for (int num : nums) {
            this.pQueue.offer(num);
            if (pQueue.size() > k) {
            	pQueue.poll();
            }
        }
    }
    
    public int add(int val) {
        
        if (pQueue.size() < k) {
            pQueue.offer(val);
        } else {
            if (pQueue.peek() < val) {
                pQueue.offer(val);
                pQueue.poll();
            }
        }
        
        return pQueue.peek();
    }
        
	        
	    
	    
	    public static void main(String args[]) {
	    	
	    	KthLargestElementInStream703 obj = new KthLargestElementInStream703(3, new int[] {4,5,8,2});
	    	 System.out.println (obj.add(3));
	    	 System.out.println (obj.add(5));
	    	 System.out.println (obj.add(10));
	    	 System.out.println (obj.add(9));
	    	 System.out.println (obj.add(4));
	    	 
	    }
	    
	
}
