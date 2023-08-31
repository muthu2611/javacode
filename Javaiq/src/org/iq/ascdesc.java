package org.iq;

public class ascdesc {
	public static void main(String[] args) {

    int[] numbers = {32, 3, 34};

    // Sorting using bubble sort algorithm
    int n = numbers.length; 
    for (int i = 0; i < n ; i++) {
        for (int j = i; j < n ; j++) {
            if (numbers[i] > numbers[j]) {
                // Swap numbers[j] and numbers[j+1]
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }
    }

    // Print the sorted array
    for (int number : numbers) {
        System.out.print(number + " ");
    }
}
}
