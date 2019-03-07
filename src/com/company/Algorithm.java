package com.company;

public class Algorithm {

    public int[] bubbleSort(int[] a){

        // loop over the entire array.
        for (int i = 0; i < a.length; i++) {
            // loop over the unsorted subarray.
            for (int j = 1; j < a.length - i; j++) {
                // if the next element in the sub array is larger
                // then swap the elements.
                if( a[j - 1] < a[j]){
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }

        return a;
    }
}
