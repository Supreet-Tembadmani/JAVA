/*
The function accepts an integer 'num' as input. You have to implement the function such that it returns the 
number of contiguous integer fragments of 'num' that are divisible by 11. Contiguous integer fragments of a number,
say 1273, are:
Example: Input: 1215598 Output:
4
Explanation: 55, 121, 12155 and 15598 are contiguous fragments of the number 1215598 that are divisible by 11.
Case 1: Input 1215598 Output 5
 */
public class DivisibilityByEleven {
    public static int Divisibility_ByEleven(int num) {
        String numStr = String.valueOf(num);
        int count = 0;
        
        // Loop to get all possible substrings (contiguous fragments)
        for (int i = 0; i < numStr.length(); i++) {
            for (int j = i + 1; j <= numStr.length(); j++) {
                // Get the substring from i to j
                String fragment = numStr.substring(i, j);
                // Convert substring to integer
                int fragmentNum = Integer.parseInt(fragment);
                
                // Check if the fragment is divisible by 11
                if (fragmentNum % 11 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Divisibility_ByEleven(55)); // Output should be 5
    }
}
