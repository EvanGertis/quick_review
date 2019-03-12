package com.company;

public class Main {

    public static void main(String[] args) {

    	//initialize test array
    	int[] intArray = new int[7];

		intArray[0] = 20;
		intArray[1] = 35;
		intArray[2] = -15;
		intArray[3] = 7;
		intArray[4] = 55;
		intArray[5] = 1;
		intArray[6] = -22;

		// print out test array.
		for (int i = 0; i < intArray.length ; i++) {
			System.out.print(intArray[i] + " ");
		}

		System.out.println();

    	Algorithm algorithm = new Algorithm();
		int[] sortedArray = algorithm.selectionSort(intArray);

		// print out test array.
		for (int i = 0; i < sortedArray.length ; i++) {
			System.out.print(sortedArray[i] + " ");
		}
    }
}
