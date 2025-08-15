package MethodAndScope.functions;

import java.util.Scanner;

public class ReturnSum {
    static int sumTwo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter second number:");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args)   {
        int result = sumTwo();
        System.out.println("Sum = " + result);
    }
}
