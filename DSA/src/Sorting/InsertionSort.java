package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        // Initializing an unsorted array
        int[] arr = {19, 17, 12, 43, 11, 2, 16, 14};

        // Printing the sorted array
        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int sorted = arr[i];
            for (int j = i+1; j > 0; j-- ){
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }
}