package linearsearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {34, 56, 23, 12, 89, 34, 11, 45, 67, 90};
        System.out.println(findMin(arr)); // Calling the method and printing the minimum value
    }

    // Method to find the minimum value in an array
    public static int findMin(int[] arr) {
        int letmin = arr[0]; // Assume the first element is the smallest

        // Iterate through the array to find the actual minimum
        for (int i = 1; i < arr.length; i++) {
            if (letmin > arr[i]) { // Compare letmin with the current element
                letmin = arr[i]; // Update letmin if a smaller value is found
            }
        }
        return letmin; // Return the smallest element
    }
}
