import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the function to count vowels and consonants
        countVowelsAndConsonants(input);

        // Close the scanner object
        scanner.close();
    }

    // Method to count the number of vowels and consonants in a string
    public static void countVowelsAndConsonants(String str) {
        // Convert the input string to lowercase to handle case-insensitivity
        str = str.toLowerCase();

        // Initialize counters for vowels and consonants
        int vowelCount = 0;
        int consonantCount = 0;

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // Get the current character

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++; // Increment the vowel counter
            } 
            // Check if the character is a consonant (a letter that is not a vowel)
            else if (ch >= 'a' && ch <= 'z') {
                consonantCount++; // Increment the consonant counter
            }
        }

        // Print the results
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}
