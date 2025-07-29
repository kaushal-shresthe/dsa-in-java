package linearsearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,7};
        int target = 5;
        System.out.println(find(arr, target));
    }

//    Find number from the range of 1 to 5 index
    static int find(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // Run a for loop
        for (int index = 1; index < 6; index++) {
            // Check for element at every index if it is equal to the target
            if (arr[index] == target) {
                return index;
            }
        }
        return -1;
    }
}

