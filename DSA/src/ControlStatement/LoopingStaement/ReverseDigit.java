package ControlStatement.LoopingStaement;

public class ReverseDigit {
    public static void main(String[] args) {
        int digit = 123456789;
        int ans = 0;

        while (digit > 0) {
            int rem = digit % 10;
            //  System.out.print(rem);
            digit = digit / 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
    }
}
