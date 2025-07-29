package linearsearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 2, 34, 56},
                {78, 54, 23},
                {45, 56, 5, 4, 67, 89},
                {1, 15, 6, 8, 9}
        };
        int target = 9;
        System.out.println(Arrays.toString(search(arr, target))); // Print the index or [-1, -1] if not found
    }

    // Method to search for a target value in a 2D array
    public static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) { // Loop through rows
            for (int j = 0; j < arr[i].length; j++) { // Loop through columns
                if (arr[i][j] == target) {
                    return new int[]{i, j}; // Return index position if found
                }
            }
        }
        return new int[]{-1, -1}; // Return [-1, -1] if target not found
    }
}
