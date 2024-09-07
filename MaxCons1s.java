/**
 * MaxCons1s
 */
public class MaxCons1s {

    public static int Maxcons(int[] arr){
        int max = 0;
        int left = 0;
        int right = arr.length -1;
        while (left<= right) {
            if(arr[left]!=1){
                
                left++;
                break;
            }
            
            if(arr[right]!=1){
                
                right--;
                break;
            }
            
            
        }
        return max;

    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        System.out.println(Maxcons(arr));
    }
}