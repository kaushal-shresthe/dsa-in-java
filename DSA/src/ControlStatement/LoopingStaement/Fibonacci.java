package ControlStatement.LoopingStaement;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int a = 0, b = 1;

        // Print the first two Fibonacci numbers
        System.out.print(a + " ");
        if (n > 1) {
            System.out.print(b + " ");
        }

        int count = 2;
        while (count < n) {
            int next = a + b;
            a = b;
            b = next;
            System.out.print(b + " ");
            count++;
        }
    }
}