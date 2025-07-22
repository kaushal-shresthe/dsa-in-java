import java.util.Scanner;

public class CheckDivBy3_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = sc.nextInt();
        if (num %  3 == 0 || num % 5 == 0) {
            System.out.println(num + " " + "divisible by 3 or 5");
        }
        if (num %  3 == 0 && num % 5 == 0) {
            System.out.println(num + " " + "divisible by 3 and 5");
        }
    }
}
