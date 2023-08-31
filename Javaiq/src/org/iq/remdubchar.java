package org.iq;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class remdubchar {
	   public static void main(String[] args) {
	 /*       String input = "hello java world";
	        String output = removeDuplicates(input);
	        System.out.println(output);
	    }

	    public static String removeDuplicates(String input) {
	    */  
		    String input = "hello java world";
	    	LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();
	        StringBuilder result = new StringBuilder();
	        char[] ch=input.toCharArray();
	        for (char c : ch) {
	            if (c != ' ') {
	                uniqueChars.add(c);
	            }
	        }
	        for (char c : uniqueChars) {
	            result.append(c);
	        }

	        System.out.println("the final string is : "+result.toString());
	    }
	}
	
