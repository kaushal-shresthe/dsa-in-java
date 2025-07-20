package Input;

import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number:");
        int num_1 = sc.nextInt();

        System.out.print("Enter the second number:");
        int num_2= sc.nextInt();

        int sum = num_1 + num_2;

        System.out.println("Sum of" + " " + num_1 + " " + "and" + " " + num_2 + " " + "is" + " " + sum);


    }
}
