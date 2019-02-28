package com.rushabh.leetCode;

public class HouseRobber213 {

	    public static int rob(int[] nums) {       
	        if(nums.length == 0)
	            return 0;
	        
	        if(nums.length == 1)
	            return nums[0];
	        
	        if(nums.length == 2)
	            return Math.max(nums[0], nums[1]);
	        
	        int temp [] = new int[nums.length - 1];
	        for(int i = 1; i < nums.length; i++)
	            temp[i-1] = nums[i];
	            
	        int ans1 = rob(nums, nums.length - 2);
	        System.out.println("Ans1: " + ans1);
	        int ans2 = rob(temp, temp.length - 1);
	        System.out.println("Ans2: " + ans2);
	        
	        
	        return Math.max(ans1, ans2);
	    
	    }
	    static int rob(int nums[], int i){
	        
	        if(i < 0)
	            return 0;
	        
	        return Math.max((rob(nums, i-2) + nums[i]), rob(nums, i-1));
	    }

	
	public static void main(String args[]) {
		
		int nums[] = {114,117,207,117,235,82,90,67,143,146,53,108,200,91,80,223,58,170,110,236,81,90,222,160,165,195,187,199,114,235,197,187,69,129,64,214,228,78,188,67,205,94,205,169,241,202,144,240};
		
		System.out.println(rob(nums));
		
	}
	
}
