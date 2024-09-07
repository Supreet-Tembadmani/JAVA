//package Bit_Manipulation;

public class Bit_test {
    public static void chk_evn_odd(int n){
        
        
        //System.out.println(Integer.toBinaryString(n).length());
        

        if((n&1) == 0){
            System.out.println("even");

        }
        else{System.out.println("odd");}
    }

    public static void main(String[] args) {
        chk_evn_odd(79);
        
    }
    
}
