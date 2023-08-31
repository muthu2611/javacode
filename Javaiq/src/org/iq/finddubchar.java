package org.iq;

public class finddubchar {      
	public static void main(String[] args) {
	                   // TODO Auto-generated method stub
	                  String st = "Sakkettejavatuto";
	                  int count = 0;
	                  //String[] str =st.split(" ");
	                  //String s2 =str.toString();
	                  char[] chars=st.toCharArray();
	                  
	                  System.out.println("Duplicate characters are:");
	                  for (int i=0; i<st.length();i++) {
	                              for(int j=i+1; j<st.length();j++) {
	                                         if (chars[i] == chars[j]) {
	                                                    System.out.println(chars[j]);
	                                                    count++;
	                                                    break;
	                                          }
	                               }
	                   }
	           }
}
