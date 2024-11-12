public class SmallestElementInArray{
public static void main(String args[]){
// Initialize an array of integers
  int[] arr = {12, 35, 1, 10, 34, 1};
        int smallest = findSmallest(arr);
        System.out.println("The smallest element in the array is: " + smallest);
}
// Method to find the smallest element in an array
public static int findSmallest(int[] array) {
        int min = array[0];
// Loop through the array to compare each element with the current smallest
    for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
}}
