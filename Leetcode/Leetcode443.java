//String Comparision
public class Leetcode443 {
    public int compress(char[] chars) {
        int k = 0, n = chars.length;
        for (int i = 0, j = i + 1; i < n;) {
            while (j < n && chars[j] == chars[i]) {
                ++j;
            }
            chars[k++] = chars[i];
            if (j - i > 1) {
                String cnt = String.valueOf(j - i);
                for (char c : cnt.toCharArray()) {
                    chars[k++] = c;
                }
            }
            i = j;
        }
        return k;
    }

    public static void main(String[] args) {
        Leetcode443 solution = new Leetcode443();
        char[] chars1 = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int len1 = solution.compress(chars1);
        System.out.println(len1); // Output: 6
        System.out.println(new String(chars1, 0, len1)); // Output: a2b2c3

        char[] chars2 = {'a'};
        int len2 = solution.compress(chars2);
        System.out.println(len2); // Output: 1
        System.out.println(new String(chars2, 0, len2)); // Output: a
    }
}

