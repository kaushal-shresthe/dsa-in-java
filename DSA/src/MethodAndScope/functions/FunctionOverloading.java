package MethodAndScope.functions;
class FunctionOverloading {

    // Method 1: No parameters
    void display() {
        System.out.println("No parameters method");
    }

    // Method 2: One integer parameter
    void display(int a) {
        System.out.println("Integer parameter: " + a);
    }

    // Method 3: Two integer parameters
    void display(int a, int b) {
        System.out.println("Two integers: " + a + " and " + b);
    }

    // Method 4: One double parameter
    void display(double a) {
        System.out.println("Double parameter: " + a);
    }

    // Method 5: String Parameter
    void display(String greet) {
        System.out.println("String parameter: " + greet);
    }
    public static void main(String[] args) {
        FunctionOverloading obj = new FunctionOverloading();

        // Calling overloaded methods
        obj.display();          // Calls method 1
        obj.display(10);        // Calls method 2
        obj.display(5, 15);     // Calls method 3
        obj.display(7.5);       // Calls method 4
        obj.display("Hello sir");       // Calls method 5

    }
}
