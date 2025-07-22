package Operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Initial value of a: " + a);

        a += 5; // a = a + 5
        System.out.println("After a += 5: " + a);

        a -= 3; // a = a - 3
        System.out.println("After a -= 3: " + a);

        a *= 2; // a = a * 2
        System.out.println("After a *= 2: " + a);

        a /= 4; // a = a / 4
        System.out.println("After a /= 4: " + a);

        a %= 3; // a = a % 3
        System.out.println("After a %= 3: " + a);

        a &= 2; // a = a & 2 (Bitwise AND)
        System.out.println("After a &= 2: " + a);

        a |= 4; // a = a | 4 (Bitwise OR)
        System.out.println("After a |= 4: " + a);

        a ^= 1; // a = a ^ 1 (Bitwise XOR)
        System.out.println("After a ^= 1: " + a);

        a <<= 1; // a = a << 1 (Left Shift)
        System.out.println("After a <<= 1: " + a);

        a >>= 1; // a = a >> 1 (Right Shift)
        System.out.println("After a >>= 1: " + a);
    }
}
