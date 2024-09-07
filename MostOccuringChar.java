import java.util.*;

public class MostOccuringChar {
    public static char MostOccurChar(String str){
        HashMap<Character, Integer> h = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            if(h.containsKey(str.charAt(i))){
                h.put(str.charAt(i), h.get(str.charAt(i))+1);

            }
            else{
                h.put(str.charAt(i), 1);
            }
        }
        char maxKey = ' ';
        int maxValue = Integer.MIN_VALUE;

// Iterate through the keys
        for (Character key : h.keySet()) {
            int value = h.get(key);  // Get the value for the current key
            if (value > maxValue) {
                maxValue = value;
                maxKey = key; 
    }
}
        return maxKey;


    }
    public static void main(String[] args) {
        System.out.println(MostOccurChar("Happy coding"));
    }
    
}
