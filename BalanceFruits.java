/*
If'a'>'m',then buy(a-m)mangoes at the rate of Rs1 per mango.
• If'a'<'m',then sell(m-a)mangoes at the rate of Rs1 per mango. Return the total rupees left with you after balancing the fruits.
Assumption:
• a>=0,m>=0andrs>=0
• rs>=(a-m)
Note: If a = m, return rs unchanged
Example Sample Input a:8
m:4
Rs : 6
Sample Output
2
 */
public class BalanceFruits {
    public static int Balance_Fruits(int a, int m, int rs ){
        while ((a-m) >0) {
            if((a-m)==0){
                break;
                
            }
            m++; rs--;
        }
        while ((m-a) >0) {
            if((a-m)==0){
                break;
                
            }
            m--; rs++;
        }
        return rs;

    }
    public static void main(String[] args) {
        System.out.println(Balance_Fruits(8, 4, 6));
        System.out.println(Balance_Fruits(7, 4, 6));
        System.out.println(Balance_Fruits(5, 7, 6));


    }
    
}
