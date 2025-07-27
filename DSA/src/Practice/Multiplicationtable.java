package Practice;

import java.util.Scanner;

public class Multiplicationtable {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Multiplication Table of " + num);
        for(int i = 1; i <= 10; i++) {
            System.out.println(i + "*" + num + "=" + i * num);
        }
    }
}
