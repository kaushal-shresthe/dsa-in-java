package Input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();  // Reads an integer but leaves '\n' in the buffer

        System.out.print("Enter your name: ");
        String name = input.nextLine();  // Skips input because it reads the leftover '\n'

        System.out.println("Number: " + num);
        System.out.println("Name: " + name);
    }
}
