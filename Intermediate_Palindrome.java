/**
Write a program such that it takes a lower limit and upper limit as inputs and print all the intermediate palindrome numbers.
Test Cases:
TestCase 1:
Input :
10 , 80
Expected Result:
11 , 22 , 33 , 44 , 55 , 66 , 77.
 */
public class Intermediate_Palindrome {
    public static void palindrome(int n1, int n2){
        int r = 0; int rem =0; 
        for(int i=n1; i<n2;i++){

            r = i;
            int rev =0;
            while(r!=0){
                rem = r%10;
                rev = rev*10 + rem;
                r= r/10;
            }
            if(rev==i){
                System.out.print(i + " ");
            }





            
        }

    }
    public static void main(String[] args) {
        palindrome(10, 80);
        
    }

    
}