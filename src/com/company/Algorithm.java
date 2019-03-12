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

    public int[] selectionSort(int[] a){

        //loop over the entire array.
        for (int i = a.length - 1; i >= 0; i--){
            //loop over the sub array
            for(int j =0; j < i; j++){
                if(a[j] > a[i]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        return a;
    }
}
