import java.util.Scanner;

public class CheckAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age:");
        int age = sc.nextInt();
        if (age <= 12) {
            System.out.println("You are Child.");
        } else if (age < 18) {
            System.out.println("You are Teenager.");
        } else {
            System.out.println("You are Adult.");
        }
    }
}
