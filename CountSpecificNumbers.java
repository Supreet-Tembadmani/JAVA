/* he function accept two arguments m and n which are integers. You are required to calculate the count of 
numbers having only 1, 4 and 9 as their digits between the numbers lying in the range m and n both inclusive, 
and return the same. Return -1 if m>n.
Example:
Sample Input:
100
200
Sample Output:
9
Explanation: The numbers between 100 and 200, both inclusive having only 1, 4 and 9 as their digits are
 111, 114, 119, 141, 144, 149, 191, 194, 199. The count is 9 hence 9 is returned.

 */

public class CountSpecificNumbers {
    public static int CountSpecificNum(int m, int n){
        int count=0;
        for(int i=m; i<=n;i++){
            int num=i; int rem=0; boolean chk=true;
            while(num>0){
                rem = num%10;
                if(rem != 1 && rem != 4 && rem != 9){
                    chk = false;
                    break;
                }
                num = num/10;

            }
            if(chk){
                count++;
            }
        }
        return count;


    }
    public static void main(String[] args) {
        System.out.println(CountSpecificNum(100, 200));
    }

    
}
