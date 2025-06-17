// Find all pairs in an array that sum to a given target value
import java.util.HashSet;

public class FindAllPairs {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 8 };
        int targetSum = 7;

        System.out.println("Pairs that sum to " + targetSum + ":");
        findPairsWithSum(arr, targetSum);
    }

    public static void findPairsWithSum(int[] arr, int targetSum) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            int complement = targetSum - num;
            if (seen.contains(complement)) {
                System.out.println(complement + "," + num);
            }
            seen.add(num);
        }
    }
}