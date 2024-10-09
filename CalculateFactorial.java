public class CalculateFactorial {
        // Method to calculate the factorial of a given number
        public static int calculateFactorial(int number) {
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i; // Multiply current number with the factorial
            }
            return factorial; // Return the calculated factorial
        }
        public static void main(String[] args) {
            int number = 5;
            // Calculate the factorial using the method
            int result = calculateFactorial(number);
            // Print the result
            System.out.println("Factorial of " + number + " is: " + result);
        }
    }
