/*
 * Question 3 : Write a program to Find Transpose of a Matrix.
What is Transpose?
Transpose of a matrix is the process of swapping the rows to columns. For a 2x3 matrix,
a11 a12 a13
a21 a22 a23

  to

a11 a21 
a12 a22 
a13 a23
 */

public class arr2_2d {
    public static void Transpose(int[][]arr){
        int[][] trans = new int[arr[0].length][arr.length];
        for(int i =0; i< arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                trans[j][i] = arr[i][j];
               

            }
        }
        for(int i=0;i<trans.length;i++){
            for(int j=0;j<trans[0].length;j++)
            {
            System.out.print(trans[i][j] + " ");
        }
        System.out.println();
    }




    }
    public static void main(String[] args) {
        int[][] arr ={
            {1,2,3},
            {2,3,3}
        };
        Transpose(arr);
    }
    
}
