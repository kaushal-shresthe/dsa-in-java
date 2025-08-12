package MethodAndScope.VariableArguments;
import java.util.Arrays;

public class MultipleVariableArgs {
    public static void main(String[] args) {
        // Calling the method with different numbers of arguments
        display("Kaushal", 1, 2, 3, 4, 5);
        display("Alice", 10, 20);
    }

    // Method with a regular parameter and varargs (varargs must be the last parameter)
    static void display(String name, int... numbers) {
        System.out.println("Name: " + name);
        System.out.println("Numbers: " + Arrays.toString(numbers));
    }
}
