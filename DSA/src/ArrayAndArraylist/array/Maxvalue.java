package ArrayAndArraylist.array;
public class Maxvalue {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 9, 18};

        System.out.println("Max in full array: " + max(arr)); // Expected: 18
        System.out.println("Max in range [1, 3]: " + maxRange(arr, 1, 3)); // Expected: 9
    }

    // Finds the maximum value in a given range (start to end index)
    static int maxRange(int[] arr, int start, int end) {
        if (arr == null || arr.length == 0) {
            return -1; // Handle null or empty array
        }

        if (start < 0 || end >= arr.length) {
            return -1; // Handle out-of-bounds cases
        }

        if (start > end) {
            int temp = start;  // Swap if start > end
            start = end;
            end = temp;
        }

        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    // Finds the maximum value in the entire array
    static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            return Integer.MIN_VALUE; // Meaningful value for an empty array
        }

        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
