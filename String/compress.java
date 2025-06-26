public class compress {
    public String compress(String s) {
        if (s == null || s.isEmpty()) return "";
        
        StringBuilder result = new StringBuilder();
        char current = s.charAt(0);
        int count = 1;
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == current) {
                count++;
            } else {
                result.append(current).append(count);
                current = s.charAt(i);
                count = 1;
            }
        }
                result.append(current).append(count);
        
        return result.toString();
    }

    public static void main(String[] args) {
        compress solution = new compress();
        System.out.println(solution.compress("aaabbbds")); 
    }
}
