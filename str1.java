

/*
 * Question 1 : Count how many times lowercase vowels occurred in a String entered by the
user.
 */
public class str1 {
    public static int count_lowercase_vowels(String s){
        
        int count = 0;
        char [] vowels = {'a','e','i','o','u'};
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'o' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'u' ){
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        String str = "Supreet";
        System.out.println(count_lowercase_vowels(str));
    }
    
}
