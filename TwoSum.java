public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int l=0; int n = nums.length; int r = n-1; int min=0;int max =0;
        while(l<r){
            if(nums[r]>target){
                r--;
            }
            if(nums[l]>target){
                l++;
            }
            if(nums[l]+nums[r]==target){
                int[] indices = {l, r};
                return indices;
            }
            if(nums[l]+nums[r]<target){
                min = Math.min(nums[l],nums[r]);
                if(min==nums[l])
                {
                    l++;
                }
                else{r--;}
            }
            if(nums[l]+nums[r]>target){
                max = Math.max(nums[l],nums[r]);
                if(max==nums[l])
                {
                    l++;
                }
                else{r--;}
            }


        }

     return new int[0];   
    }
    
}
