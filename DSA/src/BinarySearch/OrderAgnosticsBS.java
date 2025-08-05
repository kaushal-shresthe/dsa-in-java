package BinarySearch;

public class OrderAgnosticsBS {
    public static void main(String[] args) {
//        int[] arr = {50, 45, 43, 32, 30, 29, 21, 10, 5, 4, -3, -10, -20};
        int[] arr = {-30, -20, -10, 0, 10, 20, 30, 40, 50, 60, 70};
        int target = 30;
        int ans = orderAgnosticsBS(arr, target);
        System.out.println(target + " is found at index " + ans);

    }

    static int orderAgnosticsBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

//        find the given array is ascending or descending order
        boolean isAsc = arr[start] < arr[end] ;
//        if (arr[start] < arr[end]) {
//            isAsc = true;
//        } else {
//            isAsc = false;
//        }
        while (start <= end) {
            // find the middle element
            // int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
