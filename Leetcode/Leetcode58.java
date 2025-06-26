public class Leetcode58 {

    public int lengthOfLastWord(String s) {
        // Trim trailing spaces
        s = s.trim();
        
        // Find the position of the last space
        int lastSpaceIndex = s.lastIndexOf(' ');
        
        // If no space is found, the entire string is one word
        if (lastSpaceIndex == -1) {
            return s.length();
        }
        
        // Return the length of the last word (characters after the last space)
        return s.length() - lastSpaceIndex - 1;
    }
    
    // For testing
    public static void main(String[] args) {
        Leetcode58 solution = new Leetcode58();
        System.out.println(solution.lengthOfLastWord("Hello World"));  // Output: 5
        System.out.println(solution.lengthOfLastWord("   fly me   to   the moon  "));  // Output: 4
        System.out.println(solution.lengthOfLastWord("luffy is still joyboy"));  // Output: 6
    }
}
