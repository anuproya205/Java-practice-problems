public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // Initialize counters for even and odd numbers
        int evenCount = 0;
        int oddCount = 0;
       // Iterate through the array
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++; 
            } else {
                oddCount++; 
            }
        }
        //print result
        System.out.println("Total Even Numbers: " + evenCount);
        System.out.println("Total Odd Numbers: " + oddCount);
    }
}
