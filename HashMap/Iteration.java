//iterate by using the keyset() method 
// and print the key and value pairs
// This code iterates through a string, counts the occurrences of each character,
import java.util.HashMap;

public class Iteration {
     public static void main(String[] args) {
        String s = "abcdeabc";  
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);  
            } else {
                map.put(ch, 1);
            }
        }

        for (Character key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
