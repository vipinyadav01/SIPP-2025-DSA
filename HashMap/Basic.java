//string s ="abcdeabcabc" do by using the hashmap
import java.util.HashMap;
import java.util.Map;
public class Basic {
    public static void main(String[] args) {
        String s = "abcdeabcabc";
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character counts: " + charCountMap);
    }
}