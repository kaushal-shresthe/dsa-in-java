package BinarySearch;

import java.util.Arrays;

public class SortedMatrixSearch {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10,11,12},
                {13,14,25}
        };
        System.out.println(Arrays.toString(searchInSortedMatrix(matrix, 47)));
    }

    // Perform binary search on a specific row within given column range
    static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target) {
        while (colStart <= colEnd) {
            int midCol = colStart + (colEnd - colStart) / 2;
            if (matrix[row][midCol] == target) {
                return new int[]{row, midCol};
            }
            if (matrix[row][midCol] < target) {
                colStart = midCol + 1;
            } else {
                colEnd = midCol - 1;
            }
        }
        return new int[]{-1, -1}; // Target not found
    }

    // Search for the target in a sorted matrix
    static int[] searchInSortedMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 0 || cols == 0) {
            return new int[]{-1, -1}; // Handle empty matrix case
        }

        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rowStart = 0, rowEnd = rows - 1;
        int midCol = cols / 2;

        // Narrow down to two remaining rows
        while (rowStart < rowEnd - 1) { // Ensure more than 2 rows remain
            int midRow = rowStart + (rowEnd - rowStart) / 2;
            if (matrix[midRow][midCol] == target) {
                return new int[]{midRow, midCol};
            }
            if (matrix[midRow][midCol] < target) {
                rowStart = midRow;
            } else {
                rowEnd = midRow;
            }
        }

        // Check the middle column of the two remaining rows
        if (matrix[rowStart][midCol] == target) {
            return new int[]{rowStart, midCol};
        }
        if (matrix[rowStart + 1][midCol] == target) {
            return new int[]{rowStart + 1, midCol};
        }

        // Search in four quadrants
        if (target <= matrix[rowStart][midCol - 1]) {
            return binarySearch(matrix, rowStart, 0, midCol - 1, target); // Top-left quadrant
        }
        if (target >= matrix[rowStart][midCol + 1] && target <= matrix[rowStart][cols - 1]) {
            return binarySearch(matrix, rowStart, midCol + 1, cols - 1, target); // Top-right quadrant
        }
        if (target <= matrix[rowStart + 1][midCol - 1]) {
            return binarySearch(matrix, rowStart + 1, 0, midCol - 1, target); // Bottom-left quadrant
        }
        return binarySearch(matrix, rowStart + 1, midCol + 1, cols - 1, target); // Bottom-right quadrant
    }
}