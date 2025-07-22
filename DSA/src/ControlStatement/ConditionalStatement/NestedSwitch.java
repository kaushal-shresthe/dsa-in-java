import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for employee ID
        System.out.println("Enter Employee ID (1, 2, or 3):");
        int empID = sc.nextInt();

        // Switch based on empID
        switch (empID) {
            case 1:
                System.out.println("Kaushal");
                break;
            case 2:
                System.out.println("Jhon");
                break;
            case 3:
                System.out.println("Emp Number 3");

                // If empID is 3, ask for department
                System.out.println("Enter Department (IT or Management):");
                String department = sc.next();

                // Nested switch for department
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department found for Emp Number 3");
                }
                break;
            default:
                System.out.println("Invalid Employee ID! Please enter 1, 2, or 3.");
        }
    }
}
