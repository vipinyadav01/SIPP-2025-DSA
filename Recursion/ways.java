public class ways {
    public static void main(String[] args) {
        int n = 4; 
        System.out.println("Number of ways to climb " + n + " stairs: " + countWays(n));
        System.out.println("All possible paths:");
        findPaths(n, "");
    }                  
    
    public static int countWays(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1; 
        }
        
        return countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
    }
    
    public static void findPaths(int n, String path) {
        if (n < 0) {
            return;
        }
        if (n == 0) {
            System.out.println(path);
            return;
        }
        
        findPaths(n - 1, path + "1 "); // Take 1 step
        findPaths(n - 2, path + "2 "); // Take 2 steps
        findPaths(n - 3, path + "3 "); // Take 3 steps
    }
}