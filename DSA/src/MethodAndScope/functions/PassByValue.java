package MethodAndScope.functions;

import java.util.Scanner;

public class PassByValue {
    static void print(String username, int userage){
        System.out.println("Your name is " + username);
        System.out.println("Your age is " + userage);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name:");
        String name = sc.nextLine();
        System.out.print("Enter you Age:");
        int age = sc.nextInt();
        // Passing the String and integer
        print(name, age);
    }
}
