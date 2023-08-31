package org.iq;

import java.util.Iterator;

public class revstr {
public static void main(String[] args) {
	
	String s = "google";
	String str = "";
	
	for (int i = s.length()-1; i>=0; i--) {
		char rev =s.charAt(i);
		str= str +rev;
	}
	System.out.println(str);
}
}
