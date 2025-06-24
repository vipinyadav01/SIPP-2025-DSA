package Palindrome;
public class Palindromic2 {
    public static void main(String[] args) {
        String s = "cbcaba";
        System.out.println("All palindromic substrings in '" + s + "':");
        
        for (int start = 0; start < s.length(); start++) {
            for (int end = start; end < s.length(); end++) {
                String substr = s.substring(start, end + 1);
                if (isPalindrome(substr)) {
                    System.out.println(substr);
                }
            }
        }
    }
    
    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
