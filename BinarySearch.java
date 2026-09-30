import java.util.Scanner;

public class BinarySearch {
 static int search(int[] arr, int low, int high, int key) {
 if (low > high) {
 return -1;
 }
 int mid = (low + high) / 2;
 if (arr[mid] == key) {
 return mid;
 }
 if (key < arr[mid]) {
 return search(arr, low, mid - 1, key);
 }
 return search(arr, mid + 1, high, key);
 }
 public static void main(String[] args) {
 int[] arr = {10, 20, 30, 40, 50, 60};
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter element: ");
 int key = sc.nextInt();
 int result = search(arr, 0, arr.length - 1, key);
 if (result != -1) {
 System.out.println("Element found at index " + result);
 } else {
 System.out.println("Element not found");
 sc.close();
 }
 }
}
