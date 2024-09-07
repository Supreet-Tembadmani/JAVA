/*
 * Question 4 : Determine if 2 Strings are anagrams of each other.
What are anagrams?
If two strings contain the same characters but in a different order, they can be
 said to be anagrams. Consider race and care. In this case, race's characters can be
  formed into a study, or care's characters can be formed into race. 
  Below is a java program to check if two strings are anagrams or not.
 */
public class str2 {
    public static boolean anagrams(String a, String b){
        char[] one = a.toCharArray();
        char[] two = b.toCharArray();
        boolean flag = false;
        for(int i = 0; i< a.length();i++){
            flag = false;
            for(int j = 0; j< b.length();j++){
                if(a.charAt(i)== b.charAt(j)){
                    flag = true;
                }
            }
        }
        return flag;
        
        
    }
    public static void main(String[] args) {
        String one = "ritika";
        String two = "akitir";
        System.out.println(anagrams(one, two));
    }
    
}
