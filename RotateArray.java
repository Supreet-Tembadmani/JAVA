public class RotateArray {
    
        public static void rotate(int[] nums, int k) {
            int arr[] = new int[nums.length-k];
            for(int i=0;i<nums.length-k;i++){
                arr[i] = nums[i];
            }
            int j=0;
            for(int i=nums.length-k;i<nums.length;i++){
                
                nums[j] = nums[i];
                j++;
            }
            
            int b=0;
            for(int a=k;a<arr.length;a++){
                
                nums[a] = arr[b];
                b++;
            }
            prinarr(nums);
       }
        public static void prinarr(int[] arr){
            for(int i=0; i<arr.length;i++){
                System.out.print(arr[i] + " ");
                
            }

        }
        public static void main(String[] args) {
                int [] nums = {1,2,3,4,5,6,7}; int k = 3;
                rotate(nums,k);
                
        }
    }
    

