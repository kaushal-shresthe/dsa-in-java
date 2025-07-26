package ArrayAndArraylist.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Adding initial elements
        list.add(43);
        list.add(42);
        list.add(22);
        list.add(12);
        list.add(90);
        list.add(33);

        // Check if list contains 90
        System.out.println("Does list contain 90? " + list.contains(90));

        // Modify and remove elements
        list.set(0, 50);
        list.remove(4); // Removes element at index 4

        System.out.println("Updated list: " + list);

        // Taking input from user
        System.out.println("Enter 5 numbers to add to the list:");
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        // Display elements of the list
        System.out.println("Elements in the list:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        // Closing scanner
        sc.close();
    }
}
