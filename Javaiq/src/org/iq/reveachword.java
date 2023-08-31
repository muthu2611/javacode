package org.iq;

public class reveachword {

	public static void main(String[] args) {
		
	
	String s = "welcome to mani";
	
	String[] word = s.split(" ");
	
	
	String revfinal="";
	
	
	for(String words: word ) {
		String revword ="";
	
	 for(int i=words.length()-1;i>=0;i-- ) {
	        	
		 revword = revword+words.charAt(i);
	           }
	 	revfinal=revfinal+revword+" ";
	
	}
	System.out.println(revfinal);
	}}
