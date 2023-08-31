package org.iq;

public class minmax {
	public static void main(String[] args) {
		
		int num[] = new int[]{67,77,87,97,10,3,4,5,22};
		
		int max = num[0];
		int min = num[0];
		
		for (int i = 1; i<num.length;i++) {
			if (num[i] > max) {
			    max = num[i];
			}
			else if (num[i] < min) {
				min = num[i];		
			}
		}
		System.out.println(min);
		System.out.println(max);
		}}
