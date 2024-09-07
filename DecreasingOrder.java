
public class DecreasingOrder {

    public static void dec(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        dec(n-1);

    }
    public static void asc(int n){
        if(n == 0){
            return;
        }
        asc(n-1);
        System.out.println(n);
        

    }
    public static void main(String[] args) {
        asc(5);
    }
}