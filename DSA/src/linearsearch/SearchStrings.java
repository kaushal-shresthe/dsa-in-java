package linearsearch;

import java.util.Arrays;

public class SearchStrings {
    public static void main(String[] args) {
        String dsa = "Data Structure"; // Sample string to search within
        char target = ' '; // Target character to search (a space in this case)

        // Calling search methods and printing results
        System.out.println(search(dsa, target));
        System.out.println(search2(dsa, target));
        System.out.println(Arrays.toString(dsa.toCharArray())); // Converting string to character array and printing
    }

    // Method to search for a character in a string using a for loop
    static boolean search(String str, char target) {
        if (str.length() == 0) { // Check for empty string
            return false;
        }

        // Iterate over the string and check if target character exists
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true; // Return true if found
            }
        }
        return false; // Return false if not found
    }

    // Alternative method using enhanced for-loop
    static boolean search2(String str, char target) {
        if (str.length() == 0) { // Check for empty string
            return false;
        }

        // Convert string to character array and iterate
        for(char ch : str.toCharArray()) {
            if (ch == target) {
                return true; // Return true if found
            }
        }
        return false; // Return false if not found
    }

}
