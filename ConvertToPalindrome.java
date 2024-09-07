/*The function accepts the string str. Implement the function to find and return the minimum characters 
required to append at the end of string str to make it palindrome
Assumption
1.String will contain only lower case English alphabets. 2.Length of string is greater than or equal to 1
Note:
1. If string is already palindrome return “NULL”.
2. You have to find the minimum characters required to append at the end of string to make it palindrome.
Example:
Sample Input
abcdc
Sample Output
ba
Explanation: If we append ‘ba’ at the end of the string ‘abcdc’ it becomes abcdcba i.e. a palindrome. */

public class ConvertToPalindrome {
    public static String ConvertPalindrome(String a){
        if(Check_Palindrome(a)){
            return "NULL";
        }
        StringBuilder toAppend = new StringBuilder();

        // Iterate through the string and find the minimum suffix to append
        for (int i = 0; i < a.length(); i++) {
            // Check if the current substring (from index i to the end) is a palindrome
            if (Check_Palindrome(a.substring(i))) {
                break; // Break if a palindrome is found
            }
            // Prepend the current character to the result
            toAppend.insert(0, a.charAt(i));
        }

        return toAppend.toString();
    }

        

    
    public static Boolean Check_Palindrome( String a){
        int l=0; int r = a.length()-1;
        if(a.charAt(r)!= a.charAt(l)){
            return false;
        }
        while(l< r){
            if(a.charAt(r)== a.charAt(l)){
                l++;
                r--;
            }
            if(a.charAt(r)!= a.charAt(l)){
                return false;
            }

            



        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(ConvertPalindrome("abcdc"));
    }
    
}
