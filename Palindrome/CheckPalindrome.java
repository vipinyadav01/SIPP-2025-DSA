package Palindrome;
public class CheckPalindrome {
    public static boolean isPalindrome(String str) {
        // Handle empty strings and single character strings
        if (str == null) return false;
        if (str.length() <= 1) return true;
        
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

    public static void main(String[] args) {
        String[] testStrings = "racecar,radar,level,hello".split(",");
        
        for (String word : testStrings) {
            if (isPalindrome(word)) {
                System.out.println(word + " is a palindrome.");
            } else {
                System.out.println(word + " is not a palindrome.");
            }
        }
    }
}
