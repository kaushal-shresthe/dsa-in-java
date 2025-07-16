package DataTypeAndTypecasting;

public class TypeCasting {
    public static void main(String[] args) {
        // ======= Widening (Implicit Casting) =======
        byte byteValue = 10;
        short shortValue = byteValue;   // byte → short
        int intValue = shortValue;      // short → int
        long longValue = intValue;      // int → long
        float floatValue = longValue;   // long → float
        double doubleValue = floatValue; // float → double

        System.out.println("Widening (Implicit Casting):");
        System.out.println("Byte to Short: " + shortValue);
        System.out.println("Short to Int: " + intValue);
        System.out.println("Int to Long: " + longValue);
        System.out.println("Long to Float: " + floatValue);
        System.out.println("Float to Double: " + doubleValue);

        // ======= Narrowing (Explicit Casting) =======
        double largeDouble = 585.567895432754;
        float narrowFloat = (float) largeDouble; // double → float
        long narrowLong = (long) narrowFloat;   // float → long
        int narrowInt = (int) narrowLong;       // long → int
        short narrowShort = (short) narrowInt;  // int → short
        byte narrowByte = (byte) narrowShort;   // short → byte

        System.out.println("\nNarrowing (Explicit Casting):");
        System.out.println("Double to Float: " + narrowFloat);
        System.out.println("Float to Long: " + narrowLong);
        System.out.println("Long to Int: " + narrowInt);
        System.out.println("Int to Short: " + narrowShort);
        System.out.println("Short to Byte: " + narrowByte);

        // ======= Automatic type promotion in expressions======
        int x = 130;
        byte y = (byte) x; // 130 % 256 = 130 (since 130 is within range)

        int p = 260;
        byte q = (byte) p; // 260 % 256 = 4

        System.out.println(y); // Output: -126
        System.out.println(q); // Output: 4


        // Declare three byte variables
        byte a = 40;
        byte b = 50;
        byte c = 100;

        // a * b = 40 * 50 = 2000, which is automatically promoted to int
        // Then 2000 / c = 2000 / 100 = 20
        int d = (a * b) / c;  // Implicit promotion to int during multiplication

        // Print the result
        System.out.println(d);  // Output: 20


        // Assigning character 'A' to an int variable.
        // The char 'A' is automatically converted to its ASCII value 65.
        int num1 = 'A';  // ASCII value = 65

        // Assigning character 'a' to an int variable.
        // The char 'a' is automatically converted to its ASCII value 97.
        int num2 = 'a';  // ASCII value = 97

        // Assigning character '0' to an int variable.
        // The char '0' is automatically converted to its ASCII value 48.
        int num3 = '0';  // ASCII value = 48

        // Assigning character '$' to an int variable.
        // The char '$' is automatically converted to its ASCII value 36.
        int num4 = '$';  // ASCII value = 36

        // Print the integer values of the characters
        System.out.println(num1); // Output: 65
        System.out.println(num2); // Output: 97
        System.out.println(num3); // Output: 48
        System.out.println(num4); // Output: 36
    }
}

