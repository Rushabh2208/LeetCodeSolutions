package com.rushabh.leetCode;

public class HouseRobber198 {
	 public int rob(int[] nums) {
	 
		 if(nums.length == 0)
			 return 0;
		 
		 int inclusive = nums[0];
		 int exclusive = 0;
		 
		 for(int i = 1; i < nums.length; i++) {
			 int temp = inclusive;
			 inclusive = Math.max(inclusive, nums[i] + exclusive);
			 exclusive = temp;
			 
		 }
		 return inclusive;		 
	 }
	 
	 public static void main(String args[]) {
		 
		 HouseRobber198 obj = new HouseRobber198();
		 System.out.println(obj.rob(new int[] {1, 2, 3, 1}));
	 }
	
}
