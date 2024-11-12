public class ReverseArray {
   
public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Original array
        int n=arr.length-1; // Last index of the array
        int temp=0;
  for(int i=0;i<=n/2;i++){
    temp=arr[i];
    arr[i]=arr[n-i];
    arr[n-i]=temp;
  }
  for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]+"\t")
  }
}
