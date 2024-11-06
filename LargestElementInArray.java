public class LargestElementInArray{
public static void main(String args[]){
// Initialize an array of integers
  int[] arr = {12, 35, 1, 10, 34, 1};
// Call the method to find the largest element
        int largest = findLargest(arr);

        // Output the largest element
        System.out.println("The largest element in the array is: " + largest);
}
// Method to find the largest element in an array
public static int findLargest(int[] array) {
// Assume the first element is the largest
        int max = array[0];
// Loop through the array to compare each element with the current largest

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
// Return the largest element found
        return max;
    }

}
