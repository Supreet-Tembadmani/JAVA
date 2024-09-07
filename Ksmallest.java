/*
 Given an array arr[] and an integer k where k is smaller than the size of the array,
  the task is to find the kth smallest element in the given array.
  It is given that all array elements are distinct.
  Input:
n = 6
arr[] = 7 10 4 3 20 15
k = 3
l=0 r=5

Output : 
7

Explanation :
3rd smallest element in the given 
array is 7.
 */
import java.util.Arrays;
public class Ksmallest {
    public static int func(int arr[], int a){
        Arrays.sort(arr);
        return arr[a-1];
    
}
public static void main(String[] args) {
    int arr[] = {7 ,10, 4, 3, 20, 15};

    int k = 3;
    System.out.println(func(arr, k));

    
}
}
