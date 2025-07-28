package linearsearch;

public class FindMaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 2, 34, 56},
                {78, 54, 23},
                {45, 56, 5, 4, 67, 89},
                {1, 15, 6, 8, 9}
        };
        System.out.println("Maximum value: " + findMax(arr)); // Print the maximum value
    }

    // Method to find the maximum value in a 2D array
    public static int findMax(int[][] arr) {
        int max = Integer.MIN_VALUE; // Initialize max to the smallest possible integer

        for (int i = 0; i < arr.length; i++) { // Loop through rows
            for (int j = 0; j < arr[i].length; j++) { // Loop through columns
                if (arr[i][j] > max) {
                    max = arr[i][j]; // Update max if a larger value is found
                }
            }
        }
        return max; // Return the maximum value
    }
}

