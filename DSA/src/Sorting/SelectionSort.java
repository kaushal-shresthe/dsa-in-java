import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        // Initializing an unsorted array
        int[] arr = {19, 17, 12, 43, 11, 2, 16, 14};

        // Printing the sorted array
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int minindex = i;
            for (int j = i+1; j < arr.length; j++ ) {
                if (arr[minindex] > arr[j]) {
                    minindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;
        }
        return arr;
    }

}

