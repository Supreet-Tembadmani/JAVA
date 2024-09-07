/*
The function accepts string “n” which is a number and checks whether the number is an autobiographical number or not. If it is, an integer is returned, i.e. the count of distinct numbers in ‘n’. If not, it returns 0.
Assumption:
● The input string will not be longer than 10 characters.
● Input string will consist of numeric characters.
Note:
If string is None return 0.
Example: Input:
n: “1210” Output: 3
 */
import java.util.*;
public class FindAutoCount {
    public static int autocount(String n){
        HashSet<Character> a = new HashSet<>();
        for (int i=0; i<n.length();i++) {
            a.add(n.charAt(i));
            
        } return a.size();

    }
    public static void main(String[] args) {
        System.out.println(autocount("1210"));
    }
    
}
