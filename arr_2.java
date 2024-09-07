/* 
 Question 2: There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown
pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k],
nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For
example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and
become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the
index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.
*/

import java.util.Random;

public class arr_2 {
    public static int generateRandomNumber(int[]arr) {
        // Create a Random object
        int max = arr.length;
        Random random = new Random();
        
        // Generate a random number within the specified range
        int randomNumber = random.nextInt(max);
        
        return randomNumber;
    }
    public static void resulting_arr(int[] arr, int randomNumber){
        int [] rotated = new int[arr.length];
    
        int ind = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == randomNumber) {
                ind = i;
                break;
            }
        }
        for( int j = 0; j<arr.length;j++){
            rotated[j] = arr[(j+ind)%arr.length];
        }
        
        
        for(int i = 0; i< rotated.length; i++){
            System.out.println(rotated[i]);
        }
    




    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5,6,7};
        int r = generateRandomNumber(arr);
        //int r = 7;
        

        resulting_arr(arr, r);


    }
    
}
