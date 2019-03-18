package com.rushabh.leetCode;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElementInStream703 {

	PriorityQueue<Integer> pq;
    int k;
	public KthLargestElementInStream703(int k, int[] nums) {
        this.pq = new PriorityQueue<>();
        this.k = k;
        
        for (int num : nums) {
            this.pq.offer(num);
            if (pq.size() > k) {
            	pq.poll();
            }
        }
    }
    
    public int add(int val) {
        
        if (pq.size() < k) {
        	pq.add(val);
        } else {
            if (pq.peek() < val) {
            	pq.add(val);
            	pq.poll();
            }
        }
        
        return pq.peek();
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
