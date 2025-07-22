package Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = -20;
        boolean flag = true;

        System.out.println("Initial value of a: " + a);
        System.out.println("Initial value of b: " + b);
        System.out.println("Initial value of flag: " + flag);

        // Unary Plus (+) [It doesn't change the value]
        System.out.println("Unary Plus (+a): " + (+a));

        // Unary Minus (-)
        System.out.println("Unary Minus (-b): " + (-b));

        // Increment Operator (++)
        System.out.println("Post-Increment (a++): " + (a++)); // prints 10, then a becomes 11
        System.out.println("After Post-Increment, a: " + a);
        System.out.println("Pre-Increment (++a): " + (++a)); // increments first, then prints 12

        // Decrement Operator (--)
        System.out.println("Post-Decrement (b--): " + (b--)); // prints -20, then b becomes -21
        System.out.println("After Post-Decrement, b: " + b);
        System.out.println("Pre-Decrement (--b): " + (--b)); // decrements first, then prints -22

        // Logical NOT (!)
        System.out.println("Logical NOT (!flag): " + (!flag));
    }
}
