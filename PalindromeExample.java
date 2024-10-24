import java.util.Scanner;

public class PalindromeExample {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();

        // Call the function to check if the input string is a palindrome
        boolean isPalindrome = isPalindrome(input);

        // Display the result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }
      // Close the scanner object
        scanner.close();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Step 1: Convert the string to lowercase to ignore case sensitivity
        str = str.toLowerCase();
       // Step 2: Initialize two pointers, one at the start and the other at the end of the string
        int left = 0;
        int right = str.length() - 1;

        // Step 3: Loop to check characters from both ends
        while (left < right) {
            // Skip spaces (or any unwanted characters) by moving the pointers
            if (str.charAt(left) == ' ') {
                left++;
                continue;
            }
            if (str.charAt(right) == ' ') {
                right--;
                continue;
            }

            // Compare the characters at both ends
            if (str.charAt(left) != str.charAt(right)) {
                // If characters don't match, it's not a palindrome
                return false;
            }

            // Move the pointers towards the center
            left++;
            right--;
        }
        
        // If all characters match, it's a palindrome
        return true;
    }
}
