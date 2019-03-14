package com.company;

import java.util.Random;

//This class implements common algorithms and
// datastructures.
public class Algorithm {

    //generates a random array of size n for testing.
    //Begin generateRandomArray.
    public int[] generateRandomArray( int size){
        //use random number gen object.
        Random rand = new Random();
        int[] a = new int[size];

        for(int i = 0; i < size; i++){
            a[i] = rand.nextInt(100);
        }

        return a;
    }
    //End generateRandomArray.

    //sorts wby progressively swapping elements until
    //the largest value bubbles to the end.
    // Begin bubbleSort.
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
    // End bubbleSort.

    //swaps by sorting the largest element with the last element
    //until subsorted array is filled.
    //Begin selectionSort.
    public int[] selectionSort(int[] a){

        //loop over the entire array.
        for (int i = a.length - 1; i >= 0; i--){
            //loop over the sub array
            for(int j =0; j < i; j++){

                //if the biggest item is larger than the last item then swap.
                if(a[j] > a[i]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        return a;
    }
    // End selectionSort.

    // displays each element inline with a new line at the end
    // of the array.
    // Begin displayArray.
    public void displayArray(int[] a){
        // print out test array.
        for (int i = 0; i < a.length ; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }
    // End displayArray.

    //sorts an array from right to left by creating
    //a sorted subarray. If the value to the left of the
    //the last sorted subarray index is greater than the
    //element at to the right then the lower element is selected.
    //it is then moved down the sorted subarray to its correct position.
    //Begin selectionSort(int[])
    public int[] mySelectionSort(int[] a){
        //used to store selected element value.
        int temp;

        //start sorted subarray at outer loop.
        for(int i = 1; i < a.length; i++){
            this.displayArray(a);
            if(a[i] > a[i-1]){
                temp = a[i+1];
                a[i+1] = a[i];
                for(int j = 0; j < a.length; j++){
                    if(a[j] < temp){
                        a[j] = temp;
                    }
                }
            }
        }
        return a;
    }
    //End selectionSort.

    public int[] insertionSort(int[] a){
            for(int i = 1; i < a.length; i ++){
                int temp = a[i];

                int j;

                //loop over sorted subarray
                for(j = i; j >0 && a[j -1] > temp; j--){
                    a[j] = a[j-1];
                }

                a[j] = temp;
            }

            return a;
    }
}
