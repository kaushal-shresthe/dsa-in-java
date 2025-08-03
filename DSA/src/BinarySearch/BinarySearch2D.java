package BinarySearch;

import java.util.Arrays;

public class BinarySearch2D {

    // Method to search in a 2D array using built-in function
    public static boolean search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            int index = Arrays.binarySearch(arr[i], target); // Built-in binary search

            if (index >= 0) {
                System.out.println("Element found at index (" + i + ", " + index + ")");
                return true;
            }
        }
        System.out.println("Element not found");
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 4, 7, 10},
                {12, 15, 18, 20},
                {22, 25, 30, 35}
        };
        int target = 15;
        search(arr, target);
    }

     // Manual binary search implementation
   /* public static int binarySearch(int[] row, int target) {
        int left = 0, right = row.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (row[mid] == target) {
                return mid; // Element found
            } else if (row[mid] < target) {
                left = mid + 1; // Search in right half
            } else {
                right = mid - 1; // Search in left half
            }
        }

        return -1; // Element not found
    }
    */
}
