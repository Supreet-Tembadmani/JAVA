// Write a program that reads a set of integers, and 
// then prints the sum of the even and odd integers.
import java.util.Scanner;
public class Loops_PQ1 {
   
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        System.out.println("Enter n  ");
        int n = b.nextInt();
        double even_sum = 0;
        double odd_sum = 0;
        for(int i = 0; i<=n;i++){
            if(i%2 == 0){
                even_sum +=i;
            }
            else{
                odd_sum +=i;
            }

        }
        System.out.println(even_sum);
        System.out.println(odd_sum);
    
    }
    
}
