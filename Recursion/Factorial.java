public class Factorial {
    
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " is " + fact(n));
    }
    
    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
         
        int sp = fact(n - 1);
        int am = n * sp;
        return am;
    }
}
