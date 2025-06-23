//print the vowels in a string  where s = "Hello World"
public class Vowel {
    public static void main(String[] args) {
        String s = "Hello World";
        String vowels = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isVowel(c)) {
                vowels += c + " ";
            }
        }

        System.out.println("Vowels in the string: " + vowels.trim());
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    
}
