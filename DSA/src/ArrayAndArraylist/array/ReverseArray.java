package array;

import java.util.Arrays;

public class ReverseArray {
    static void Reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Reverse(arr);
        System.out.println(Arrays.toString(arr));  // Expected Output: [6, 5, 4, 3, 2, 1]
    }
}
