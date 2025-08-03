package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-30, -20, -10, 0, 10, 20, 30, 40, 50, 60, 70};
        int target = 40;
        int ans = binarysearch(arr, target);
        System.out.println(target + " is found at index " + ans );

    }
    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // find the middle element
            // int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}