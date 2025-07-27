package ArrayAndArraylist.multidimensionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][2];


        // Taking the input
        for (int row = 0; row < arr.length; row++){
            // When try to access the array length it give the number of the rows
            for (int col = 0; col < arr[row].length; col++) {
                arr [row][col] =  sc.nextInt();
            }
        }

        // print the array
        for (int row = 0; row < arr.length; row++){
            // When try to access the array length it give the number of the rows
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr [row][col]);
            }
//            printing new line
            System.out.println();

        }
//           OR
//        print the array
        for (int row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
//        OR

//        print the array using the enhance for loop
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }

    }
}
