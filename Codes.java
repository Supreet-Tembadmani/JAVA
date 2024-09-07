
public class Codes {
    public static int SumOfNaturslNumbers(int n){
        if(n == 0){
            return 0;
        }
        return n + SumOfNaturslNumbers(n-1);

    }
    public static int Fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);

    }
    public static Boolean ArraySorted(int [] n, int i){
        
        if(i == n.length-1){
            return true;
        }
        if(n[i]<n[i+1]){
            return ArraySorted(n, i+1);
             
        }
        else{
            return false;
        }

    }
    public static int ElementFirstOccurance(int [] n, int i,int key){
        if(i == n.length){
            return -1;
        }
        if(n[i] == key){
            return i;
        }
        return ElementFirstOccurance(n, i+1, key);
        

    }
    public static void main(String[] args) {
        int [] n = {1,2,3,4,5};
        System.out.println(ElementFirstOccurance(n,0,9));
    }
}
