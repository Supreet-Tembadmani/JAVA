/* Remove duplicates from a sorted array
ex : array = {1,1,2,3,3,4}
     o/p = {1,2,3,4} 
*/


public class arr5 {
    public static void rem_dup(int[] arr){
        int[] op = new int[arr.length];
        int g = 1;
        for(int i=0; i<arr.length;i++){
            if(i==0){
                op[i]= arr[i];
            }
            for(int j = i+1; j<arr.length;j++){
                
                 if(arr[i]!= arr[j]) {
                    op[g] = arr[j];
                    while(g<arr.length-1){
                        g++;
                    }
                }
            }
        }
        // int g = 1; // Index for the modified array

        // // Traverse the array
        // for (int i = 1; i < arr.length; i++) {
        //     // If the current element is different from the previous one, add it to the modified array
        //     if (arr[i] != arr[g - 1]) {
        //         arr[g++] = arr[i];
        //     }
        // }
    
        // Print the modified array without duplicates
        for (int k = 0; k < g; k++) {
            System.out.print(arr[k] + " ");
        }
    }
    
    public static void main(String[] args) {
        int []arr = {1,1,2,3,3,4};
        rem_dup(arr);
    }


    
}
