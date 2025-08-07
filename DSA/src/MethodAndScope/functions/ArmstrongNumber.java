package MethodAndScope.functions;

public class ArmstrongNumber {

    // Method to print all Armstrong numbers from 1 to 1000
    static void printArmstrongNumbers() {
        for (int i = 1; i <= 1000; i++) {
            int temp = i;  // Store the original number for comparison
            int sum = 0;    // Variable to store the sum of cubes of digits
            int num = i;    // Copy of i to process digits

            // Extract digits and calculate the sum of their cubes
            while (num > 0) {
                int rem = num % 10;  // Get the last digit
                sum = sum + (rem * rem * rem);  // Cube the digit and add to sum
                num = num / 10;  // Remove the last digit
            }

            // Check if the sum of cubes of digits is equal to the original number
            if (sum == temp) {
                System.out.println(temp);
            }
        }
    }

    public static void main(String[] args) {
        printArmstrongNumbers();
    }
}
