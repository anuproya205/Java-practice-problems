// Find the Sum of All Elements in an Array
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
       // Calculate the sum of all elements
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
      // Output the result
        System.out.println("The sum of all elements in the array is: " + sum);
      scanner.close();
    }
}
