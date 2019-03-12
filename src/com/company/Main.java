package com.company;

public class Main {

    public static void main(String[] args) {

    	Algorithm algorithm = new Algorithm();

    	//initialize test array
    	int[] intArray = algorithm.generateRandomArray(10);

    	//show the array before sorting.
    	algorithm.displayArray(intArray);

    	//sort.
		int[] sortedArray = algorithm.selectionSort(intArray);

		algorithm.displayArray(sortedArray);
    }
}
