public class SecondLargestElement{

    public static void main(String[] args) {
        // Initialize the array
        int[] arr = {1, 3, 7, 9, 2};
        
        // Call the method to find the second largest element
        int secondLargest = findSecondLargest(arr);
        
        // Output the result
        System.out.println("The second largest element in the array is: " + secondLargest);
    }

    // Method to find the second largest element in an array
    public static int findSecondLargest(int[] array) {
        // Initialize the largest and second largest elements
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        // Loop through the array to find the largest and second largest elements
        for (int i = 0; i < array.length; i++) {
            // If the current element is larger than the largest, update largest and second largest
            if (array[i] > largest) {
                secondLargest = largest;  // Update second largest to previous largest
                largest = array[i];       // Update largest to current element
            }
            // If the current element is smaller than the largest but larger than the second largest, update second largest
            else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }
        
        // Return the second largest element found
        return secondLargest;
    }
}

