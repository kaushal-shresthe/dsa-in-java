package Operators;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10, b = 20;

        // Using the ternary operator to find the maximum number
        int max = (a > b) ? a : b;
        System.out.println("Maximum value: " + max);

        // Using the ternary operator to check if a number is even or odd
        String result = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println("a is " + result);

        // Using the ternary operator for multiple conditions
        int num = -5;
        String check = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
        System.out.println("Number is: " + check);
    }
}
