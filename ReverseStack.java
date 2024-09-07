import java.util.*;
public class ReverseStack {
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        s.push(top);

    }
    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.err.println(s.pop());
        }

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(4);
        s.push(5);
        s.push(1);
        reverse(s);
        printStack(s);

    }
}