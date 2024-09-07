public class InversionPair {
    public static int Inversion_Pair(int[] arr, int i) {
        int n = arr.length;
        int c = 0;
        
        // Loop through all elements to the right of i
        for (int j = i + 1; j < n; j++) {
            if (arr[i] > arr[j]) {
                c++;
            }
        }
        
        // Base case: If i reaches the last element, return the count
        if (i == n - 1) {
            return c;
        }
        
        // Recursive call: Add the count for the current i to the result of the next i
        return c + Inversion_Pair(arr, i + 1);
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 20, 6, 4, 5};
        System.out.println(Inversion_Pair(arr, 0)); // Output should be 5
    }
}
