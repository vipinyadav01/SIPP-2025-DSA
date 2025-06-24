package Palindrome;
// check the count of charecters in a string and s = "abcdab"
public class checkcount {
    public static void main(String[] args) {
        String s = "abcdab";
        int[] count = new int[256]; 

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println((char)i + ": " + count[i]);
            }
        }
    }
    
}
