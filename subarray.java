//import math;

public class subarray {
    public static void subarray_print(int numbers[]){
        int max_sum = Integer.MIN_VALUE;
        
        for(int i = 0; i< numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length;j++){
                int end = j;
                int curr_sum = 0;

                
                for(int k = start; k<=end;k++){
                    curr_sum += numbers[k];
                    System.out.print(numbers[k]);
                    System.out.print(" ");
                    

                }
                System.out.println(curr_sum);
                if(max_sum<curr_sum){
                    max_sum= curr_sum;
                }
                System.out.println();

            }
            System.out.println();

        }
        System.out.println(max_sum);

    }
    public static void main(String[] args) {
        int numbers [] = {1,2,-3,4,5};
        subarray_print(numbers);

    }
    
}

