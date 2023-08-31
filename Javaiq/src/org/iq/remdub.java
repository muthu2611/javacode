package org.iq;

import java.util.HashSet;

public class remdub {
public static void main(String[] args) {
	int[] num = {2,3,4,66,77,88,3,2,5,9};
	//String s = "a,f,g,h,y,u,k,a,t,a,t,u,k";
	
	
	HashSet<Integer>  h = new HashSet<>();
	StringBuilder sb = new StringBuilder();
	
	for(int nums: num) {
		if(!h.contains(num)) {
		h.add(nums);
		//sb.append(num).append(" ");
		}
}
	System.out.println(h);
		
}
}

