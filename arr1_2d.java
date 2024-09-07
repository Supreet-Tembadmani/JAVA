/*
 * Question 2 : Print out the sum of the numbers in the second row of the “nums” array. 
 * Example :
Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} }; Output - 18
 */

public class arr1_2d {
    public static int sum(int[][]arr){
        int sum = 0;
        for(int i =0; i< arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==1){
                    sum += arr[i][j];
                }

            }
        }
        return sum;

    }
    public static void main(String[] args) {
        int[][] arr = { {1,4,9},{11,4,3} };
        
        System.out.println(sum(arr));
    }
    
}
