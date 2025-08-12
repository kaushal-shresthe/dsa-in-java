package MethodAndScope.VariableArguments;

import java.util.Arrays; // Importing Arrays class to use the toString() method

public class VariableArguments {
    public static void main(String[] args) {
        // Calling the 'fun' method with multiple integer arguments
        fun(1, 2, 3, 4, 5, 5);
    }

    // Method using varargs (variable-length arguments)
    static void fun(int ...v) {
        // The ... (ellipsis) allows the method to accept a variable number of arguments.
        // The parameter 'v' can accept any number of integers as an array

        // Printing the array of passed arguments using Arrays.toString()
        System.out.println(Arrays.toString(v));
    }
}
