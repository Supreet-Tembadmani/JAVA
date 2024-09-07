/*
 * Question 3: You are given an array prices where prices[i] is the price of a given stock on
the ith day.
Return the maximum profit you can achieve from this transaction. If you cannot
achieve any profit, return 0.
Example 1:
Input: prices = [7, 1, 5, 3, 6, 4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because
you must buy before you sell.
 */



public class arr3 {

    public static int max_profit(int[]prices){

        int buy = 0;
        int sell = 0;
        int max_profit = 0;

        for(int i =0; i<prices.length; i++){
            buy = prices[i];
            int profit = 0;
            for(int j = i+1; j<prices.length;j++){
                sell = prices[j];
                if((sell - buy)>profit){
                    profit = sell - buy;
                }
            }
            if(profit>max_profit){
                max_profit = profit;
            }
        }
        return max_profit;





    }

    public static void main(String[] args) {
        int[]prices = {7, 1, 5, 3, 6, 4};
        System.out.println(max_profit(prices));
        
    }
    
}
