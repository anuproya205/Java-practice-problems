import java.util.Scanner;

public class MaxMinExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for three integer variables
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Finding the maximum value
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        // Finding the minimum value
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }

        // Displaying the maximum and minimum values
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

        scanner.close();
    }
}
