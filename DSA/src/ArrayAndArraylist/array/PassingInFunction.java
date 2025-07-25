package ArrayAndArraylist.array;

import java.util.Arrays;

public class PassingInFunction {

    // Method to modify integer array
    static void changeIntArray(int[] arr) {
        arr[0] = 99; // Modifying the first element
        arr[arr.length - 1] = 100; // Modifying the last element
    }

    // Method to modify string array
    static void changeStringArray(String[] arr) {
        arr[0] = "Modified"; // Modifying the first element
        arr[arr.length - 1] = "Updated"; // Modifying the last element
    }

    public static void main(String[] args) {
        // Integer Array
        int[] nums = {1, 3, 4, 52, 4};
        System.out.println("Original Integer Array: " + Arrays.toString(nums));
        changeIntArray(nums);
        System.out.println("Modified Integer Array: " + Arrays.toString(nums));

        // String Array
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        System.out.println("\nOriginal String Array: " + Arrays.toString(names));
        changeStringArray(names);
        System.out.println("Modified String Array: " + Arrays.toString(names));
    }
}
