public class Fibonacci {

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Recursive tree for Fibonacci(" + n + "):");
        int ans = fib(n);
        System.out.println("Fibonacci of " + n + " is: " + ans);
    }
    
    public static int fib(int n) {
        System.out.println("Computing fib(" + n + ")");
        
        if (n == 0 || n == 1) {
            System.out.println("Base case: fib(" + n + ") = " + n);
            return n;
        }

        int sp1 = fib(n - 1);
        int sp2 = fib(n - 2);
        
        System.out.println("fib(" + n + ") = fib(" + (n-1) + ") + fib(" + (n-2) + ") = " + sp1 + " + " + sp2 + " = " + (sp1 + sp2));
        return sp1 + sp2;
    }
}