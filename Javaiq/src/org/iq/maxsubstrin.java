package org.iq;

public class maxsubstrin {

	public static void main(String[] args) {
		
		String s = "abcabcd";
		int maxlen = 0;
		
		for(int i=0;i<s.length();i++) {
			StringBuilder currentstr = new StringBuilder();
			for(int j= i ; i<=s.length();j++) {
		   String findindex = String.valueOf(s.charAt(j));
			if(!currentstr.equals(findindex)) {	   
				
				break;
				}
			
			currentstr.append(s.charAt(j));
			maxlen= Math.max(maxlen, currentstr.length());
			//System.out.println(maxlen);
			
			}
			System.out.println();
		}
	
		}}
