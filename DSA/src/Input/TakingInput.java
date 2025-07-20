package Input;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your lucky number: ");
        int num = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        System.out.println("Your lucky number is " + num);

        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.println("Your name is " + name);

        sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();
        System.out.println("Your full name is " + fullName);

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
