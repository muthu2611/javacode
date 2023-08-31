package org.iq;

import java.util.HashSet;

public class printonlydub {

	public static void main(String[] args) {
        String input = "a,d,f,g,h,j,a,s,e,r,j,t";
        String[] elements = input.split(",");
        
        HashSet<String> uniqueElements = new HashSet<>();
        HashSet<String> duplicateElements = new HashSet<>();
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        
        for (String element : elements) {
            if (!uniqueElements.contains(element)) {
                uniqueElements.add(element);
                sb.append(element).append(",");
            } else {
                duplicateElements.add(element);
                sb2.append(element).append(",");
            }
        }
        
        System.out.println("Original String: " + sb.toString());
        //System.out.println("Duplicate elements: " + sb2.toString());
        System.out.println("Duplicate elements: " + sb2.toString());
    }}
