/*
 Given an array arr[] of distinct elements size N that is sorted and then rotated around an unknown point,
  the task is to check if the array has a pair with a given sum X.
  Input: arr[] = {11, 15, 26, 38, 9, 10}, X = 35
Output: true
Explanation: There is a pair (26, 9) with sum 35

Input: arr[] = {11, 15, 26, 38, 9, 10}, X = 45
Output: false
 */

 public class SumPair {
    public static Boolean func(int[] arr, int x){
        int n = arr.length;

        // Find the pivot point
        int pivot = -1;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                pivot = i;
                break;
            }
        }

        // If there's no pivot, the array is not rotated
        if (pivot == -1) {
            pivot = n - 1;
        }

        // Pointers
        int left = (pivot + 1) % n;  // smallest element
        int right = pivot;           // largest element

        while (left != right) {
            int sum = arr[left] + arr[right];

            if (sum == x) {
                return true;
            }

            // Move the pointers
            if (sum < x) {
                left = (left + 1) % n;
            } else {
                right = (right - 1 + n) % n;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = {11, 15, 26, 38, 9, 10};
        System.out.println(func(arr, 35)); // Output: true
        System.out.println(func(arr, 45)); // Output: false
    }
}
