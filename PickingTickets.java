/*Consider an array of n tickets prices, tickets. A number, m, is defined as the size of some subsequence, s,
 of tickets where each element covers an unbroken range of integers. That is to say if you were to sort 
 the elements in s, the absolute difference between any elements j and j+1 would be either 0 or 1. 
 Determine the maximum length of a subsequence chosen from the ticket array.
Example:
Tickets = [8,5,4,8,4]
Valid subsequences, sorted, are{4,4,5} and {8,8}.These subsequences have m, values of 3 and 2, respectively. Return 3. */
import java.util.*;

public class PickingTickets {
    public static int tickets(int[] a) {
        // Sort the array to ensure elements are in ascending order
        Arrays.sort(a); 

        int max_count = 1; // At least one element can always form a subsequence
        int current_count = 1; // Counter for the current valid subsequence

        // Iterate through the sorted array to find the longest valid subsequence
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1] || a[i] == a[i - 1] + 1) {
                // Continue counting if the current number is equal to the previous number
                // or is exactly 1 more than the previous number
                current_count++;
            } else if (a[i] > a[i - 1] + 1) {
                // Reset the current count when a larger gap is found
                current_count = 1; 
            }
            
            // Update the maximum length found
            max_count = Math.max(max_count, current_count);
        }

        return max_count;
    }

    public static void main(String[] args) {
        int[] Tickets = {8,5,4,8,4};
        System.out.println(tickets(Tickets)); // Expected output: 3
    }
}
