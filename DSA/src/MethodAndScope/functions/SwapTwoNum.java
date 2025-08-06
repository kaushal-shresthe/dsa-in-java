package MethodAndScope.functions;

import java.util.Scanner;

public class SwapTwoNum {
    // Method to swap two numbers
    static void swap(int a, int b) {
        // Temporary variable to store the value of 'a' while swapping
        int temp = a;

        // Swap values of 'a' and 'b'
        a = b; // Now 'a' takes the value of 'b'
        b = temp; // Now 'b' takes the original value of 'a'

        // No return statement here because the method has a void return type
    }

    public static void main(String[] args) {
        // Scanner to take input from the user
        Scanner sc = new Scanner(System.in);

        // Asking the user to enter the first number
        System.out.print("Enter first number:");
        int num1 = sc.nextInt();

        // Asking the user to enter the second number
        System.out.print("Enter second number:");
        int num2 = sc.nextInt();

        // Call the swap method (note: it doesn't change the values of num1 and num2)
        swap(num1, num2);

        // Printing the numbers after swap (they will not change because primitives are passed by value)
        System.out.println("first number: " + num1 + " " + " Second number: " + num2);
    }
}
