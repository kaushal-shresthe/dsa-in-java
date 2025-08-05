package BinarySearch;

import java.util.Arrays;

public class RowColumnSearch {
    public static void main(String[] args) {
        int arr[][] = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50},
                {45,55,65,75}
        };

        int target = 49;

        System.out.println(Arrays.toString(search(arr, target)));

    }
    static int[] search(int[][] matirx, int target) {
        int row = 0;
        int column = matirx[0].length-1;
        while (row < matirx.length && column >= 0) {
            if (matirx[row][column] == target) {
                return new int[] {row, column};
            } else if (matirx[row][column] < target) {
                row++;
            } else {
                column--;
            }
        }
        return new int[] {-1, -1};
    }

}
