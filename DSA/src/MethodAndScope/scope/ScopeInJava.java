package MethodAndScope.scope;

class ScopeInJava {
    // Instance variable (Object Scope)
    int instanceVar = 10;

    // Static variable (Class Scope)
    static int staticVar = 20;

    void methodScopeExample() {
        // Local variable (Method Scope)
        int localVar = 30;

        // Block Scope
        if (true) {
            int blockVar = 40; // Block-scoped variable
            System.out.println("Block variable: " + blockVar);
        }

        // blockVar is not accessible here
        System.out.println("Local variable: " + localVar);

        // Loop Scope
        for (int i = 0; i < 3; i++) {
            int loopVar = i * 10; // Loop-scoped variable
            System.out.println("Loop variable (Iteration " + i + "): " + loopVar);
        }

        // loopVar is not accessible here
        // System.out.println(loopVar);
    }

    public static void main(String[] args) {
        ScopeInJava obj = new ScopeInJava();

        obj.methodScopeExample();

        // Accessing instance variable
        System.out.println("Instance variable: " + obj.instanceVar);

        // Accessing static variable
        System.out.println("Static variable: " + ScopeInJava.staticVar);
    }
}
