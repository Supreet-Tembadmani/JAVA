/*The function accepts 3 positive integers ‘l’, 'u' and 'x' as its arguments. You are required to calculate the 
number of occurrences of a digit 'x' in the digits of numbers lying in the range between ‘I’ and 'u' both inclusive, 
and return the same.
Note:
• I<u
• 0<x<9
Example: Sample Input: I: 2
u: 13
x: 3
Sample Output: 2
Explanation: The number of occurrences of digit 3 in the digits of numbers lying in the range [2, 13] 
both inclusive is 2, ie (3, 13), hence 2 is returned.
Case 1: Input 2 13 3 Output 2
Case 2: Input 1 30 2 Output 13 */

public class CountDigiOoccurrences {
    public static int CountDigiOoccurr(int l, int u, int x){
        int count=0;
        for(int i = l; i<= u; i++){
            String s = String.valueOf(i);
            for(int j=0; j< s.length();j++){
                if(s.charAt(j) - '0'== x){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(CountDigiOoccurr(1 , 30, 2));
    }
    
}
