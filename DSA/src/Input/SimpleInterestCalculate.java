package Input;

import java.util.Scanner;

public class SimpleInterestCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principle:");
        float p = sc.nextFloat();

        System.out.print("Enter rate of instrest:");
        float r = sc.nextFloat();

        System.out.print("Enter time:");
        float t = sc.nextFloat();

        float si = ( p*t*r)/100;

        System.out.println("Principle:" + p);
        System.out.println("Rate:" + r);
        System.out.println("Time:" + t);

        System.out.print("Simple Interest:" + si);

    }
}
