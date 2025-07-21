public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10 , b = 20 , c = 30;

//        && Operator
        System.out.println((a>b) && (a<c) && (c>b));  // false
        System.out.println((a<b) && (a<c) && (c>b));  // true

//        || Operators
        System.out.println((a>b) || (a>c) || (c>b));  // true
        System.out.println((a>b) || (a>c) || (c<b));  //false

//        ! Operator
        System.out.println(!(a>b)); //true

        System.out.println(((a>b) || (a<c)) && (c>b));  //true
        System.out.println(((a>b) && (a<c)) || (c>b));  //true
        System.out.println(((a>b) && (a<c)) || (b>c));  //false
        System.out.println(!((a>b) || (b<c)) && (c>b));  //false



    }
}
