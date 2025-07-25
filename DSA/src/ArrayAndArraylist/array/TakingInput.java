package array;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of elements
        System.out.print("Enter how many numbers you want to store?: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        // Clearing the buffer after taking integer input
        sc.nextLine(); // This line fixes the issue when taking string input later

        // Taking integer inputs from the user
        for (int i = 0; i < num; i++) {
            System.out.print("Enter a number at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // Displaying the integer inputs
        System.out.println("\nStored Integer Values:");
        for (int i = 0; i < num; i++) {
            System.out.println("At index " + i + ": " + arr[i]);
        }

        // Clearing the buffer before taking string input
        sc.nextLine();

        // Taking string inputs from the user
        String[] name = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Enter a string at index " + i + ": ");
            name[i] = sc.nextLine();
        }

        // Displaying the string inputs
        System.out.println("\nStored String Values:");
        for (int i = 0; i < num; i++) {
            System.out.println("At index " + i + ": " + name[i]);
        }

//        Printing the array in simple ways without using the for loop
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(name));

        sc.close(); // Closing Scanner to prevent resource leak
    }
}
