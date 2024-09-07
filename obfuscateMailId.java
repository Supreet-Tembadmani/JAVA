/*
 Given the email id as input, the program should obfuscate the id as follows:
1) For the given mail id, the part that comes before @ is referred to as the first part. If there is no first @ character, the mail id is invalid.
2) If the first part of the email id is less than or equal to 5 characters in length, replace all characters in the first part with *
3) If the first of the email id is greater than 5 characters in length, print the first 3 characters as it is and replace the remaining characters of the first part with *
4) If the email id is invalid, print Invalid Input.
Example 1: Input : abc@gmail.com Output : ***@gmail.com
 */

public class obfuscateMailId {
    public static void obfuscateMail(String str){
        int end=0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='@'){
                end = i;
            }

        }
        String n = str.substring(0,end);
        int l = n.length();
        if(l<5){
            System.out.println("*".repeat(l) + "@gmail.com");
        }
        else{
            System.out.println(n.substring(0, 3) + "*".repeat(l-3) + "@gmail.com");
        }
    }
    public static void main(String[] args) {
        obfuscateMail("abcdefghi@gmail.com");
    }
}
