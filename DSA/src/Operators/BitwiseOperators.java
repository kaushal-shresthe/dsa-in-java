public class BitwiseOperators {
    public static void main(String[] args) {
        int  a = 8, b = 12;
        System.out.println(a | b); //Bitwise OR Operator (Output:12)
        System.out.println(a & b); //Bitwise AND Operator (Output:8)
        System.out.println(a ^ b);  //Bitwise AND Operator (Output:4)

        System.out.println(a<<1); //Bitwise Left Shift Operator (Output:16)
        System.out.println(b>>1); //Bitwise Right Shift Operator (Output:6)

        System.out.println(a<<2); //Bitwise Left Shift Operator (Output:32)
        System.out.println(b>>2); //Bitwise Right Shift Operator (Output:3)
    }
}
