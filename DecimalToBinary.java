
public class DecimalToBinary {
    public static void DecimalToBin(int n){
        String str = Integer.toBinaryString(n);
        System.out.println(str);
        
    }
    public static void BinaryToDec(String a){
        int ans = 0;
        for(int i=a.length()-1; i>=0;i--){
            if(a.charAt(i) - '0'== 1 ){
                ans += Math.pow(2, (a.length()) - 1 - i);
            }
        }
        System.out.println(ans);

        
    }
    public static void main(String[] args) {
        DecimalToBin(10);
        BinaryToDec("1010");
    }
    
}
