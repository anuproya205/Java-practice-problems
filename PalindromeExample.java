import java.util.Scanner;

public class PalindromeExample {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();
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
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) == ' ') {
                left++;
                continue;
            }
            if (str.charAt(right) == ' ') {
                right--;
                continue;
            }
            if (str.charAt(left) != str.charAt(right)) {
                // If characters don't match, it's not a palindrome
                return false;
            }
            left++;
            right--;
        }
        
        // If all characters match, it's a palindrome
        return true;
    }
}
