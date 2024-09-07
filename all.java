/*
 * Question : Use the following sorting algorithms to sort an array in DESCENDING order :
a. Bubble Sort
b. Selection Sort
c. Insertion Sort
d. Counting Sort
You can use this array as an example : [3, 6, 2, 1, 8, 7, 4, 5, 3, 1]
 */

public class all {

    public static void bubbleSort(int[]arr){
        //int grt = Integer.MIN_VALUE;
        for(int i =0; i<arr.length-1;i++){
            for(int j = 0; j<arr.length-1-i;j++){
                int temp = 0;
            if(arr[j]>arr[j+1]){
                temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }


            }
        }
        for(int k =0; k<arr.length;k++){
            System.out.print(arr[k] + " ");
        }

    }
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        bubbleSort(arr);

    }
    
}
