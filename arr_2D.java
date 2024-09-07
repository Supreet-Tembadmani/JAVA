/*
 * Question 1 : Print the number of 7’s that are in the 2d array. Example :
Input - int[][] array = { {4,7,8},{8,8,7} }; 
Output - 2
 */

public class arr_2D {
    public static int count(int[][]arr,int num){
        int count = 0;
        for(int i =0; i< arr.length;i++){
            for(int j=0;j<arr[1].length;j++){
                if(arr[i][j] == num){
                    count++;
                }

            }
        }
        return count;

    }
    public static void main(String[] args) {
        int[][] arr = { {4,7,8},{8,8,7} };
        int num = 8;
        System.out.println(count(arr, num));
    }
    
}
