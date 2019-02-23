package com.rushabh.leetCode;

public class LengthOfLastWord58 {

	//MyCode
	public int lengthOfLastWord(String s) {
		
		char[] ch = s.toCharArray();
		
		int count = 0;
		for(int i = ch.length - 1; i >= 0; i --) {
			
			if(ch[i] == ' ') {
				if(count == 0)
					continue;
				else
					break;
			}
			count++;	
		}
			
		return count;
		
	}
	
	public int lengthOfLastWord1(String s) {
		
		String[] strArray = s.split(" ");
		if(strArray.length > 0)
			return strArray[strArray.length - 1].length();
		return 0;
		
	}
}
