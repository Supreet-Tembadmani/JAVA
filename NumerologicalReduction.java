/*Numerological reduction of a number is the sum of digits calculated recursively until the resulting value 
is a single digit.
You are given a function, int FindNumerologicalReduction(int n);
The function accepts a positive integer ‘n’. Implement the function to find and return the numerological 
reduction of ‘n’.
Assumption: n> = 0
Example: Sample Input: 3245
Sample Output: 5
Explanation:
3245 = 3+2+4+5 = 14
14 = 1+4 = 5 */
public class NumerologicalReduction {
    public static int FindNumerologicalReduction(int n){
        String a = String.valueOf(n);
        int sum =0;
        for(int i=0; i < a.length();i++){
            sum += a.charAt(i)-'0';
        }
        if(sum<10){
            return sum;
        }
        else{
            return FindNumerologicalReduction(sum);
        }
    }

    public static void main(String[] args) {
        System.out.println(FindNumerologicalReduction(3245));
    }
    
}
