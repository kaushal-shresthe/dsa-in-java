package Input;

import java.util.Scanner;

public class ReadCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Character:");

        char ch = sc.next().charAt(0);
        System.out.println("Character is:" + ch);

        if(ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
    }
}
