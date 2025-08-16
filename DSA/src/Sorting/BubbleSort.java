package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // Initializing an unsorted array
        int[] arr = {19, 17, 12, 43, 11, 2, 16, 14};

        // Printing the sorted array
        System.out.println(Arrays.toString(sort(arr)));
    }

    // Optimized Bubble Sort function
    static int[] sort(int[] arr) {
        int length = arr.length - 1;  // Getting the last index of the array

        // Outer loop runs for (n-1) passes
        for (int i = 0; i < length; i++) {
            boolean swap = false;  // Reset swap flag at the start of each pass

            // Inner loop for comparing adjacent elements
            for (int j = 0; j < (length - i); j++) {
                if (arr[j] > arr[j + 1]) {  // Swap if the current element is greater than the next
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;  // Mark swap as true
                }
            }

            // If no swaps occurred, the array is already sorted, so exit early
            if (!swap) {
                break;
            }
        }
        return arr;  // Returning the sorted array
    }
}
