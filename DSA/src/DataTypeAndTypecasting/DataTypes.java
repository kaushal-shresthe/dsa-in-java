package DataTypeAndTypecasting;

public class DataTypes {
    public static void main(String[] args) {
        // Integer types
        byte byteValue = 127;         // Range: -128 to 127
        short shortValue = 32000;      // Range: -32,768 to 32,767
        int intValue = 2147483647;     // Range: -2,147,483,648 to 2,147,483,647
        long longValue = 9223372036854775807L; // Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        // Floating-point types
        float floatValue = 3.14f;      // Stores up to 7 decimal digits
        double doubleValue = 3.141592653589793; // Stores up to 15-16 decimal digits

        // Character type
        char charValue = 'A';          // Stores a single character

        // Boolean type
        boolean booleanValue = true;   // Can be true or false

        // Printing values
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Integer Value: " + intValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Character Value: " + charValue);
        System.out.println("Boolean Value: " + booleanValue);
    }
}
