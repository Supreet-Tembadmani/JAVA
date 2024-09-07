/*
Question 1: Given an integer array nums, return true if any 
value appears at least twice in the array, and return false if 
every element is distinct.
 Example 1:
 Input: nums = [1, 2, 3, 1]
 Output: true */


public class arr_1 {

    public static boolean checker(int[]array){
        boolean flag = false;
        int count = 0;
        for(int i=0; i<array.length;i++){
            if(count > 0){
                flag = true;
                break;
            }
            for(int j = i+1; j< array.length;j++){
                int num = array[i];
                    if(array[j]==num){
                        count++;
                    }
                    
                

            }
    }
        return flag;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1};
        int[] array1 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(checker(array));
        System.out.println(checker(array1));

    }

}
