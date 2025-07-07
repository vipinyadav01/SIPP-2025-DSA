public class Path {
    public static void main(String[] args) {
        int n = 4; 
        String s = ""; 
        
        paths(n, s);
    }
    
    public static void paths(int n, String s) {
        if (n == 0) {
            System.out.println(s);
            return;
        }
        
        if (n < 0) {
            return;
        }

        if (n >= 1) {
            paths(n - 1, s + "1");
        } 
        if (n >= 2) {
            paths(n - 2, s + "2");
        }
        if (n >= 3) {
            paths(n - 3, s + "3");
        }
    }
}
