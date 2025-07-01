import java.util.*;

public class ReverseArrayandFilterValue {
     public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        Collections.reverse(arr);
        arr.removeIf(num -> num == 5);
        System.out.println(arr);
    }
    
}
