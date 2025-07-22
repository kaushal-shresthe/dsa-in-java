import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            // Ask user to select an operation
            System.out.print("Select operation (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            double result = 0;

            // Perform the operation based on user input
            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {// Check for division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    continue;
                }
            } else {
                System.out.println("Invalid operator! Please enter +, -, *, or /.");
                continue;
            }

            // Display the result
            System.out.println("The result of " + num1 + " " + operator + " " + num2 + " is: " + result);

            // Ask user if they want to continue or exit
            System.out.println("Do you want to perform another calculation? (yes/no): ");
            String userChoice = sc.next();

            if (userChoice.equalsIgnoreCase("no")) {
                System.out.println("Exiting the Calculator");
                break;  // Exit the loop and end the program
            }
        }
    }
}
