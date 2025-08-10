package MethodAndScope.functions;

import java.util.Arrays;

public class ChangeValue {
    // Method to modify elements in the array
    static void change(int[] nums) {
        // Changing the first element of the array to 10
        nums[0] = 10;

        // Changing the fifth element (index 4) of the array to 30
        nums[4] = 30;
    }

    public static void main(String[] args) {
        // Initializing an array with values
        int[] arr = {1, 3, 4, 5, 6};

        // Calling the change method, which modifies the elements of the array
        change(arr);

        // Printing the modified array using Arrays.toString() to display its contents
        System.out.println(Arrays.toString(arr));
        // Output will be: [10, 3, 4, 5, 30]
    }
}
