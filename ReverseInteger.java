import java.util.Scanner; // Import the Scanner class for user input

public class ReverseInteger {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt(); // Read the integer input from the user

        int reversed = 0; // Variable to store the reversed integer

        // Loop until num becomes 0
        while (num != 0) {
            // Get the last digit of the number
            int digit = num % 10;

            // Append the last digit to the reversed number
            reversed = reversed * 10 + digit;

            // Remove the last digit from the original number
            num /= 10;
        }

        // Output the reversed integer
        System.out.println("Reversed integer: " + reversed);
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
