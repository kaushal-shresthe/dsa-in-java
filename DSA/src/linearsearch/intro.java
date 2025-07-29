package linearsearch;

public class intro {

    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;
        boolean ans = containsElement(nums, target);
        System.out.println(ans);
    }

    // Search in the array: return the index if item found
    // Otherwise, if item not found, return -1
    static int findIndex(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // Run a for loop
        for (int index = 0; index < arr.length; index++) {
            // Check for element at every index if it is equal to the target
            if (arr[index] == target) {
                return index;
            }
        }
        // This line will execute if none of the return statements above have executed
        // Hence, the target is not found
        return -1;
    }

    // Search the target and return the element itself
    static int findElement(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // Run a for loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        // This line will execute if none of the return statements above have executed
        // Hence, the target is not found
        return -1;
    }

    // Search the target and return true or false
    static boolean containsElement(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        // Run a for loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        // This line will execute if none of the return statements above have executed
        // Hence, the target is not found
        return false;
    }
}
