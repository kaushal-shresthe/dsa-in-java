package ArrayAndArraylist.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        // Creating a 2D ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Initialize the 2D ArrayList with empty lists
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());   // Creating and adding empty lists (rows)  [ [], [], [] ]
        }

        // Taking input for the 2D list
        System.out.println("Enter 3x3 matrix values:");
        for (int i = 0; i < 3; i++) {  // Rows
            for (int j = 0; j < 3; j++) {  // Columns
                list.get(i).add(sc.nextInt()); // Adding input values
            }
        }

        // Display the 2D ArrayList
        System.out.println("2D ArrayList:");
        for (ArrayList<Integer> row : list) {
            System.out.println(row);
        }

        sc.close();
    }
}
