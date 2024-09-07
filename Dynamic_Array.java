import java.util.*;
public class Dynamic_Array {
    
    public static ArrayList<Integer> func(int pos, int val){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5); // Adds 5 at index 0
        a.add(10); // Adds 10 at index 1
        a.add(15);
        a.add(3,1);
        
        a.add(pos, val);
        return a;
    }

    public static void main(String[] args) {
        System.out.println(func(4, 3));
    }
    
}
