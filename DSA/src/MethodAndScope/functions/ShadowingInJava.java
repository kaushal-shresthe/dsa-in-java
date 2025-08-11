package MethodAndScope.functions;

class ShadowingInJava {
    // Instance variable (shadowed by local variable)
    int value = 50;

    void show() {
        // Local variable with the same name as instance variable
        int value; // This shadows the instance variable
//        System.out.println(value); This will give error because scope will begin when value is initialised
        value = 100;

        System.out.println("Local variable value: " + value); // Refers to local 'value'

        // Accessing instance variable using 'this' keyword
        System.out.println("Instance variable value: " + this.value);
    }

    public static void main(String[] args) {
        ShadowingInJava obj = new ShadowingInJava();
        obj.show();
    }
}
