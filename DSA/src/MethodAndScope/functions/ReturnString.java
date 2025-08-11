package MethodAndScope.functions;

import java.util.Scanner;

public class ReturnString {

    static String greet() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write the message:");
        String message = sc.nextLine();
        return message;
    }
    public static void main(String[] args) {
        String get = greet();
        System.out.println(get);
    }
}
