/*
 * Question 5: Given an integer array nums, return all the triplets [nums[i], nums[j],
nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.
Example 1:
Input: nums = [-1, 0, 1, 2,-1,-4]
Output: [ [-1, -1, 2] , [-1, 0, 1] ]
 */
public class arr_4 {

    public static void ret_triplets(int[]nums){

        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i + 1; j < nums.length-2; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (i != j && i != k && j != k && (nums[i] + nums[j] + nums[k] == 0)) {
                        System.out.println("[" + nums[i] + ", " + nums[j] + ", " + nums[k] + "]");
                    }
                }
            }
        }
        

    }
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2,-1,-4};
        ret_triplets(nums);

        
    }





    
}
